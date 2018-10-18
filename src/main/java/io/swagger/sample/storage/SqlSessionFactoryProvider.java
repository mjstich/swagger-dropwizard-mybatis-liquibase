package io.swagger.sample.storage;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.db.ManagedDataSource;
import io.dropwizard.setup.Environment;
import io.swagger.sample.DataService;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * A provider of a single SqlSessionFactory object.
 */
@Singleton
public class SqlSessionFactoryProvider implements Provider<SqlSessionFactory> {
    private final SqlSessionFactory factory;

    /**
     *
     * @param dataSourceFactory
     * @param environment
     * @throws ClassNotFoundException
     */
    @Inject
    public SqlSessionFactoryProvider(DataSourceFactory dataSourceFactory, /* ServiceConfiguration configuration, */
                                     Environment environment) throws ClassNotFoundException {
        String dataSourceName = "sample-datasource";

        ManagedDataSource ds = dataSourceFactory.build(environment.metrics(), dataSourceName);
        SqlSessionFactory sessionFactory = new MyBatisFactory()
                .build(environment, dataSourceFactory, ds, dataSourceName);

        Configuration mybatisConf = sessionFactory.getConfiguration();

        // Should we show database logging?
        //if (configuration.isMybatisLoggingEnabled()) {
        //    org.apache.ibatis.logging.LogFactory.useStdOutLogging();
        //}

        //mybatisConf.getTypeHandlerRegistry().register(DateTimeTypeHandler.class);
        //mybatisConf.getTypeHandlerRegistry().register(UUIDTypeHandler.class);
        //mybatisConf.getTypeHandlerRegistry().register(GroupCriteriaTypeHandler.class);

        DataService.getModelClasses().forEach(mybatisConf.getTypeAliasRegistry()::registerAlias);
        DataService.getMapperClasses().forEach(mybatisConf::addMapper);

        factory = sessionFactory;
    }

    @Override
    public SqlSessionFactory get() {
        return factory;
    }
}
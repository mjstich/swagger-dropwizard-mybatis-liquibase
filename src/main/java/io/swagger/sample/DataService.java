package io.swagger.sample;

import com.google.common.collect.ImmutableList;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Names;
import io.dropwizard.setup.Environment;
import io.swagger.sample.db.mapper.PetMapper;
import io.swagger.sample.model.Pet;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;

import io.swagger.sample.storage.DataSourceProvider;
import io.swagger.sample.storage.SqlSessionFactoryProvider;

import java.util.Collection;
import java.util.List;

public class DataService {

    /**
     * Returns all the model classes used by MyBatis.
     */
    public static List<Class<?>> getModelClasses() {
        return ImmutableList.of(Pet.class);
    }

    /**
     * Returns all the mapper classes used by MyBatis
     */
    public static List<Class<?>> getMapperClasses() {
        return ImmutableList.of(PetMapper.class);
    }

    /**
     * Returns a new Guice injector with all objects required by appointments data service.
     * @param environment
     * @return
     * @throws ClassNotFoundException
     */
    public static Injector createInjector(SwaggerSampleConfiguration configuration, Environment environment)
            throws ClassNotFoundException {
        MJSBatisModule mbm = new MJSBatisModule(getModelClasses(), getMapperClasses());
        return Guice.createInjector(
                new ServiceModule(configuration, environment),
                buildMyBatisModule());
    }

    private static MyBatisModule buildMyBatisModule() {
        return new MyBatisModule() {
            @Override
            protected void initialize() {
            bindDataSourceProviderType(DataSourceProvider.class);
            bindTransactionFactoryType(JdbcTransactionFactory.class);
            useSqlSessionFactoryProvider(SqlSessionFactoryProvider.class);

            // needed so mybatis-guice does not throw an exception but not used since we create our own
            // SqlSessionFactory
            bindConstant().annotatedWith(Names.named("mybatis.environment.id")).to("mybatis");

            addSimpleAliases(getModelClasses());
            addMapperClasses(getMapperClasses());
            }
        };
    }

}

class MJSBatisModule extends MyBatisModule {

    final Collection<Class<?>> aliases;
    final Collection<Class<?>> mappers;

    public MJSBatisModule(final Collection<Class<?>> aliases, final Collection<Class<?>> mappers) {
        this.aliases = aliases;
        this.mappers = mappers;
    }

    protected void initialize() {
        this.bindDataSourceProviderType(DataSourceProvider.class);
        this.bindTransactionFactoryType(JdbcTransactionFactory.class);

        useSqlSessionFactoryProvider(SqlSessionFactoryProvider.class);

        // needed so mybatis-guice does not throw an exception but not used since we create our own
        // SqlSessionFactory
        bindConstant().annotatedWith(Names.named("mybatis.environment.id")).to("mybatis");

        addSimpleAliases(aliases);
        addMapperClasses(mappers);
    }
}

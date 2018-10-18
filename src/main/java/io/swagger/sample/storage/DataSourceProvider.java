package io.swagger.sample.storage;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import io.dropwizard.setup.Environment;

import javax.sql.DataSource;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.setup.Environment;

import javax.sql.DataSource;

/**
 * Provider for DataSource objects.
 */
@Singleton
public class DataSourceProvider implements Provider<DataSource> {

    private final DataSource datasource;

    /**
     *
     * @param factory
     * @param environment
     * @throws ClassNotFoundException
     */
    @Inject
    public DataSourceProvider(DataSourceFactory factory, Environment environment) throws ClassNotFoundException {
        datasource = factory.build(environment.metrics(), "sample-datasource");
    }

    @Override
    public DataSource get() {
        return datasource;
    }
}

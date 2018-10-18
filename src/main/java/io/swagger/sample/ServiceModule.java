package io.swagger.sample;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.setup.Environment;


/**
 * Guice module providing various objects used by the appointments data service.
 */
public class ServiceModule extends AbstractModule {

    private final SwaggerSampleConfiguration configuration;
    private final Environment environment;

    /**
     * @param environment Dropwizard environment
     */
    public ServiceModule(SwaggerSampleConfiguration configuration, Environment environment) {
        this.configuration = configuration;
        this.environment = environment;
    }

    //@Override
    //protected void configure() {
    //}

    /**
     * Dropwizard Environment provider.
     *
     * @return
     */
    @Provides
    public Environment provideEnvironment() {
        return environment;
    }

    /**
     * DataSourceFactory provider
     *
     * @return
     */
    @Provides
    public DataSourceFactory provideDataSourceFactory() {
        return configuration.getDataSourceFactory();
    }

    /**
     * Service Configuration provider
     *
     * @return
     */
    @Provides
    public SwaggerSampleConfiguration provideServiceConfiguration() {
        return configuration;
    }
}
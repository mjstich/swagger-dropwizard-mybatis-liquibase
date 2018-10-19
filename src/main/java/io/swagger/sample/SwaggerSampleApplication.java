package io.swagger.sample;

import com.google.inject.Injector;
import io.dropwizard.db.DataSourceFactory;
import io.swagger.jaxrs.config.*;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.config.*;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.sample.resource.ProductResource;
import org.eclipse.jetty.servlets.CrossOriginFilter;
import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import java.util.EnumSet;

import io.dropwizard.Application;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import io.swagger.sample.resource.PetResource;

public class SwaggerSampleApplication extends Application <SwaggerSampleConfiguration> {

  private Injector injector;

  public static void main(String[] args) throws Exception {
    new SwaggerSampleApplication().run(args);
  }

  @Override
  public void initialize(Bootstrap<SwaggerSampleConfiguration> bootstrap) {
      super.initialize(bootstrap);
      // Setup serving of resources for the application

      // Setup Data Migrations for Liquibase
      bootstrap.addBundle(new MigrationsBundle<SwaggerSampleConfiguration>() {
          @Override
          public DataSourceFactory getDataSourceFactory(SwaggerSampleConfiguration configuration) {
              return configuration.getDataSourceFactory();
          }
      });
  }

  public DataSourceFactory getDataSourceFactory(SwaggerSampleConfiguration configuration) {
      return configuration.getDataSourceFactory();
  }

  @Override   
  public String getName() {
      return "swagger-sample";
  }

  @Override
  public void run(SwaggerSampleConfiguration configuration, Environment environment) throws Exception {

      //environment.jersey().register(new ApiListingResource());
      //environment.jersey().register(new PetResource());
      environment.getObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
      
      // Enable CORS headers
      final FilterRegistration.Dynamic cors =
          environment.servlets().addFilter("CORS", CrossOriginFilter.class);

      // Configure CORS parameters
      cors.setInitParameter("allowedOrigins", "*");
      cors.setInitParameter("allowedHeaders", "X-Requested-With,Content-Type,Accept,Origin");
      cors.setInitParameter("allowedMethods", "OPTIONS,GET,PUT,POST,DELETE,HEAD");

      // Add URL mapping
      cors.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");

      BeanConfig config = new BeanConfig();
      config.setTitle("Swagger sample app");
      config.setVersion("1.0.0");
      config.setResourcePackage("io.swagger.sample.resource");
      config.setScan(true);

      injector = DataService.createInjector(configuration, environment);

      environment.jersey().register(injector.getInstance(ApiListingResource.class));
      environment.jersey().register(injector.getInstance(PetResource.class));
      environment.jersey().register(injector.getInstance(ProductResource.class));

  }
}

package org.example.foobarautoconfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
public class Autoconfiguration {
    @Bean
    @ConditionalOnMissingBean
    public FilterRegistrationBean<FooBarFilter> fooBarFilter() {
        FilterRegistrationBean<FooBarFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new FooBarFilter());
        registration.setOrder(1);
        return registration;
    }
}

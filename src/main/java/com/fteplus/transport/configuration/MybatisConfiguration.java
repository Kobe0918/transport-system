package com.fteplus.transport.configuration;


import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfiguration {

    @Bean
    public ConfigurationCustomizer mybatis(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
                configuration.setUseGeneratedKeys(true);
            }
        };
    }

}

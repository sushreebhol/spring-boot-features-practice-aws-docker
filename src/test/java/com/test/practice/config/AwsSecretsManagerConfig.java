package com.test.practice.config;

import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import io.awspring.cloud.secretsmanager.AwsSecretsManagerPropertySource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;

@Configuration
public class AwsSecretsManagerConfig {

    @Bean
    public AWSSecretsManager awsSecretsManager() {
        return AWSSecretsManagerClientBuilder.standard().build();
    }

    @Bean
    public PropertySource<?> awsSecretsManagerPropertySource(Environment environment, AWSSecretsManager awsSecretsManager) {
        return new AwsSecretsManagerPropertySource("aws-secrets", awsSecretsManager);
    }
}




import io.awspring.cloud.secretsmanager.SecretsManagerPropertySource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;

@Configuration
public class AwsSecretsManagerConfig {

    @Bean
    public PropertySource<?> awsSecretsManagerPropertySource(Environment environment, SecretsManagerClient secretsManagerClient) {
        return new SecretsManagerPropertySource(environment, secretsManagerClient);
    }
}

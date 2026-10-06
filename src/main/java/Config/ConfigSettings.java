package Config;

import main.VoidEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigSettings {

    @Bean
    @Primary
    VoidEntity entity() {
        VoidEntity v = new VoidEntity();
        v.setName("Bran");
        return v;
    }
}

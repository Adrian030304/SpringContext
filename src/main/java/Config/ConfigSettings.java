package Config;

import main.VoidEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration // defines the class a spring configuration class to add objects in spring context
public class ConfigSettings {

    @Bean
    @Primary
    VoidEntity entity() {
        VoidEntity v = new VoidEntity();
        v.setName("Bran");
        return v;
    }

    @Bean(name = "alty")
    VoidEntity entityAlternative() {
        VoidEntity v = new VoidEntity();
        v.setName("Valto");
        return v;
    }
}

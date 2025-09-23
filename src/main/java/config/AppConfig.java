package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.ArtistService;

@Configuration
//Chỉ ra 1 cách tường minh, là Spring sẽ scan (quét) các package con nào để quản lý Bean
@ComponentScan(basePackages = {"service", "repositories"})
public class AppConfig {

}

//Sping Cloud Config
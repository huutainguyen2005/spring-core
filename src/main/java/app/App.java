package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.ArtistService;
import config.AppConfig;

//IoC = Inversion of Control --> IoC Container
//DI  = Dependency Injection

public class App {
    public static void main(String[] args) {

        //Muốn lấy danh sách các artists
//        ArtistService artistService = new ArtistService();
//        artistService.getAllArtists();

        try (AnnotationConfigApplicationContext ctx =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {
            ArtistService s = ctx.getBean(ArtistService.class);
            s.getAllArtists();
        }
    }
}

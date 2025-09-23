package repositories;

import org.springframework.stereotype.Component;

@Component
public class ArtistRepository {

    //CRUD
    public void getAll() {
        System.out.println("Artist repo called: get all artists");
    }

    //Create
    public void create() {
        System.out.println("Artist repo called: create artist");
    }

}

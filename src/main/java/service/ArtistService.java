package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ArtistRepository;

@Service
public class ArtistService {

    //Dev  đang quản lý dependency giữa ArtistService va ArtistRepository
    //private ArtistRepository artistRepository = new  ArtistRepository();

    //Giao việc quản lý dependency cho Spring
    //Khai báo 1 phụ thuộc (dependency)

    //1st way: Sử dụng DI bằng Constructor - khuyến khích sử dụng cho lâu dài
    private ArtistRepository artistRepository;
    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    //2nd way; Sử dụng Autowired - không khuyến khích, chỉ dùng để kiểm tra nhanh
    //@Autowired
    //private ArtistRepository artistRepository;

    //3rd way: ...

    //Sử dụng Bean
    public void getAllArtists() {
        System.out.println("Artist service called: get all artists");
        artistRepository.getAll();  //NPE = NullPointerException

    }


}

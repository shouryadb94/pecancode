package vod.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vod.model.Movie;

import java.util.List;

/**
 * Created by 610995 on 2/27/2017.
 */

public interface MovieRepository extends MongoRepository<Movie,String>{
    List<Movie> findByDateAndGenre(String date,String genre);
    List<Movie> findByGenre(String genre);
    List<Movie> findByDate(String date);
}

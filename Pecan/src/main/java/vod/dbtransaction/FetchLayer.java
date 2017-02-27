package vod.dbtransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vod.model.Movie;
import vod.repository.MovieRepository;

import java.util.List;

/**
 * Created by 610995 on 2/27/2017.
 */

@Service
public class FetchLayer {
    @Autowired
    protected MovieRepository rep;

    public List<Movie> returnAll(){
        return rep.findAll();
    }

    public List<Movie> returnSortedByDateAndGenre(String a, String b){
        return rep.findByDateAndGenre(a, b);
    }

    public List<Movie> returnSortedByGenre(String Genre){
        return rep.findByGenre(Genre);
    }

    public List<Movie> returnSortedByYear(String year) {
        return rep.findByDate(year);
    }
}


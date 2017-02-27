package vod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vod.dbtransaction.FetchLayer;
import vod.model.Movie;
import vod.pager.PagingLayer;

import java.util.List;

/**
 * Created by 610995 on 2/27/2017.
 */
@RestController
public class MovieController {
    @Autowired
    private FetchLayer fet;

    @Autowired
    private PagingLayer pg;

    @RequestMapping(value="/all",method= RequestMethod.GET)
    public List<Movie> all(){
        return fet.returnAll();
    }

    @RequestMapping(value="/sort/genre={genre}",method=RequestMethod.GET)
    public List<Movie> sortedByGenre(@PathVariable String genre){
        return fet.returnSortedByGenre(genre);
    }

    @RequestMapping(value="/sort/date={year}",method=RequestMethod.GET)
    public List<Movie> sortedByYear(@PathVariable String year){
        return fet.returnSortedByYear(year);
    }

    @GetMapping("/{year}/{genre}")
    public List<Movie> sorted(@PathVariable String year,@PathVariable String genre){
        return fet.returnSortedByDateAndGenre(year, genre);
    }

    @GetMapping("/{year}/{genre}/{page}/{size}")
    public List<Movie> pagedAndSorted(@PathVariable String year,@PathVariable String genre,@PathVariable Integer page,@PathVariable Integer size){
        return pg.paged(fet.returnSortedByDateAndGenre(year, genre),page,size);
    }
}

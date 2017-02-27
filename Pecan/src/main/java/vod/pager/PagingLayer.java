package vod.pager;

import org.springframework.stereotype.Service;
import vod.model.Movie;

import java.util.List;

/**
 * Created by 610995 on 2/27/2017.
 */

@Service
public class PagingLayer {
    public List<Movie> paged(List<Movie> pagedList, Integer a, Integer b){
        return pagedList.subList(a-1, (a-1)+b);
    }
}

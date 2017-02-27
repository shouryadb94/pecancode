package vod.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by 610995 on 2/27/2017.
 */
@Document(collection = "movie-list")
public class Movie {
    @Id
    private String movie_id;

    private String moviename;
    private String genre;
    private String date;

    public Movie(){}


    public Movie(String movie_id, String moviename, String genre, String date) {
        this.movie_id = movie_id;
        this.moviename = moviename;
        this.genre = genre;
        this.date = date;
    }

    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

package org.example;

import org.example.models.Movie;
import org.example.services.Service;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {

        Service service = new Service(ObjectDBUtil.getEntityManagerFactory());

        Movie m = new Movie();
        m.setTitle("The Godfather");
        m.setYear(2017);
        Genre g = new Genre();
        g.setGenre("Romantic");
        m.getGenres().add(g);
        m.getGenres().add(g);
        m.setDirector("Yo");

        service.save(m);
        service.getMovies().forEach(System.out::println);

        System.out.println(service.num_director("Yo"));
    }
}
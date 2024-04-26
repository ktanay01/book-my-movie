package com.tanay.bookmymovie.repository;


import com.tanay.bookmymovie.enums.Genre;
import com.tanay.bookmymovie.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

	boolean existsByTitle(String title);

	public Movie findByTitle(String title);

	public List<Movie> findByGenre(Genre genre);
}
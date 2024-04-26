package com.tanay.bookmymoview.repository;


import com.tanay.bookmymoview.enums.Genre;
import com.tanay.bookmymoview.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

	boolean existsByTitle(String title);

	public Movie findByTitle(String title);

	public List<Movie> findByGenre(Genre genre);
}
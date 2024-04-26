package com.tanay.bookmymovie.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tanay.bookmymovie.model.Theater;


@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long> {

}
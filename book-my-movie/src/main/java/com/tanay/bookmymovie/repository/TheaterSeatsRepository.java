package com.tanay.bookmymovie.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tanay.bookmymovie.model.TheaterSeats;

@Repository
public interface TheaterSeatsRepository extends JpaRepository<TheaterSeats, Long> {

}
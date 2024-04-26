package com.tanay.bookmymoview.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tanay.bookmymoview.model.TheaterSeats;

@Repository
public interface TheaterSeatsRepository extends JpaRepository<TheaterSeats, Long> {

}
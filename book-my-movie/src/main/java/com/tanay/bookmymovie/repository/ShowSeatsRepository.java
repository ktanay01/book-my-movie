package com.tanay.bookmymovie.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tanay.bookmymovie.model.ShowSeat;

@Repository
public interface ShowSeatsRepository extends JpaRepository<ShowSeat, Long> {

}
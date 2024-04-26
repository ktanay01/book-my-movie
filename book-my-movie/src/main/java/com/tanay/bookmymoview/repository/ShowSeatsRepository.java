package com.tanay.bookmymoview.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tanay.bookmymoview.model.ShowSeat;

@Repository
public interface ShowSeatsRepository extends JpaRepository<ShowSeat, Long> {

}
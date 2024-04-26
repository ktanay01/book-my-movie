package com.tanay.bookmymovie.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tanay.bookmymovie.model.Ticket;


@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{

}
package com.tanay.bookmymoview.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tanay.bookmymoview.model.Theater;


@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long> {

}
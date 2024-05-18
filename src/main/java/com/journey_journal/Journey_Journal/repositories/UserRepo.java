package com.journey_journal.Journey_Journal.repositories;

import com.journey_journal.Journey_Journal.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}

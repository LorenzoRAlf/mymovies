package com.gfttraining.repositories;

import com.gfttraining.entities.UserMovie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserMovieRepository extends CrudRepository<UserMovie, Integer> {
    Optional<UserMovie> findByUsernameAndId(String username, String id);
}

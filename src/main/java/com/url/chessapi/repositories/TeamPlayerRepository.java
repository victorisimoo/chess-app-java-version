package com.url.chessapi.repositories;

import com.url.chessapi.models.TeamPlayer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamPlayerRepository extends CrudRepository<TeamPlayer, Long> {
}

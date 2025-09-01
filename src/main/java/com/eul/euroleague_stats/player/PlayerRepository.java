package com.eul.euroleague_stats.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    void deleteByPlayerName(String playerName);
    Optional<Player> findByPlayerName(String playerName);
    List<Player> findByTeamIgnoreCase(String team);
    List<Player> findByPlayerNameContainingIgnoreCase(String name);
}


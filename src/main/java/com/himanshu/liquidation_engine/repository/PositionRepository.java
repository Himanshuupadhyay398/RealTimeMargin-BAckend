package com.himanshu.liquidation_engine.repository;

import com.himanshu.liquidation_engine.entity.Position;
import com.himanshu.liquidation_engine.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PositionRepository extends JpaRepository<Position, Long> {

    List<Position> findByUser(User user);

    List<Position> findByInstrument(String instrument);

    Optional<Position> findByUserAndInstrument(User user, String instrument);
}

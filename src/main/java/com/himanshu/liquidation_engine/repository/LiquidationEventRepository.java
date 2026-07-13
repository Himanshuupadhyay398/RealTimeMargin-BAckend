package com.himanshu.liquidation_engine.repository;

import com.himanshu.liquidation_engine.entity.LiquidationEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LiquidationEventRepository extends JpaRepository<LiquidationEvent, Long> {

}

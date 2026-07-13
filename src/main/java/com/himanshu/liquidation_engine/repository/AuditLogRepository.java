package com.himanshu.liquidation_engine.repository;

import com.himanshu.liquidation_engine.entity.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {

}

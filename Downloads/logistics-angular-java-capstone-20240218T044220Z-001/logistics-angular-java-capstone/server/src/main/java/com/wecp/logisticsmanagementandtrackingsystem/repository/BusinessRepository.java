package com.wecp.logisticsmanagementandtrackingsystem.repository;


import com.wecp.logisticsmanagementandtrackingsystem.entity.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Long> {
    // Additional business-related query methods can be added here
}

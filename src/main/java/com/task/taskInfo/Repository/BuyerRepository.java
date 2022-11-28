package com.task.taskInfo.Repository;

import com.task.taskInfo.dao.BuyerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<BuyerInfo,Integer> {
}

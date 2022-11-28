package com.task.taskInfo.Repository;

import com.task.taskInfo.dao.BuyitemInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyItemRepository extends JpaRepository<BuyitemInfo,Integer> {
}

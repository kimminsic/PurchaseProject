package com.task.taskInfo.Repository;

import com.task.taskInfo.dao.BuyerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;



public interface BuyerRepository extends JpaRepository<BuyerInfo,Integer> {

    @Query(value = "select buyer_name,concat(substr(tel,1,10),'**',substr(tel,12,1)) as tel from buyer_info", nativeQuery = true)
    List<BuyerInfo> getList();
}

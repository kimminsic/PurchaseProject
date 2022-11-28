package com.task.taskInfo.Repository;

import com.task.taskInfo.dao.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, Integer> {
}

package com.task.taskInfo.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BuyerInfo {
    @Column(length = 30)
    private String buyerName;

    @Id
    @Column(length = 50)
    private String tel;
}

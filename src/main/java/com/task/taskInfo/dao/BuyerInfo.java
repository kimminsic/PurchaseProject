package com.task.taskInfo.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BuyerInfo {

    private String buyerName;

    @Id
    private String tel;
}

package com.task.taskInfo.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BuyerInfo {
    @Column(length = 30)
    @NonNull
    private String buyerName;

    @Id
    @Column(length = 50)
    private String tel;
}

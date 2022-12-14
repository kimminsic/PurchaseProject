package com.task.taskInfo.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
public class ProductInfo {

    @Id
    @Column(length = 50)
    private String itemName;

    @Column(length = 50)
    @NonNull
    private String price;

    @Column(length = 50)
    @NonNull
    private LocalDate register_date;

    @Column(length = 50)
    @NonNull
    private String company;

}

package com.task.taskInfo.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
public class ProductInfo {

    @Id
    private String itemName;

    private String price;

    private LocalDate register_date;

    private String company;

}

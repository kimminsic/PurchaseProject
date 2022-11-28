package com.task.taskInfo.dao;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class BuyitemInfo {


    @OneToOne
    @JoinColumn(name = "itemName", insertable = false, updatable = false)
    private ProductInfo ItemInfo;

    @OneToOne
    @JoinColumn(name = "tel", insertable = false, updatable = false)
    private BuyerInfo buyer;

    @Column(length = 50)
    private String price;

    @Column(length = 50)
    private String buyDate;

    @Id
    @Column(length = 50)
    private String buyNum;
}

package com.task.taskInfo.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class RegisCompany {

    @Id
    @Column(length = 50)
    public String companyName;

    @Column(length = 30)
    public String repreName;

    @Column(length = 50)
    public String tel;

}

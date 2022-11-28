package com.task.taskInfo.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class RegisCompany {

    @Id
    public String companyName;

    public String repreName;

    public String tel;

}

package com.task.taskInfo.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity
public class RegisCompany {

    @Id
    @Column(length = 50)
    public String companyName;

    @Column(length = 30)
    @NonNull
    public String repreName;

    @Column(length = 50)
    @NonNull
    public String tel;

}

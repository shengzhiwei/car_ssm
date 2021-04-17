package com.szw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Integer carid;
    private String carname;
    private Integer carcount;
    private String carcompany;
}

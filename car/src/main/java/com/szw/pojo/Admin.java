package com.szw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
   private Integer adminid;
   private String adminname;
   private String adminpassword;
}

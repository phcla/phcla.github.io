package com.sm.qy28.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class Employee {

  private Long employeeId;
  private String employeeName;
  private String employeeImg;
  private String employeeEmail;
  private String employeeDept;
  @JsonFormat(pattern = "YYYY-MM-dd")
  private java.util.Date employeeTime;


}

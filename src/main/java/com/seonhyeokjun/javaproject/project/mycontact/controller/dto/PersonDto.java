package com.seonhyeokjun.javaproject.project.mycontact.controller.dto;

import com.seonhyeokjun.javaproject.project.mycontact.domian.dto.Birthday;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PersonDto {
    private String name;
    private int age;
    private String hobby;
    private String bloodType;
    private String address;
    private LocalDate birthday;
    private String job;
    private String phoneNumber;
}

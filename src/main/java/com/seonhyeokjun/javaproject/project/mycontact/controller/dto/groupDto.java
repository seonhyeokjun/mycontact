package com.seonhyeokjun.javaproject.project.mycontact.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class groupDto {
    @NotBlank(message = "이름은 필수값입니다.")
    private String name;
}

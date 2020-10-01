package com.seonhyeokjun.javaproject.project.mycontact.domian;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Block {

    @Id
    @GeneratedValue
    private Long ID;

    @NonNull
    private String name;

    private String reason;

    private LocalDate starDate;

    private LocalDate endDate;
}

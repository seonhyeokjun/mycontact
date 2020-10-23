package com.seonhyeokjun.javaproject.project.mycontact.domian;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Grouppeople {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String description;

    @OneToMany
    @JoinColumn(name = "Grouppeople_id")
    private List<Person> personList;
}

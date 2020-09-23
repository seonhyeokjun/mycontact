package com.seonhyeokjun.javaproject.project.mycontact.repository;

import com.seonhyeokjun.javaproject.project.mycontact.domian.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    
}

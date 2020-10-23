package com.seonhyeokjun.javaproject.project.mycontact.repository;

import com.seonhyeokjun.javaproject.project.mycontact.domian.Grouppeople;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Grouppeople, Long> {
}

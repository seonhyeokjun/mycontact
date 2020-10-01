package com.seonhyeokjun.javaproject.project.mycontact.repository;

import com.seonhyeokjun.javaproject.project.mycontact.domian.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BlockRepository extends JpaRepository<Block, Long> {
}

package com.seonhyeokjun.javaproject.project.mycontact.service;

import com.seonhyeokjun.javaproject.project.mycontact.domian.Grouppeople;
import com.seonhyeokjun.javaproject.project.mycontact.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public List<Grouppeople> getAll(){
        return groupRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Grouppeople getGroup(Long id){
        return groupRepository.findById(id).orElse(null);
    }
}

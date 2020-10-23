package com.seonhyeokjun.javaproject.project.mycontact.controller;

import com.seonhyeokjun.javaproject.project.mycontact.domian.Grouppeople;
import com.seonhyeokjun.javaproject.project.mycontact.domian.Person;
import com.seonhyeokjun.javaproject.project.mycontact.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api/group")
@RestController
public class GroupController {
    @Autowired
    private GroupService groupService;

    @GetMapping
    public List<Grouppeople> getAll(){
        return groupService.getAll();  // Group 전체 정보 가져오기
    }

    @GetMapping("/{id}")
    public Grouppeople getGroup(@PathVariable Long id){
        return groupService.getGroup(id); // 특정 Group 정보 가져오기
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void postGroup(@RequestBody Object groupDto){    // Dto 구현필요
        // Group 생성하기
    }

    @PostMapping("/{id}")
    public void modifyGroup(@PathVariable Long id, String description){
        // Group description 수정하기
    }

    @GetMapping("/{id}/people")
    public List<Person> getPeopleInGroup(@PathVariable Long id){
        return null; // 특정 그룹의 Person 리스트 가져오기
    }

    @PutMapping("/{id}/person/{personId}")
    public void putPersonInGroup(@PathVariable Long id, @PathVariable Long personId){
        //  Person 정보를 Group 정보에 매핑하기
    }
}

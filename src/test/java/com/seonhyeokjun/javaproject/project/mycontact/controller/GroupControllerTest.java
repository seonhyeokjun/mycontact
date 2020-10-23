package com.seonhyeokjun.javaproject.project.mycontact.controller;

import com.seonhyeokjun.javaproject.project.mycontact.repository.GroupRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class GroupControllerTest {

    @Autowired
    private GroupRepository groupRepository;

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @BeforeEach
    void beforeEach(){
        mockMvc = MockMvcBuilders
                .webAppContextSetup(wac)
                .alwaysDo(print())
                .build();
    }

    @Test
    void getAll() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/api/group"))
                .andExpect(status().isOk());
    }

    @Test
    void getGroup() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/api/group/2"))
                .andDo(print())
                .andExpect(status().isOk());
    }

}
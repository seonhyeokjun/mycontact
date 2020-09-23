package com.seonhyeokjun.javaproject.project.mycontact.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
class HellowWorldControllerTest {

    @Autowired
    private HellowWorldController hellowWorldController;

    private MockMvc mockMvc;

    @Test
    void helloworld(){
//      System.out.println("test");
        System.out.println(hellowWorldController.helloworld());

        assertThat(hellowWorldController.helloworld()).isEqualTo("Helloworld");
    }

    @Test
    void mockMvcTest() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(hellowWorldController).build();

        mockMvc.perform(MockMvcRequestBuilders.get("/api/helloworld"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Helloworld"));
    }
}
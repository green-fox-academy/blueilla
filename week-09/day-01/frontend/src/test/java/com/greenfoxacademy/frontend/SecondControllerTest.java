package com.greenfoxacademy.frontend;

import com.greenfoxacademy.frontend.controller.SecondController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(SecondController.class)
public class SecondControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  // if an additional service layer is used
  // - meaning not all logic is added to the controller and you have Autowired fields in it -
  // then you have to mock out the service class like below
  // {
  //  "received": 15,
  //  "result": 30
  //}
  //@MockBean
  //private UserService userService;

  @Test
  public void doublingNumber_succesfull() throws Exception {
    mockMvc.perform(get("/doubling")
            .param("input", "5")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.received", is(5)))
            .andExpect(jsonPath("$.result", is(10) ));
  }

//  @Test
//  public void addNewUser_succesfull() throws Exception {
//    mockMvc.perform(post("/users")
//            .contentType(MediaType.APPLICATION_JSON)
//            .content("{\"email\": \"name@example.com\", \"password\": \"12345\"}"))
//            .andExpect(status().isOk())
//            .andExpect(content().contentType(contentType))
//            .andExpect(jsonPath("$.result", is("success")))
//            .andExpect(jsonPath("$.message", is("User is added")));
//  }


  @Test
  public void doublingNumber_succesfull2() throws Exception {
    mockMvc.perform(get("/doubling")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide an input!") ));
  }

  @Test
  public void doUntilSum_successful() throws Exception {
    mockMvc.perform(post("/dountil/sum")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": \"5\"}"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.result", is(15)));
  }

  @Test
  public void doUntilFactor_successful() throws Exception {
    mockMvc.perform(post("/dountil/factor")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": \"5\"}"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.result", is(120)));
  }

  @Test
  public void doUntilErrorHandling_successful() throws Exception {
    mockMvc.perform(post("/dountil/fact")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": \"5\"}"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a number!")));
  }

  @Test
  public void appendA_succesfull() throws Exception {
    mockMvc.perform(get("/appenda/kuty")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.appended", is("kutya") ));
  }

//  @Test
//  public void greeter_successful() throws Exception {
//    mockMvc.perform(get("/greeter"))
//  }
}

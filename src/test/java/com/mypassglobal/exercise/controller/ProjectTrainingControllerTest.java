package com.mypassglobal.exercise.controller;

import com.mypassglobal.exercise.model.Qualification;
import com.mypassglobal.exercise.model.Worker;
import com.mypassglobal.exercise.service.ProjectTrainingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProjectTrainingController.class)
class ProjectTrainingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProjectTrainingService mockProjectTrainingService;

    @Test
    void testGetWorkersForProject1() throws Exception {
        // Setup
        // Configure ProjectTrainingService.getWorkerDetailsForProjectId(...).
        final Worker worker = new Worker();
        worker.setWorkerId("workerId");
        worker.setWorkerName("workerName");
        worker.setHref("href");
        final Qualification qualification = new Qualification();
        qualification.setId("Id");
        worker.setQualificationList(List.of(qualification));
        final List<Worker> workers = List.of(worker);
        when(mockProjectTrainingService.getWorkerDetailsForProjectId("projectId", "qualificationName",
                "trainingProgramName")).thenReturn(workers);

        // Run the test and verify the results
        mockMvc.perform(get("/mypass/v1/projects/{projectId}/workers", 0)
                        .header("Authorization", "Bearer " + obtainAccessToken("user1", "pass"))
                        .param("qualificationName", "qualificationName")
                        .param("trainingProgramName", "trainingProgramName")
                        .param("page", "0")
                        .param("perPage", "0")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{}", true));
    }

    @Test
    void testGetWorkersForProject1_ProjectTrainingServiceReturnsNoItems() throws Exception {
        // Setup
        when(mockProjectTrainingService.getWorkerDetailsForProjectId("projectId", "qualificationName",
                "trainingProgramName")).thenReturn(Collections.emptyList());

        // Run the test and verify the results
        mockMvc.perform(get("/mypass/v1/projects/{projectId}/workers", 0)
                        .param("qualificationName", "qualificationName")
                        .param("trainingProgramName", "trainingProgramName")
                        .param("page", "0")
                        .param("perPage", "0")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is5xxServerError())
                .andExpect(content().json("{}", true));
    }

    @Test
    void testGetWorkersForProject2() throws Exception {
        // Setup
        when(mockProjectTrainingService.getWorkerDetailsForProjectIdAndWorkerId("workerId"))
                .thenReturn(Optional.of("value"));

        // Run the test and verify the results
        mockMvc.perform(get("/mypass/v1/projects/workers/{workerId}", "workerId")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{}", true));
    }

    @Test
    void testGetWorkersForProject2_ProjectTrainingServiceReturnsAbsent() throws Exception {
        // Setup
        when(mockProjectTrainingService.getWorkerDetailsForProjectIdAndWorkerId("workerId"))
                .thenReturn(Optional.empty());

        // Run the test and verify the results
        mockMvc.perform(get("/mypass/v1/projects/workers/{workerId}", "workerId")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is5xxServerError())
                .andExpect(content().json("{}", true));
    }

    private String obtainAccessToken(String username, String password) throws Exception {

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("grant_type", "client_credentials");
        params.add("client_id", "mypass");
        params.add("client_secret", "y5wZSM4WlIli0PalmAQHOGPbGvNfOWmS");

        ResultActions result
                = mockMvc.perform(post("/oauth/token")
                        .params(params)
                        .with(SecurityMockMvcRequestPostProcessors.jwt())
                        .accept("application/json;charset=UTF-8"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"));

        String resultString = result.andReturn().getResponse().getContentAsString();

        JacksonJsonParser jsonParser = new JacksonJsonParser();
        return jsonParser.parseMap(resultString).get("access_token").toString();
    }
}

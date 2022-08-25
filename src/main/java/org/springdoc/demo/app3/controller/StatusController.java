package org.springdoc.demo.app3.controller;

import org.springdoc.demo.app3.dto.status.Status;
import org.springdoc.demo.app3.dto.status.StatusOk;
import org.springdoc.demo.app3.dto.status.StatusRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class StatusController {

    @PostMapping("/status")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "get status") })
    public ResponseEntity<Status> createTweets(@RequestBody StatusRequest statusRequest) {
        return ResponseEntity.ok(new StatusOk());
    }

}

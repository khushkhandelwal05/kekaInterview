package com.khush.kekaInterview.controller;


import com.khush.kekaInterview.constants.AlertEnums;
import com.khush.kekaInterview.dto.IncidentRequest;
import com.khush.kekaInterview.model.IncidentModel;
import com.khush.kekaInterview.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/alert")
    public ResponseEntity<IncidentModel> alertUser(
            @RequestBody IncidentRequest incidentRequest
            ) {
        // service layer
    }

    GetMapping("/incidents")
        public ResponseEntity<List<IncidentModel>> getByStatus(@RequestParam AlertEnums alertEnums) {
            return ResponseEntity.ok().body(notificationService.getAllIncidents(alertEnums));
        }
}

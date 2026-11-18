package com.khush.kekaInterview.service;


import com.khush.kekaInterview.constants.AlertEnums;
import com.khush.kekaInterview.dto.ExotelReq;
import com.khush.kekaInterview.dto.IncidentRequest;
import com.khush.kekaInterview.model.IncidentModel;
import com.khush.kekaInterview.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

@Service
public class NotificationService {

    NotificationRepository notificationRepository;
    ExecutorService executorService;
    HashMap<String, String> map;

    public IncidentModel sendAlert(IncidentRequest incidentRequest) {
        IncidentModel incidentModel = new IncidentModel();
        incidentModel.setStatus(TRIGGERED)
        if (incidentRequest.severity() == CRITICAL) {
            String message = String.format();
            ExotelReq req = new ExotelReq();
            executorService.callUser();
            incidentModel.setStatus(Notified)
        }
        return notificationRepository.save(incidentModel).orElseThrow(() -> new NotificationRepoException);
    }

    public List<IncidentModel> getAllIncidents(AlertEnums alertType) {
        return notificationRepository.getByStatus(alertType).orElseThrow(() -> new NotificationRepoException);
    }
}

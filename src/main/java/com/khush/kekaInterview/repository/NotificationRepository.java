package com.khush.kekaInterview.repository;


import com.khush.kekaInterview.constants.AlertEnums;
import com.khush.kekaInterview.model.IncidentModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Repository
public class NotificationRepository {

    private final ConcurrentHashMap<String, IncidentModel> incidentModelConcurrentHashMap;
    private final AtomicInteger atomicInteger;

    public NotificationRepository() {
        this.incidentModelConcurrentHashMap = new ConcurrentHashMap<>();
        atomicInteger = new AtomicInteger(1000);
    }

    public Optional<IncidentModel> save(IncidentModel incident) {
        String id = String.format("inc-%d", atomicInteger.getAndIncrement());
        incident.setIncidentId(id);
        incidentModelConcurrentHashMap.put(id, incident);
        return Optional.of(incident);
    }

    public Optional<List<IncidentModel>> getByStatus(AlertEnums alertType) {

        List<IncidentModel> list = incidentModelConcurrentHashMap.values().stream()
                .filter(val -> val.status() == alertType)
                .collect(Collectors.toCollection(ArrayList::new));

        return Optional.of(list);
    }
}

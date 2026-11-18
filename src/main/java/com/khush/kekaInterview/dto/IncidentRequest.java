package com.khush.kekaInterview.dto;

//{
//        "serviceId": "svc-payments",
//        "severity": "CRITICAL",
//        "title": "Payment gateway timeout",
//        "description": "p99 latency > 5s for 3 minutes",
//        "dedupKey": "payments-latency-001",
//        "timestamp": "2026-06-09T10:15:30Z"
//        }

public record IncidentRequest(
        String serviceId,
        String severity,
        String title,
        String description,
        String dedupKey,
        String timestamp
) {}

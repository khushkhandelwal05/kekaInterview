package com.khush.kekaInterview.external;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class ExotelService {
    private final RestClient restClient;

    public ExotelService(RestClient.Builder resclientBuilder) {
        SimpleClientHttpRequestFactory sp = new SimpleClientHttpRequestFactory();
        sp.setConnectTimeout();
        sp.setReadTimeout();
        this.restClient = resclientBuilder.baseUrl().build();
    }

    public ExotelResp callUser(ExotelRequest req) {
        // rest call
    }


}

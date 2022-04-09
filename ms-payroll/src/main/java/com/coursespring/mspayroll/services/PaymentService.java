package com.coursespring.mspayroll.services;

import ch.qos.logback.core.util.StringCollectionUtil;
import com.coursespring.mspayroll.entities.Payment;
import com.coursespring.mspayroll.entities.Worker;
import org.apache.logging.log4j.util.Strings;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Value("${ms-worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(final long workerId, final int days) {
        Map<String, String> urlWorker = new HashMap<>();
        urlWorker.put("id", ""+workerId);

        final Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, urlWorker);

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}

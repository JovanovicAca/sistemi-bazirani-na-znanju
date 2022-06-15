package com.example.EuroTraveler.service;

import com.example.EuroTraveler.facts.Request;
import com.example.EuroTraveler.facts.Response;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    private static Logger log = LoggerFactory.getLogger(RequestService.class);

    private final KieContainer kieContainer;

    @Autowired
    public RequestService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public Response getDrools(Request req) {
        Response res = new Response();

        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(req);
        kieSession.insert(res);
        kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println(res.getBudget());
        return res;
    }
}

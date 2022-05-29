package com.example.EuroTraveler.service;

import com.example.EuroTraveler.SampleAppService;
import com.example.EuroTraveler.facts.DTO.ResultDTO;
import com.example.EuroTraveler.facts.Item;
import com.example.EuroTraveler.facts.Query;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class QueryService {

    private static Logger log = LoggerFactory.getLogger(SampleAppService.class);

    private final KieContainer kieContainer;

    @Autowired
    public QueryService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public ResultDTO getDrools(ResultDTO result, Query query) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(query);
        kieSession.fireAllRules();
        kieSession.dispose();
        return result;
    }
}

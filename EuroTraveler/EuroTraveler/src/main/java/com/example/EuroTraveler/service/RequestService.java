package com.example.EuroTraveler.service;

import com.example.EuroTraveler.facts.Request;
import com.example.EuroTraveler.facts.Response;
import org.kie.api.KieServices;
import org.kie.api.runtime.Globals;
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

        KieServices ks = KieServices.Factory.get();
        KieContainer kieContainer = ks.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession();

//        kieSession.setGlobal("nazivPromenljive","vrednost");
//        kieSession.setGlobal("novaPromenljiva","vrednost");

//        kieSession.getAgenda().getAgendaGroup("imeGrupe").setFocus();

        kieSession.insert(req);
        kieSession.insert(res);
        kieSession.fireAllRules();

//        Object o = kieSession.getGlobal("nazivPromenljive"); // Vraca vrednost nakon izvrsenih droolsa

        kieSession.dispose();

        System.out.println(res.getBudget());
        return res;
    }
}

package com.example.EuroTraveler.service;

import com.example.EuroTraveler.facts.Enums.*;
import com.example.EuroTraveler.facts.Request;
import com.example.EuroTraveler.facts.Response;
import com.example.EuroTraveler.facts.Wrapper;
import org.kie.api.KieServices;
import org.kie.api.runtime.Globals;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

        Response res1 = new Response();
        res1.setId(1L);
        res1.setCityName("London");
        res1.setTransportType(TransportType.AIRPLANE);
        res1.setClimate(Climate.INTERMEDIATE);
        res1.setDistance(Distance.MEDIUM_LONG);
        res1.setAccommodationType(AccommodationType.HOTEL);
        res1.setAverageNightPrice(100.0);
        res1.setSeasonal(false);
        res1.setBudget(Budget.HIGH);

        Response res2 = new Response();
        res2.setId(2L);
        res2.setCityName("New York");
        res2.setTransportType(TransportType.AIRPLANE);
        res2.setClimate(Climate.INTERMEDIATE);
        res2.setDistance(Distance.VERY_LONG);
        res2.setAccommodationType(AccommodationType.HOTEL);
        res2.setAverageNightPrice(300.0);
        res2.setSeasonal(false);
        res2.setBudget(Budget.HIGH);

        Response res3 = new Response();
        res3.setId(3L);
        res3.setCityName("Sutomore");
        res3.setTransportType(TransportType.BUS);
        res3.setClimate(Climate.HOT);
        res3.setDistance(Distance.SHORT);
        res3.setAccommodationType(AccommodationType.HOSTEL);
        res3.setAverageNightPrice(30.0);
        res3.setSeasonal(true);
        res3.setSeason(Season.HOT);
        res3.setBudget(Budget.LOW);

        List<Response> responseList = new ArrayList<>(List.of(res1, res2, res3));
        Wrapper wrapper = new Wrapper(responseList);

        KieServices ks = KieServices.Factory.get();
        KieContainer kieContainer = ks.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession();

        kieSession.insert(req);
        kieSession.insert(res);
        kieSession.insert(wrapper);
        kieSession.fireAllRules();

        kieSession.dispose();

        return res;
    }
}

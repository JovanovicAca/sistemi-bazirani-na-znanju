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
import java.util.Comparator;
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

        Response res4 = new Response();
        res4.setCityName("Palermo");
        res4.setTransportType(TransportType.AIRPLANE);
        res4.setDistance(Distance.MEDIUM_LONG);
        res4.setAccommodationType(AccommodationType.HOTEL);
        res4.setAverageNightPrice(40.0);
        res4.setSeasonal(true);
        res4.setSeason(Season.HOT);
        res4.setBudget(Budget.LOW);

        Response res5 = new Response();
        res5. setCityName("Zermat");
        res5. setTransportType(TransportType.AIRPLANE);
        res5.setDistance(Distance.MEDIUM);
        res5.setAccommodationType(AccommodationType.HOTEL);
        res5.setAverageNightPrice(100.0);
        res5.setSeasonal(true);
        res5.setSeason(Season.COLD);
        res5.setBudget(Budget.HIGH);

        Response res6 = new Response();
        res6. setCityName("Riksgransen");
        res6. setTransportType(TransportType.AIRPLANE);
        res6.setDistance(Distance.LONG);
        res6.setAccommodationType(AccommodationType.HOTEL);
        res6.setAverageNightPrice(110.0);
        res6.setSeasonal(true);
        res6.setSeason(Season.COLD);
        res6.setBudget(Budget.LUXURY);

        Response res7 = new Response();
        res7. setCityName("Paris");
        res7. setTransportType(TransportType.AIRPLANE);
        res7.setDistance(Distance.VERY_LONG);
        res7.setAccommodationType(AccommodationType.HOTEL);
        res7.setAverageNightPrice(50.0);
        res7.setSeasonal(false);
        res7.setBudget(Budget.MEDIUM_HIGH);

        Response res8 = new Response();
        res8. setCityName("alberobello ");
        res8. setTransportType(TransportType.BUS);
        res8.setDistance(Distance.MEDIUM_LONG);;
        res8.setAccommodationType(AccommodationType.HOSTEL);
        res8.setAverageNightPrice(30.0);
        res8.setSeasonal(false);
        res8.setBudget(Budget.MEDIUM);

        Response res9 = new Response();
        res9. setCityName("Visoko");
        res9. setTransportType(TransportType.BUS);
        res9.setDistance(Distance.SHORT);
        res9.setAccommodationType(AccommodationType.HOSTEL);
        res9.setAverageNightPrice(10.0);
        res9.setSeasonal(false);
        res9.setBudget(Budget.LOW);


        Response res10 = new Response();
        res10. setCityName("Šibenik");
        res10. setTransportType(TransportType.CAR);
        res10.setDistance(Distance.SHORT);
        res10.setAccommodationType(AccommodationType.HOSTEL);
        res10.setAverageNightPrice(70.0);
        res10.setSeasonal(false);
        res10.setBudget(Budget.HIGH);

        Response res11 = new Response();
        res11. setCityName("Drezden");
        res11. setTransportType(TransportType.CAR);
        res11.setDistance(Distance.MEDIUM);
        res11.setAccommodationType(AccommodationType.HOTEL);
        res11.setAverageNightPrice(35.0);
        res11.setSeasonal(false);
        res11.setBudget(Budget.MEDIUM);

        Response res12 = new Response();
        res12. setCityName("Istanbul");
        res12. setTransportType(TransportType.AIRPLANE);
        res12.setDistance(Distance.MEDIUM_LONG);
        res12.setAccommodationType(AccommodationType.HOTEL);
        res12.setAverageNightPrice(10.0);
        res12.setSeasonal(false);
        res12.setBudget(Budget.LOW);

        Response res13 = new Response();
        res13. setCityName("Canary Islands");
        res13. setTransportType(TransportType.AIRPLANE);
        res13.setDistance(Distance.LONG);
        res13.setAccommodationType(AccommodationType.HOTEL);
        res13.setAverageNightPrice(110.0);
        res13.setSeasonal(true);
        res13.setSeason(Season.HOT);
        res13.setBudget(Budget.LOW);

        Response res14 = new Response();
        res14. setCityName("Parga");
        res14. setTransportType(TransportType.BUS);
        res14.setDistance(Distance.SHORT_MEDIUM);
        res14.setAccommodationType(AccommodationType.HOSTEL);
        res14.setAverageNightPrice(20.0);
        res14.setSeasonal(false);
        res14.setBudget(Budget.MEDIUM);

        List<Response> responseList = new ArrayList<>(List.of(res1, res2, res3,res4,res5,res6,res7,res8,res9,res10,res11,res12,res13,res14));
        for(Response response : responseList){
            response.setScore(0);
        }
        Wrapper wrapper = new Wrapper(responseList);

        KieServices ks = KieServices.Factory.get();
        KieContainer kieContainer = ks.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession();


        List<Response> x = new ArrayList<>();

        kieSession.setGlobal("responses",x);
        kieSession.insert(req);
        kieSession.insert(res);
        kieSession.insert(wrapper);
        kieSession.fireAllRules();

        responseList.sort( Comparator.comparing ( Response::getScore ).reversed() );
        for(Response r : responseList){
            System.out.println(r.getCityName() + " - Score : "+r.getScore());
        }


        kieSession.dispose();

        return res;
    }
}

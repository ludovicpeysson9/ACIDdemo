package com.example.aciddemo.main.controllers;

import com.example.aciddemo.main.dao.ZoneRepository;
import com.example.aciddemo.main.models.entities.ZoneEntity;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Configuration
@EnableScheduling
public class EndPointsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EndPointsController.class);

    private final ZoneRepository zoneRepository;


    //    @Scheduled(fixedRate = 1000)
//    public void randomDataIns(){
//        try{
//
//        }catch{
//
//        }
//    }
    @Transactional
    @PostMapping("/insnormaldata")
    public void insData(){
        ZoneEntity zone1 = zoneRepository.save(new ZoneEntity(null, "Zone1", null));
        ZoneEntity zone2 = zoneRepository.save(new ZoneEntity(null, "Zone2", Math.toIntExact(zone1.getId())));
        zoneRepository.delete(zone1);
    }

    @PostMapping("/testDataEntrance")
    public void testData(){
        ZoneEntity zone1 = zoneRepository.save(new ZoneEntity(null, "zone5", null));
        ZoneEntity zone2 = zoneRepository.save(new ZoneEntity(null, "zone-", null));
    }

//    @GetMapping("/insmesures")
//    public void insMesures(){
//    }
//
//    @DeleteMapping("/deletetag")
//    public void deleteTag(){
//        try{
//
//        }catch{
//            LOGGER.error("Erreur pendant la suppression des données");
//        }
//    }
}

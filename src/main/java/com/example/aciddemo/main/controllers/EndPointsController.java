package com.example.aciddemo.main.controllers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@AllArgsConstructor
public class EndPointsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EndPointsController.class);

    @PostMapping("/insnormaldata")
    public void insData(){
        try{

        }catch{
            LOGGER.error("Erreur pendant l'insertion des données");
        }
    }

    @PostMapping("/insmesures")
    public void insMesures(){
        try{

        }catch{
            LOGGER.error("Erreur pendant l'insertion des données"));
        }
    }

    @DeleteMapping("/deletetag")
    public void deleteTag(){
        try{

        }catch{
            LOGGER.error("Erreur pendant la suppression des données");
        }
    }


}

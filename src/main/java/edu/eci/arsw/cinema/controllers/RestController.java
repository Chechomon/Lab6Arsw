/*package edu.eci.arsw.cinema.controllers;


import edu.eci.arsw.cinema.model.Cinema;
import edu.eci.arsw.cinema.services.CinemaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

@org.springframework.web.bind.annotation.RestController
@Service
@RequestMapping(value = "/cinema")
public class RestController {

    @Autowired
    CinemaServices cinemaServices;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllCinemas(){
        try {
            return new ResponseEntity<>(cinemaServices.getAllCinemas(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(RestController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error ",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/cinemaanddate", method = RequestMethod.GET)
    public ResponseEntity<?> getFunctionsbyCinemaAndDate(String cinema, String date){
        try {
            return new ResponseEntity<>(cinemaServices.getFunctionsbyCinemaAndDate(cinema, date), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(RestController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error ",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public ResponseEntity<?> getCinemaByName(String name){
        try {
            return new ResponseEntity<>(cinemaServices.getCinemaByName(name), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(RestController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error ",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addNewCinema(String name){
        try {
            Cinema cinema = new Cinema(name,new ArrayList<>());
            cinemaServices.addNewCinema(cinema);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(RestController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error ",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> addNewCinema(String row, String col, String cinema, String date, String movieName){
        try {
            cinemaServices.buyTicket(Integer.parseInt(row), Integer.parseInt(col), cinema, date, movieName);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(RestController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error ",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/filter", method = RequestMethod.GET)
    public ResponseEntity<?> getNameByFilter(String cinema, String date, String filter){
        try {
            return new ResponseEntity<>(cinemaServices.filter(cinema, date, filter), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(RestController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error ",HttpStatus.NOT_FOUND);
        }
    }
}*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hostel.controller;

import com.example.hostel.Model.Hostel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/hostels")
public class HostelController {

    @GetMapping
    public Flux<Hostel> getAllHostel() {
        
        Hostel h1 = new Hostel(1, "Motel chez mado");
        Hostel h2 = new Hostel(2, "Hotel des hirondelles");
        
        Flux<Hostel> hostels = Flux.just(h1,h2);
        
        return hostels;
    }

}

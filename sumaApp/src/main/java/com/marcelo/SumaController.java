package com.marcelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumaController {
	@Autowired
    private SumaRepository sumaRepository;

    @RequestMapping("/sumar/{sumando01}/{sumando02}")
    public Suma suma(
    		@PathVariable int sumando01,
    		@PathVariable int sumando02) {
        Suma suma = new Suma(sumando01, sumando02);
        sumaRepository.save(suma);
        return suma;
    }
}

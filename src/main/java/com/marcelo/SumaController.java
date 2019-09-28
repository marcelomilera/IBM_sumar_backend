package com.marcelo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumaController {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/sumar/{sumando01}/{sumando02}")
    public Suma suma(
    		@PathVariable int sumando01,
    		@PathVariable int sumando02) {
        return new Suma(counter.incrementAndGet(), sumando01, sumando02);
    }
}

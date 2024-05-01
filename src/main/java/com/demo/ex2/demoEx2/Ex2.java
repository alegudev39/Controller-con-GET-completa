package com.demo.ex2.demoEx2;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController

public class Ex2 {
    @GetMapping("/v2/ciao/{provincia}")
    public Saluto saluta(@RequestParam String nome, @PathVariable String provincia) {
        return new Saluto(nome, provincia);
    }

}




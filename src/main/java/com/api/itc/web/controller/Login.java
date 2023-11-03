package com.api.itc.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class Login {
    @PostMapping("/login")
    public String doLogin(@RequestBody Map<String, Object> informacion) {
        String usuario = informacion.get("usuario").toString();
        String password = informacion.get("password").toString();

        return "Usuario: " + usuario + " Contrasena: "+password;
    }
}

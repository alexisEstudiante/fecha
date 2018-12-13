package com.example.fecha.controller;

import com.example.fecha.application.FechaCalcularApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/fecha")
public class FechaController {

  @Autowired
  private FechaCalcularApplication fechaCalcularApplication;

  @PostMapping
  public String obtenerFecha() throws Exception {
    return this.fechaCalcularApplication.obtenerFecha();
  }

}

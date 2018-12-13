package com.example.fecha.controller;

import com.example.fecha.application.FechaCalcularApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/fecha")
public class FechaController {

  @Autowired
  private FechaCalcularApplication fechaCalcularApplication;

  @GetMapping
  public String obtenerFecha() throws Exception {
    return this.fechaCalcularApplication.obtenerFecha();
  }

}

package com.example.fecha.controller;

import com.example.fecha.application.FechaApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/fecha")
public class FechaController {

  @Autowired
  private FechaApplication fechaApplication;

  @PostMapping
  public String obtenerFecha(@RequestParam("folio") Integer folio) throws Exception {
    return this.fechaApplication.obtenerFecha(folio);
  }

}

package com.example.fecha.application;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

@Component
public class FechaCalcularApplication {

  Calendar calendar = Calendar.getInstance();

  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

  public String obtenerFecha(){

    Date hoy = new Date();
    calendar.setTimeInMillis(hoy.getTime());
    Random random = new Random();
    int numeroDia = random.nextInt(3) + 1;
    calendar.add(Calendar.DATE, numeroDia);

    hoy = getFechaValida(new Date(calendar.getTime().getTime()));

    return simpleDateFormat.format(hoy);

  }

  public Date getFechaValida(Date fecha) {
    calendar.setTimeInMillis(fecha.getTime());
    int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);
    switch (diaSemana) {
      case 1:
        calendar.add(Calendar.DATE, 1);
        fecha = new java.sql.Date(calendar.getTime().getTime());
        break;
      case 7:
        calendar.add(Calendar.DATE, 2);
        fecha = new java.sql.Date(calendar.getTime().getTime());
        break;
    }


    return fecha;
  }
}

package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String nomDuenio, String celDuenio, String observaciones, String alergico, String atenEspecial) {
        //Creamos el duenio y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nomDuenio);
        duenio.setCelDuenio(celDuenio);
        //Creamos la mascota y asignamos sus valores
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEspecial);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);

        controlPersis.guardar(duenio, masco);
    }

}

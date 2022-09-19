/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author Olman
 */
public class Partido {
    
    private int idJornada;
    private int idPartido;
    private Date fecha ;
    private String nombreA;
    private int carreraA;
    private String nombreB;
    private int carreraB;
    private String extraInning;

    public Partido() {
        
    }

    public Partido(int idJornada, int idPartido, Date fecha, String nombreA, int carreraA, String nombreB, int carreraB, String extraInning) {
        this.idJornada = idJornada;
        this.idPartido = idPartido;
        this.fecha = fecha;
        this.nombreA = nombreA;
        this.carreraA = carreraA;
        this.nombreB = nombreB;
        this.carreraB = carreraB;
        this.extraInning = extraInning;
    }

    public int getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(int idJornada) {
        this.idJornada = idJornada;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public int getCarreraA() {
        return carreraA;
    }

    public void setCarreraA(int carreraA) {
        this.carreraA = carreraA;
    }

    public String getNombreB() {
        return nombreB;
    }

    public void setNombreB(String nombreB) {
        this.nombreB = nombreB;
    }

    public int getCarreraB() {
        return carreraB;
    }

    public void setCarreraB(int carreraB) {
        this.carreraB = carreraB;
    }

    public String getExtraInning() {
        return extraInning;
    }

    public void setExtraInning(String extraInning) {
        this.extraInning = extraInning;
    }
    
        public String datosRegistro(){
    
        return "ID Jornada: " + idJornada + "ID Partido: " + idPartido + "Fecha: " + fecha + "Nombre equipo A: " + nombreA + "Carreras anotadas equipo A" + carreraA + "Nombre equipo B: " + nombreB + "Carreras anotadas equipo B" + carreraB + "\t " + extraInning + "\n " ;
        }
    
    
    
}

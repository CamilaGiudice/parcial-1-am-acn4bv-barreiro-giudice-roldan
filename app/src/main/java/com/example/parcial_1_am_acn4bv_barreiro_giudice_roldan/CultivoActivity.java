package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import java.util.ArrayList;

public class CultivoActivity extends MainActivity{

    //atributos
    private int idCultivo;
    private String nombreCultivo;
    private String descripcionCultivo;
    private ArrayList<EnfermedadActivity> misEnfermedades;

    //Constructor
    public CultivoActivity(int idCultivo, String nombreCultivo, String descripcionCultivo){
        this.idCultivo=idCultivo;
        this.nombreCultivo=nombreCultivo;
        this.descripcionCultivo=descripcionCultivo;
        misEnfermedades = new ArrayList<>();

    }

    //getters y setters

    public int getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(int idCultivo) {
        this.idCultivo = idCultivo;
    }

    public String getNombreCultivo() {
        return nombreCultivo;
    }

    public void setNombreCultivo(String nombreCultivo) {
        this.nombreCultivo = nombreCultivo;
    }

    public String getDescripcionCultivo() {
        return descripcionCultivo;
    }

    public void setDescripcionCultivo(String descripcionCultivo) {
        this.descripcionCultivo = descripcionCultivo;
    }

    public ArrayList<EnfermedadActivity> getMisEnfermedades() {
        return misEnfermedades;
    }

    public void setMisEnfermedades(ArrayList<EnfermedadActivity> misEnfermedades) {
        this.misEnfermedades = misEnfermedades;
    }

    //Método toString

    @Override
    public String toString() {
        return "CultivoActivity{" +
                "idCultivo=" + idCultivo +
                ", nombreCultivo='" + nombreCultivo + '\'' +
                ", descripcionCultivo='" + descripcionCultivo + '\'' +
                ", misEnfermedades=" + misEnfermedades +
                '}';
    }
}

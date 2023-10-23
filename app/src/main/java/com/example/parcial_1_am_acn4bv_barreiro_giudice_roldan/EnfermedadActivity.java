package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import java.util.ArrayList;

public class EnfermedadActivity extends MainActivity{

    //Atributos
    private int idEnfermedad;
    private String nombreEnfermedad;
    private String descripcionEnfermedad;
    private ArrayList<CultivoActivity> misCultivos;
    private String solucionBiologica;
    private String solucionQuimica;

    //Constructor
    public EnfermedadActivity(int idEnfermedad, String nombreEnfermedad
    , String descripcionEnfermedad, String solucionBiologica, String solucionQuimica){

        this.idEnfermedad=idEnfermedad;
        this.nombreEnfermedad=nombreEnfermedad;
        this.descripcionEnfermedad=descripcionEnfermedad;
        this.solucionBiologica = solucionBiologica;
        this.solucionQuimica = solucionQuimica;
        misCultivos = new ArrayList<>();

    }

    //Getters y Setters

    public int getIdEnfermedad() {
        return idEnfermedad;
    }

    public void setIdEnfermedad(int idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public String getDescripcionEnfermedad() {
        return descripcionEnfermedad;
    }

    public void setDescripcionEnfermedad(String descripcionEnfermedad) {
        this.descripcionEnfermedad = descripcionEnfermedad;
    }

    public ArrayList<CultivoActivity> getMisCultivos() {
        return misCultivos;
    }

    public void setMisCultivos(ArrayList<CultivoActivity> misCultivos) {
        this.misCultivos = misCultivos;
    }

    public String getSolucionBiologica() {
        return solucionBiologica;
    }

    public void setSolucionBiologica(String solucionBiologica) {
        this.solucionBiologica = solucionBiologica;
    }

    public String getSolucionQuimica() {
        return solucionQuimica;
    }

    public void setSolucionQuimica(String solucionQuimica) {
        this.solucionQuimica = solucionQuimica;
    }

    //Método toString
    @Override
    public String toString() {
        return "EnfermedadActivity{" +
                "idEnfermedad=" + idEnfermedad +
                ", nombreEnfermedad='" + nombreEnfermedad + '\'' +
                ", descripcionEnfermedad='" + descripcionEnfermedad + '\'' +
                ", misCultivos=" + misCultivos +
                ", solucionBiologica='" + solucionBiologica + '\'' +
                ", solucionQuimica='" + solucionQuimica + '\'' +
                '}';
    }
}

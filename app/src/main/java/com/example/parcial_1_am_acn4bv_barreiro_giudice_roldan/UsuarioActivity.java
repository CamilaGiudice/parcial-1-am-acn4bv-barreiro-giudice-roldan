package com.example.parcial_1_am_acn4bv_barreiro_giudice_roldan;

import java.util.ArrayList;

public class UsuarioActivity extends MainActivity{

    //Atributos
    private int idUsuario;
    private String nombreUsuario;
    private String mailUsuario;
    private String passwordUsuario;
    private boolean esAdmin;
    private int intentosFallidos;
    private boolean usuarioBloqueado;
    private ArrayList<CultivoActivity> misCultivos;
    private ArrayList<EnfermedadActivity> misEnfermedades;

    //Constructores
    public UsuarioActivity(String mailUsuario, String passwordUsuario){
        this.mailUsuario=mailUsuario;
        this.passwordUsuario=passwordUsuario;
    }
    public UsuarioActivity(int idUsuario,String nombreUsuario, String mailUsuario
    , String passwordUsuario, boolean esAdmin){
        this.idUsuario=idUsuario;
        this.nombreUsuario=nombreUsuario;
        this.mailUsuario=mailUsuario;
        this.passwordUsuario=passwordUsuario;
        intentosFallidos=0;
        usuarioBloqueado=false;
        misCultivos=new ArrayList<>();
        misEnfermedades=new ArrayList<>();
    }


    //Getters y Setters

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getMailUsuario() {
        return mailUsuario;
    }

    public void setMailUsuario(String mailUsuario) {
        this.mailUsuario = mailUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public boolean isEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    public ArrayList<CultivoActivity> getMisCultivos() {
        return misCultivos;
    }

    public void setMisCultivos(ArrayList<CultivoActivity> misCultivos) {
        this.misCultivos = misCultivos;
    }

    public ArrayList<EnfermedadActivity> getMisEnfermedades() {
        return misEnfermedades;
    }

    public void setMisEnfermedades(ArrayList<EnfermedadActivity> misEnfermedades) {
        this.misEnfermedades = misEnfermedades;
    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(int intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }

    public boolean isUsuarioBloqueado() {
        return usuarioBloqueado;
    }

    public void setUsuarioBloqueado(boolean usuarioBloqueado) {
        this.usuarioBloqueado = usuarioBloqueado;
    }

//To String


    @Override
    public String toString() {
        return "UsuarioActivity{" +
                "idUsuario=" + idUsuario +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", mailUsuario='" + mailUsuario + '\'' +
                ", passwordUsuario='" + passwordUsuario + '\'' +
                ", esAdmin=" + esAdmin +
                ", intentosFallidos=" + intentosFallidos +
                ", usuarioBloqueado=" + usuarioBloqueado +
                ", misCultivos=" + misCultivos +
                ", misEnfermedades=" + misEnfermedades +
                '}';
    }
}

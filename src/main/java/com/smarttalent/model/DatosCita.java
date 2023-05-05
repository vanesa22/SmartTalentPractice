package com.smarttalent.model;

public class DatosCita {
    private String atrCentroSalud;
    private String atrDiaCita;
    private String atrProgramaSalud;
    private String atrComentario;
    private boolean atrReadmision;


    public DatosCita(String atrCentroSalud, String atrDiaCita, String atrProgramaSalud, String atrComentario, boolean atrReadmision) {
        this.atrCentroSalud = atrCentroSalud;
        this.atrDiaCita = atrDiaCita;
        this.atrProgramaSalud = atrProgramaSalud;
        this.atrComentario = atrComentario;
        this.atrReadmision = atrReadmision;
    }

    public boolean isAtrReadmision() {
        return atrReadmision;
    }

    public void setAtrReadmision(boolean atrReadmision) {
        this.atrReadmision = atrReadmision;
    }



    public String getAtrCentroSalud() {
        return atrCentroSalud;
    }

    public void setAtrCentroSalud(String atrCentroSalud) {
        this.atrCentroSalud = atrCentroSalud;
    }

    public String getAtrDiaCita() {
        return atrDiaCita;
    }

    public void setAtrDiaCita(String atrDiaCita) {
        this.atrDiaCita = atrDiaCita;
    }

    public String getAtrProgramaSalud() {
        return atrProgramaSalud;
    }

    public void setAtrProgramaSalud(String atrProgramaSalud) {
        this.atrProgramaSalud = atrProgramaSalud;
    }

    public String getAtrComentario() {
        return atrComentario;
    }

    public void setAtrComentario(String atrComentario) {
        this.atrComentario = atrComentario;
    }

}

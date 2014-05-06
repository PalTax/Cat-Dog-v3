/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Codigo;

/**
 *
 * @author Bryan
 */
public class Gestion {
    private String IdAnimal;
    private String NombreA;
    private String Rut;
    private String Telefono;
    private String NombreM;
    private String Raza;
    private String DiaI;
    private String MesI;
    private String AñoI;
    private String DiaS;
    private String MesS;
    private String AñoS;

    public Gestion(String IdAnimal, String NombreA, String Rut, String Telefono, String NombreM, String Raza, String DiaI, String MesI, String AñoI, String DiaS, String MesS, String AñoS) {
        this.IdAnimal = IdAnimal;
        this.NombreA = NombreA;
        this.Rut = Rut;
        this.Telefono = Telefono;
        this.NombreM = NombreM;
        this.Raza = Raza;
        this.DiaI = DiaI;
        this.MesI = MesI;
        this.AñoI = AñoI;
        this.DiaS = DiaS;
        this.MesS = MesS;
        this.AñoS = AñoS;
    }

    public String getIdAnimal() {
        return IdAnimal;
    }

    public void setIdAnimal(String IdAnimal) {
        this.IdAnimal = IdAnimal;
    }

    public String getNombreA() {
        return NombreA;
    }

    public void setNombreA(String NombreA) {
        this.NombreA = NombreA;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombreM() {
        return NombreM;
    }

    public void setNombreM(String NombreM) {
        this.NombreM = NombreM;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getDiaI() {
        return DiaI;
    }

    public void setDiaI(String DiaI) {
        this.DiaI = DiaI;
    }

    public String getMesI() {
        return MesI;
    }

    public void setMesI(String MesI) {
        this.MesI = MesI;
    }

    public String getAñoI() {
        return AñoI;
    }

    public void setAñoI(String AñoI) {
        this.AñoI = AñoI;
    }

    public String getDiaS() {
        return DiaS;
    }

    public void setDiaS(String DiaS) {
        this.DiaS = DiaS;
    }

    public String getMesS() {
        return MesS;
    }

    public void setMesS(String MesS) {
        this.MesS = MesS;
    }

    public String getAñoS() {
        return AñoS;
    }

    public void setAñoS(String AñoS) {
        this.AñoS = AñoS;
    }
    
}

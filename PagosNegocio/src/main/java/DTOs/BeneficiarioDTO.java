/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

/**
 *
 * @author jesus
 */
public class BeneficiarioDTO {
    
    int claveContrato;
    String nombres;
    String apellidoPaterno;
    String apellidoMaterno;
    String usuario;
    String contra;
    float Saldo;

    public BeneficiarioDTO(int claveContrato, String nombres, String apellidoPaterno, String apellidoMaterno, String usuario, String contra, float Saldo) {
        this.claveContrato = claveContrato;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.usuario = usuario;
        this.contra = contra;
        this.Saldo = Saldo;
    }
    

    public int getClaveContrato() {
        return claveContrato;
    }

    public void setClaveContrato(int claveContrato) {
        this.claveContrato = claveContrato;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }
    
    
    
    

    
    
    
}

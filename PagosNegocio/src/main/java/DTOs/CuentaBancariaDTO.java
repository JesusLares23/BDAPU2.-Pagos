/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import entidades.Beneficiario;

/**
 *
 * @author jesus
 */
public class CuentaBancariaDTO {

    
    Integer numCuenta;
    String clabe;
    String banco;
    Boolean eliminada;
    BeneficiarioDTO beneficiario;

    public CuentaBancariaDTO(Integer numCuenta, String clabe,String banco, Boolean eliminada, BeneficiarioDTO beneficiario) {
        this.numCuenta = numCuenta;
        this.clabe = clabe;
        this.banco = banco;
        this.eliminada = eliminada;
        this.beneficiario = beneficiario;
    }

    public CuentaBancariaDTO(Integer numCuenta, String clabe,String banco, Boolean eliminada) {
        this.numCuenta = numCuenta;
        this.clabe = clabe;
        this.banco = banco;
        this.eliminada = eliminada;
    }
    

    public Integer getNumCuenta() {
        return numCuenta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setNumCuenta(Integer numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public Boolean getEliminada() {
        return eliminada;
    }

    public void setEliminada(Boolean eliminada) {
        this.eliminada = eliminada;
    }

    public BeneficiarioDTO getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(BeneficiarioDTO beneficiario) {
        this.beneficiario = beneficiario;
    }

    @Override
    public String toString() {
        return "CuentaBancariaDTO{" + "numCuenta=" + numCuenta + ", clabe=" + clabe + ", eliminada=" + eliminada + ", beneficiario=" + beneficiario + '}';
    }
    
    
    

}

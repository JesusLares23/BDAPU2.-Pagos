/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlCuentaBancaria;

import DTOs.BeneficiarioDTO;
import entidades.Beneficiario;
import entidades.CuentaBancaria;
import java.util.List;
import DTOs.CuentaBancariaDTO;

/**
 *
 * @author jesus
 */
public class ControlCuentaB implements Interfaces.ICuentaBancaria{
    BeneficiarioDTO beneficiario;
    public ControlCuentaB(BeneficiarioDTO bene) {
        this.beneficiario = bene;
    }
    
    

    

    @Override
    public CuentaBancaria crearCuentaBancaria(CuentaBancariaDTO cuenta) {
        
        return null;
    }

    @Override
    public void eliminarCuentaBancaria(long id) {
    }

    @Override
    public CuentaBancaria actualizarCuentaBancaria(CuentaBancariaDTO cuenta) {
        return null;
    }

    @Override
    public List<CuentaBancaria> CargarCuentas() {
        return null;
    }
    public CuentaBancaria DTOEntidad(CuentaBancariaDTO cuentaDTO){
    int numCuenta = cuentaDTO.getNumCuenta();
    String clabe = cuentaDTO.getClabe();
    //String banco = cuentaDTO.getBanco();
    boolean eliminada = cuentaDTO.getEliminada();
    
    //CuentaBancaria nuevaCuenta = new CuentaBancaria(numCuenta, clabe, eliminada,;
        return null;
    }
    

    @Override
    public void cargarCuentasPorBeneficiario(Beneficiario beneficiario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}

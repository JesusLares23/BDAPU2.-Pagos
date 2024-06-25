/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import entidades.Beneficiario;
import entidades.CuentaBancaria;
import DTOs.CuentaBancariaDTO;
import java.util.List;

/**
 *
 * @author jesus
 */
public interface ICuentaBancaria {
    
    public List <CuentaBancaria> CargarCuentas();
    public CuentaBancaria crearCuentaBancaria(CuentaBancariaDTO cuenta);
    public void eliminarCuentaBancaria(long id);
    public CuentaBancaria actualizarCuentaBancaria(CuentaBancariaDTO cuenta);
    public void cargarCuentasPorBeneficiario(Beneficiario beneficiario);
    
    

    
}

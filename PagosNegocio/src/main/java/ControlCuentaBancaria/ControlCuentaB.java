/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlCuentaBancaria;

import entidades.Beneficiario;
import entidades.CuentaBancaria;
import java.util.List;

/**
 *
 * @author jesus
 */
public class ControlCuentaB implements Interfaces.ICuentaBancaria{

    

    @Override
    public CuentaBancaria crearCuentaBancaria(CuentaBancaria cuenta) {
        return null;
    }

    @Override
    public void eliminarCuentaBancaria(long id) {
    }

    @Override
    public CuentaBancaria actualizarCuentaBancaria(CuentaBancaria cuenta) {
        return null;
    }

    @Override
    public List<CuentaBancaria> CargarCuentas() {
        return null;
    }
    
//    public void cargarCuentasPorBeneficiario(Beneficiario beneficiario) {
//        List<CuentaBancariaDTO> cuentas = cuentaBancariaService.obtenerCuentasPorBeneficiario(beneficiario);
//        DefaultTableModel model = (DefaultTableModel) tablaCuentasBancarias.getModel();
//        model.setRowCount(0); // Limpiar la tabla
//
//        for (CuentaBancariaDTO cuenta : cuentas) {
//            model.addRow(new Object[]{
//                cuenta.getNumCuenta(),
//                cuenta.getClabe(),
//                cuenta.getBanco(),
//                cuenta.getEliminada() ? "Sí" : "No",
//                "Editar",  // Placeholder para el botón de editar
//                "Eliminar", // Placeholder para el botón de eliminar
//                "Ver"       // Placeholder para el botón de ver detalles
//            });
//        }
//    }

    @Override
    public void cargarCuentasPorBeneficiario(Beneficiario beneficiario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}

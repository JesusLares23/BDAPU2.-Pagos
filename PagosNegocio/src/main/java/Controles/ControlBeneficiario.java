
package Controles;

import DAOs.BeneficiarioDAO;
import DTOs.BeneficiarioDTO;
import Interfaces.IBeneficiario;
import entidades.Beneficiario;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author darkm
 */
public class ControlBeneficiario implements IBeneficiario {

    public BeneficiarioDAO beneficiarioDAO;

    
    public Beneficiario convertirBeneficiario(BeneficiarioDTO beneficiarioDTO) {
        Integer claveContrato = beneficiarioDTO.getClaveContrato();
        String nombres = beneficiarioDTO.getNombres();
        String apellidoPaterno = beneficiarioDTO.getApellidoPaterno();
        String apellidoMaterno = beneficiarioDTO.getApellidoMaterno();
        String usuario = beneficiarioDTO.getUsuario();
        String contra = beneficiarioDTO.getContra();
        Double Double = beneficiarioDTO.getSaldo();
        
        Beneficiario beneficiario = new Beneficiario(
                claveContrato, 
                nombres, 
                apellidoPaterno, 
                apellidoMaterno, 
                usuario, 
                contra, 
                Double);
        
        return beneficiario;
    }
    
    @Override
    public List<Beneficiario> buscarBeneficiariosTabla() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertar(BeneficiarioDTO beneficiarioDTO) throws PersistenciaException {
        beneficiarioDAO.insertar(convertirBeneficiario(beneficiarioDTO));
    }

    @Override
    public Beneficiario obtenerTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Beneficiario obtenerPorId(int id) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Beneficiario editar(Beneficiario beneficiario) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Beneficiario eliminar(Beneficiario beneficiario) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

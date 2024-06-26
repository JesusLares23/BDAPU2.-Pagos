
package interfaces;

import entidades.Beneficiario;
import excepciones.PersistenciaException;
import java.util.List;

/**
 * @author Jesús Lares
 * @author ...
 */
public interface IBeneficiarioDAO {
    
    public List<Beneficiario> buscarBeneficiariosTabla() throws PersistenciaException;
    
    public void insertar(Beneficiario beneficiario) throws PersistenciaException;
    
    public Beneficiario obtenerTodos() throws PersistenciaException;
    
    public Beneficiario obtenerPorId(int id) throws PersistenciaException;
    
    public Beneficiario editar(Beneficiario beneficiario) throws PersistenciaException;
    
    public Beneficiario eliminar(Beneficiario beneficiario) throws PersistenciaException;
}

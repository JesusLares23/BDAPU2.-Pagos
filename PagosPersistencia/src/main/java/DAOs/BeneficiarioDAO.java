
package DAOs;

import entidades.Beneficiario;
import excepciones.PersistenciaException;
import interfaces.IBeneficiarioDAO;
import interfaces.IConexion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

/**
 *
 * @author darkm
 */
public class BeneficiarioDAO implements IBeneficiarioDAO {

    private final IConexion conexion;

    public BeneficiarioDAO(IConexion conexion) {
        this.conexion = conexion;
    }
    
    @Override
    public List<Beneficiario> buscarBeneficiariosTabla() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertar(Beneficiario beneficiario) throws PersistenciaException {
        EntityManager em = this.conexion.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(beneficiario);
            em.getTransaction().commit();
        } catch (PersistenceException pe) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            pe.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Override
    public Beneficiario obtenerTodos() throws PersistenciaException {
//        try {
//            EntityManager em = this.conexion.getEntityManager();
//            String jpql = """
//                          SELECT NEW DTOs.BeneficiarioDTO(
//                            b.id_beneficiario, b.clave_contrato, b.nombres,
//                            b.apellido_paterno, b.apellido_materno, b.usuario,
//                            b.contra, b.saldo
//                          )
//                          FROM Beneficiario AS b
//                          """;
//            
//            TypedQuery<Beneficiario> query = em.createQuery(jpql, Beneficiario.class);
//            List<Beneficiario> resultList = query.getResultList();
//            return (Beneficiario) resultList;
//            
//        } catch (Exception e) {
//        }
//        
        return null;
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


package DAOs;

import interfaces.IConexion;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

/**
 * @author Jesús Lares
 * @author ...
 */
public class Conexion implements IConexion {

    @Override
    public EntityManager getEntityManager() throws PersistenceException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(
                "ConexionJPA");
        EntityManager em = emf.createEntityManager();
        return em;
    }
    
    
}

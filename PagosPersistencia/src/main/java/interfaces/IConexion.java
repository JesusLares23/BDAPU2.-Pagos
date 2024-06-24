
package interfaces;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

/**
 * @author Jesús Lares
 * @author ...
 */
public interface IConexion {
    
    public EntityManager getEntityManager() throws PersistenceException;

    
}

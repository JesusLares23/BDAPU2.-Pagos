
package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author darkm
 */
@Entity
@Table(name = "Beneficiarios")
public class Beneficiario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_beneficiario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "clave_contrato", nullable = false)
    private int claveContrato;
    
    @Column(name = "nombres", length = 50, nullable = false)
    private String nombres;
    
    @Column(name = "apellido_paterno", length = 50, nullable = false)
    private String apellidoPaterno;
    
    @Column(name = "apellido_materno", length = 50, nullable = true)
    private String apellidoMaterno;
    
    @Column(name = "usuario", length = 50, nullable = false)
    private String usuario;
    
    @Column(name = "contra", length = 100, nullable = false)
    private String contra
    
}

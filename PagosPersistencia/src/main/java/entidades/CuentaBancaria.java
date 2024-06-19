
package entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Jesús Lares
 * @author ...
 */
@Entity
@Table(name = "cuentas_bancarias")
public class CuentaBancaria implements Serializable {

    @Id
    @Column(name = "id_cuenta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "num_cuenta", nullable = false)
    private Integer numCuenta;
    
    @Column(name = "clabe", length = 20, nullable = false)
    private String clabe;
    
    @Column(name = "eliminada", nullable = false)
    private Boolean eliminada;
    
    @ManyToOne(cascade = {CascadeType.REMOVE})
    @JoinColumn(name = "id_beneficiario", nullable = false)
    private Beneficiario beneficiario;
    
    
}

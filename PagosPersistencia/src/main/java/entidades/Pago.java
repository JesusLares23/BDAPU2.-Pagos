
package entidades;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jesús Lares
 * @author ...
 */
@Entity
@Table(name = "pagos")
public class Pago implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "monto", precision = 10, scale = 2, nullable = false)
    private Double monto;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_hora", nullable = false)
    private Calendar fechaHora;
    
    // Solo se genera cuando el estatus del pago pasa a pagado
    @Column(name = "comprobante", length = 100, nullable = true)
    private String comprobante;
    
    @ManyToOne(cascade = {CascadeType.REMOVE})
    @JoinColumn(name = "id_beneficiario", nullable = false)
    private Beneficiario beneficiario;
    
    
}

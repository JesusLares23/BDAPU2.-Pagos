
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
 * @author darkm
 */
@Entity
@Table(name = "abonos")
public class Abono implements Serializable {

    @Id
    @Column(name = "id_abono")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "monto", precision = 10, scale = 2, nullable = false)
    private Double monto;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_hora", nullable = false)
    private Calendar fechaHora;
    
    @ManyToOne(cascade = {CascadeType.REMOVE})
    @JoinColumn(name = "id_pago", nullable = false)
    private Pago pago;

    public Abono() {
    }

    public Abono(
            Long id, 
            Double monto, 
            Calendar fechaHora, 
            Pago pago) {
        this.id = id;
        this.monto = monto;
        this.fechaHora = fechaHora;
        this.pago = pago;
    }

    public Abono(
            Double monto, 
            Calendar fechaHora, 
            Pago pago) {
        this.monto = monto;
        this.fechaHora = fechaHora;
        this.pago = pago;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Double getMonto() {
        return monto;
    }
    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Calendar getFechaHora() {
        return fechaHora;
    }
    public void setFechaHora(Calendar fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Pago getPago() {
        return pago;
    }
    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
    
    
}

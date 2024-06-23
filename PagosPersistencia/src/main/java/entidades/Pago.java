
package entidades;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    @Column(name = "id_pago")
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
    
    @ManyToOne(cascade = {CascadeType.REMOVE})
    @JoinColumn(name = "id_tipo", nullable = false)
    private Tipo tipo;
    
    @OneToMany(mappedBy = "pago", cascade ={CascadeType.PERSIST})
    private List<EstatusPago> estatusPagos;

    public Pago() {
    }

    public Pago(
            Long id, 
            Double monto, 
            Calendar fechaHora, 
            String comprobante, 
            Beneficiario beneficiario, 
            Tipo tipo) {
        this.id = id;
        this.monto = monto;
        this.fechaHora = fechaHora;
        this.comprobante = comprobante;
        this.beneficiario = beneficiario;
        this.tipo = tipo;
    }

    public Pago(
            Double monto, 
            Calendar fechaHora, 
            String comprobante, 
            Beneficiario beneficiario, 
            Tipo tipo) {
        this.monto = monto;
        this.fechaHora = fechaHora;
        this.comprobante = comprobante;
        this.beneficiario = beneficiario;
        this.tipo = tipo;
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

    public String getComprobante() {
        return comprobante;
    }
    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }
    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }     

    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    public List<EstatusPago> getEstatusPagos() {
        return estatusPagos;
    }
    public void setEstatusPagos(List<EstatusPago> estatusPagos) {
        this.estatusPagos = estatusPagos;
    }

    
    
    
}

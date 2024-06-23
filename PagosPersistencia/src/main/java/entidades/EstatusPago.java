
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
 * @author Jesús Lares
 * @author ...
 */
@Entity
@Table(name = "estatus_pagos")
public class EstatusPago implements Serializable {

    @Id
    @Column(name = "id_estatus_pago")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "mensaje", length = 200, nullable = false)
    private String mensaje;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_hora", nullable = false)
    private Calendar fechaHora;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_estatus", nullable = false)
    private Estatus estatus;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_pago", nullable = false)
    private Pago pago;

    public EstatusPago(
            Long id, 
            String mensaje, 
            Calendar fechaHora, 
            Estatus estatus, 
            Pago pago) {
        this.id = id;
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
        this.estatus = estatus;
        this.pago = pago;
    }

    public EstatusPago(
            String mensaje, 
            Calendar fechaHora, 
            Estatus estatus, 
            Pago pago) {
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
        this.estatus = estatus;
        this.pago = pago;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Calendar getFechaHora() {
        return fechaHora;
    }
    public void setFechaHora(Calendar fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Estatus getEstatus() {
        return estatus;
    }
    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public Pago getPago() {
        return pago;
    }
    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
    
    
}

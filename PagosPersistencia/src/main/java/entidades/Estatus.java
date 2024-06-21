/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author adane
 */
@Entity
@Table(name = "estatus")
public class Estatus implements Serializable {
    
    @Id
    @Column(name = "id_estatus")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre",length = (50), nullable = false)
    private Integer nombre;
    
    @OneToMany(mappedBy = "estatus",cascade ={CascadeType.PERSIST})
    private List<Pago> pagoEstatus;

    public Estatus() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public List<Pago> getPagoEstatus() {
        return pagoEstatus;
    }

    public void setPagoEstatus(List<Pago> pagoEstatus) {
        this.pagoEstatus = pagoEstatus;
    }
    
    

    
    
}

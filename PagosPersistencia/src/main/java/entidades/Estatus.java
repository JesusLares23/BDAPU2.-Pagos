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
    
    @Column(name = "nombre", length = (50), nullable = false)
    private String nombre;
    
    @OneToMany(mappedBy = "estatus", cascade = {CascadeType.PERSIST})
    private List<EstatusPago> estatusPagos;

    public Estatus(
            Long id, 
            String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Estatus(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<EstatusPago> getEstatusPagos() {
        return estatusPagos;
    }
    public void setEstatusPagos(List<EstatusPago> estatusPagos) {
        this.estatusPagos = estatusPagos;
    }

    

}

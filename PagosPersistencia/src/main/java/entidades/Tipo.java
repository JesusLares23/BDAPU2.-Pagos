
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
 * @author darkm
 */
@Entity
@Table(name = "tipos")
public class Tipo implements Serializable {

    @Id
    @Column(name = "id_tipo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 15, nullable = false)
    private String nombre;
    
    @Column(name = "num_parcialidades", nullable = false)
    private Integer numParcialidades;
    
    @OneToMany(mappedBy = "tipo", cascade = {CascadeType.PERSIST})
    private List<Pago> pagos;

    public Tipo(
            Long id, 
            String nombre, 
            Integer numParcialidades) {
        this.id = id;
        this.nombre = nombre;
        this.numParcialidades = numParcialidades;
    }

    public Tipo(
            String nombre, 
            Integer numParcialidades) {
        this.nombre = nombre;
        this.numParcialidades = numParcialidades;
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

    public Integer getNumParcialidades() {
        return numParcialidades;
    }
    public void setNumParcialidades(Integer numParcialidades) {
        this.numParcialidades = numParcialidades;
    }

    public List<Pago> getPagos() {
        return pagos;
    }
    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }
    
    
    
}

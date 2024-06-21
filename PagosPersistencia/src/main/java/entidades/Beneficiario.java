
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
 * @author Jesús Lares
 * @author ...
 */
@Entity
@Table(name = "beneficiarios")
public class Beneficiario implements Serializable {

    @Id
    @Column(name = "id_beneficiario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "clave_contrato", nullable = false)
    private Integer claveContrato;
    
    @Column(name = "nombres", length = 50, nullable = false)
    private String nombres;
    
    @Column(name = "apellido_paterno", length = 50, nullable = false)
    private String apellidoPaterno;
    
    @Column(name = "apellido_materno", length = 50, nullable = true)
    private String apellidoMaterno;
    
    @Column(name = "usuario", length = 50, nullable = false)
    private String usuario;
    
    @Column(name = "contra", length = 100, nullable = false)
    private String contra;
    
    @Column(name = "saldo", precision = 10, scale = 2, nullable = false)
    private Double saldo;
    
    @OneToMany(mappedBy = "beneficiario", cascade = {CascadeType.PERSIST})
    private List<CuentaBancaria> cuentasBancarias;
    
    @OneToMany(mappedBy = "beneficiario", cascade = {CascadeType.PERSIST})
    private List<Pago> pagos;

    public Beneficiario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getClaveContrato() {
        return claveContrato;
    }

    public void setClaveContrato(Integer claveContrato) {
        this.claveContrato = claveContrato;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<CuentaBancaria> getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void setCuentasBancarias(List<CuentaBancaria> cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }
    
    
    
}

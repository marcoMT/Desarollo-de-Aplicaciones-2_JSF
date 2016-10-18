package utng.modelo;

import java.io.Serializable;
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
 * @author Marco Antonio Mendiola Torres markochiva@gmail.com
 */
@Entity @Table(name = "vendedor")
public class Vendedor implements Serializable{
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vendedor")
    private Long idVendedor;
    @Column(name = "nombre_vendedor", length = 30)
    private String nombreVendedor;
    @Column(name = "mercancia",length = 40)
    private String mercancia;
    @Column(name = "mejor_proveedor",length = 40)
    private String mejorProveedor;
    @ManyToOne
    @JoinColumn(name = "id_mercado")
    private Mercado mercado;

    public Vendedor(Long idVendedor, String nombreVendedor, String mercancia, String mejorProveedor, Mercado mercado) {
        super();
        this.idVendedor = idVendedor;
        this.nombreVendedor = nombreVendedor;
        this.mercancia = mercancia;
        this.mejorProveedor = mejorProveedor;
        this.mercado = mercado;
    }
    
    public Vendedor(){
        this.idVendedor = 0L;
    }

    public Long getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Long idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getMercancia() {
        return mercancia;
    }

    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }

    public String getMejorProveedor() {
        return mejorProveedor;
    }

    public void setMejorProveedor(String mejorProveedor) {
        this.mejorProveedor = mejorProveedor;
    }

    public Mercado getMercado() {
        return mercado;
    }

    public void setMercado(Mercado mercado) {
        this.mercado = mercado;
    }
    
    
    
    
}

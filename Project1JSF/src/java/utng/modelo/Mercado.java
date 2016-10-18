package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Marco Antonio Mendiola Torres markochiva@gmail.com
 */
@Entity @Table(name="mercado")
public class Mercado implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mercado")
    private Long idMercado;
    @Column(name = "nombre",length = 30)
    private String nombre;
    @Column(name = "ciudad",length = 30)
    private String ciudad;
    @Column(name = "tamanio",length = 30)
    private String tamanio;
    
    public Mercado(){
        this.idMercado = 0L;
    }

    public Long getIdMercado() {
        return idMercado;
    }

    public void setIdMercado(Long idMercado) {
        this.idMercado = idMercado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    
}

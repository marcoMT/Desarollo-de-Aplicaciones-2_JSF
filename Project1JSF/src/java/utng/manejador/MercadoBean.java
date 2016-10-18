package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.MercadoDAO;
import utng.modelo.Mercado;

/**
 *
 * @author Marco Antonio Mendiola Torres markochiva@gmail.com
 */
@ManagedBean
@SessionScoped
public class MercadoBean implements Serializable {

    private List<Mercado> mercados;
    private Mercado mercado;

    public MercadoBean() {
    }

    public List<Mercado> getMercados() {
        return mercados;
    }

    public void setMercados(List<Mercado> mercados) {
        this.mercados = mercados;
    }

    public Mercado getMercado() {
        return mercado;
    }

    public void setMercado(Mercado mercado) {
        this.mercado = mercado;
    }

    public String listar() {
        MercadoDAO dao = new MercadoDAO();
        try {
            mercados = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Mercados";
    }
    
    public String eliminar(){
        MercadoDAO dao = new MercadoDAO();
        try {
            dao.delete(mercado);
            mercados = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        mercado = new Mercado();
        return "Iniciar";
    }
    
    public String guardar(){
        MercadoDAO dao = new MercadoDAO();
        try {
            if(mercado.getIdMercado() != 0){
                dao.update(mercado);
            }else{
                dao.insert(mercado);
            }
            mercados = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
        return "Cancelar";
    }
    
    public String editar(Mercado mercado){
        this.mercado = mercado;
        return "Editar";
    }
}   

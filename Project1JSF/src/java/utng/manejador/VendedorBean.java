/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.MercadoDAO;
import utng.datos.VendedorDAO;
import utng.modelo.Mercado;
import utng.modelo.Vendedor;

/**
 *
 * @author Marco Antonio Mendiola Torres markochiva@gmail.com
 */
@ManagedBean(name = "vendedorBean")
@SessionScoped
public class VendedorBean implements Serializable{
    private List<Vendedor> vendedores;
    private Vendedor vendedor;
    private List<Mercado> mercados;
    
    public VendedorBean(){
        vendedor = new Vendedor();
        vendedor.setMercado(new Mercado());
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Mercado> getMercados() {
        return mercados;
    }

    public void setMercados(List<Mercado> mercados) {
        this.mercados = mercados;
    }
    
    public String listar(){
        VendedorDAO dao = new VendedorDAO();
        try {
            vendedores = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Vendedores";
    }
    
    public String eliminar(){
        VendedorDAO dao = new VendedorDAO();
        try {
            dao.delete(vendedor);
            vendedores = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        vendedor = new Vendedor();
        vendedor.setMercado(new Mercado());
        try {
            mercados = new MercadoDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }
    
    public String guardar(){
        VendedorDAO dao = new VendedorDAO();
        try {
            if(vendedor.getIdVendedor()!= 0){
                dao.update(vendedor);
            }else{
                dao.insert(vendedor);
            }
            vendedores = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
        return "Cancelar";
    }
    
    public String editar(Vendedor vendedor){
        this.vendedor = vendedor;
        try {
            mercados = new MercadoDAO().getAll();
        } catch (Exception e) {
        }
        return "Editar";
    }
    
    
}

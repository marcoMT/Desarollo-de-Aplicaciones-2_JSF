/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Vendedor;

/**
 *
 * @author Marco Antonio Mendiola Torres markochiva@gmail.com
 */
public class VendedorDAO extends DAO<Vendedor>{
    
    public VendedorDAO(){
        super(new Vendedor());
    }
    
    public Vendedor getOneById(Vendedor vendedor)throws HibernateException{
        return super.getOneById(vendedor.getIdVendedor());
    }
}

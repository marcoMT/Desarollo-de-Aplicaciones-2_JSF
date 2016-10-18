/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Mercado;

/**
 *
 * @author Marco Antonio Mendiola Torres markochiva@gmail.com
 */
public class MercadoDAO extends DAO<Mercado>{
    
    public MercadoDAO(){
        super(new Mercado());
    }
    
    public Mercado getOneById(Mercado mercado)throws HibernateException{
        return super.getOneById(mercado.getIdMercado());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.Modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Ep77
 */
public class Control {
//control
    public ArrayList<Cliente> getUsuarios() {

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        //aca hacemos la magia
        ArrayList<Cliente> arreglo= new ArrayList<Cliente>();
        Query q = session.createQuery("from Cliente");
        List<Cliente> lista = q.list();
        Iterator<Cliente> iter = lista.iterator();
        //aca termina la magia

        tx.commit();
        session.close();
        //fin de todo y solo se toma la lista pasandola a  un array list
        while (iter.hasNext()) {
            Cliente noti = (Cliente) iter.next();
            arreglo.add(noti);

        }

        return arreglo;
    }

}

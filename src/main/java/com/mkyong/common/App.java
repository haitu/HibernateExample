package com.mkyong.common;

import hai.Employee;
import hai.EmployeeCrud;
import hai.ShowroomCrud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.mkyong.persistence.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        
        stock.setStockCode("47152");
        stock.setStockName("GENM");
        
        session.save(stock);
        
        String hql = "FROM Stock as s";
		Query query = session.createQuery(hql);
		List<Stock> results = query.list();
		Stock st = (Stock)results.get(0);
        System.out.println(st);
        
        String hql1 = "FROM Employee as e";
		Query query1 = session.createQuery(hql1);
		List<Employee> results1 =query1.list();
		Employee e1 = (Employee)results1.get(0);
        System.out.println(e1);
        
        EmployeeCrud ecrud = new EmployeeCrud();
        //ecrud.addMultipleEmployee(session);
        //ecrud.add(session);
        //ecrud.readAll(session);
        
        ShowroomCrud src = new ShowroomCrud();
        src.add(session);
		
        session.getTransaction().commit();
        System.out.println("Process is done.");
    }
}

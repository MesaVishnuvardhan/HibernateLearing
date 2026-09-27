package org.Vishnu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Employ6ee emp = new  Employ6ee();

        Laptop laptop = new Laptop();

        laptop.setLaptopSize("13 Inches");
        laptop.setLaptopModel("Intel i5");
        laptop.setLaptopBrand("Dell");
        laptop.setLaptopPrice(150000);


        emp.setEmpName("John");
        emp.setEmpJobRole("Java developer");
        emp.setLaptop(emp.getLaptop());
        emp.setEmpID(201);
        emp.setLaptop(laptop);// Link the Main Table


        // Hibernate --> Process

//        Student student = new Student();
//        student.setRollNo(6);
//        student.setsName("Sanjana..");
//        student.setsAge(19);
//
//        Student s2 = null;


        Configuration configuration = new Configuration()
                .configure()
                .addAnnotatedClass(org.Vishnu.Employ6ee.class)
                .addAnnotatedClass(org.Vishnu.Laptop.class); // By Acces The Class Annotations

//      configuration.addAnnotatedClass(org.Vishnu.Employ6ee.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.merge(emp); // Updates The Row
        transaction.commit(); // Permently Storing


        session.close();
        sessionFactory.close();
    }
}
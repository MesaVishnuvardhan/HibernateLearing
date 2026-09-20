package org.Vishnu;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        // Hibernate --> Process

        Student student = new Student();
        student.setRollNo(1);
        student.setsName("Vishnu");
        student.setsAge(19);


        Configuration configuration = new Configuration().configure();

        configuration.addAnnotatedClass(org.Vishnu.Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        try{
            System.out.println("Before persisting");
            session.persist(student); // Using Persiste instead of save coz new version remove save() method

            transaction.commit();
            System.out.println("Successfully persisted student");
            System.out.println(student);
        }catch(Exception e){
            if(transaction != null){
                transaction.rollback(); // RollBack transaction
            }
            e.printStackTrace();
        }finally{
            session.close();
            sessionFactory.close();
        }
//        session.persist(student);
//        transaction.commit();
//        System.out.println(student);
    }
}
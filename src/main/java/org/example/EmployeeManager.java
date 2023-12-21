package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeManager {

    private final SessionFactory factory;

    public EmployeeManager() {
        this.factory = new Configuration()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
    }

    public Employee getEmployee(int id) {
        try (Session session = factory.openSession()) {
            return session.get(Employee.class, id);
        }
    }

    public List<Employee> getEmployees() {
        try (Session session = factory.openSession()) {
            Query<Employee> query = session.createQuery("from Employee", Employee.class);
            return query.list();
        }
    }

    public boolean updateEmployee(Employee employee) {
        try (Session session = factory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.merge(employee);
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean addEmployee(Employee employee) {
        try (Session session = factory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(employee);
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deleteEmployee(Employee employee) {
        try (Session session = factory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(employee);
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

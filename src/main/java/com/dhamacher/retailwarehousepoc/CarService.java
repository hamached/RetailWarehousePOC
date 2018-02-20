package com.dhamacher.retailwarehousepoc;

import com.dhamacher.retailwarehousepoc.model.Car;
import java.util.List;
import org.hibernate.Session;

public class CarService {
    
    private CarService() {};
    
    public static Car getCarById(Long id) {
        
        Car car;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            car = session.get(Car.class, id);
        }
        
        return car;
    }    
    
    public static List<Car> getCars() {
        
        List<Car> cars;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            cars = session.createQuery("from Car").list();
        }
        return cars;
    }
    
    public static void save(Car car) {
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            
            session.save(car);
            
            session.getTransaction().commit();
        }
    }
}
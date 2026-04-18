package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(8);
        System.out.println(seller);

        System.out.println("=== TEST 2: seller findById ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        //System.out.println("\n=== TEST 4: seller Insert ===");
        //Seller newSeller = new Seller(null, "Manu", "manu@gmail.com", new Date(), 100000.0, department);
        //sellerDao.insert(newSeller);
        //System.out.println("Insert! New id = " + newSeller.getId());

        System.out.println("\n=== TEST 5: seller UPDATE===");
        seller = sellerDao.findById(2);
        seller.setName("AMOR");
        sellerDao.update(seller);
        System.out.println("UPDATE COMPLETED!");

    }
}

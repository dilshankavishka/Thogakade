package database;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class DBConnection {
    private static  DBConnection instance;
    private List<Customer> connection;
    private DBConnection(){
        connection = new ArrayList<>();
    }

    public static DBConnection getInstance(){
            return instance == null ? new DBConnection() : instance;
    }

    public List<Customer> getConnection(){
        return connection;
    }
}

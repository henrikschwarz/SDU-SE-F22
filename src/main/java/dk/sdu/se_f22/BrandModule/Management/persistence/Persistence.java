package dk.sdu.se_f22.BrandModule.Management.persistence;

import dk.sdu.se_f22.SharedLibrary.models.Brand;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Persistence implements IPersistence {
    private Connection c = null;

    public Persistence() {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/semesterprojekt",
                            "postgres", "new_password");
        } catch (Exception e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
    }

    @Override
    public void createBrand(Brand brand) {

    }

    @Override
    public Brand getBrand(int id) {
        return null;
    }

    @Override
    public void deleteBrand(int id) {

    }

    @Override
    public void updateBrand(int id, Brand brand) {

    }

    @Override
    public void setupDatabase() {
        try {
            var stmt = c.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS Brand " +
                    "(id serial PRIMARY KEY," +
                    "name VARCHAR(255) UNIQUE NOT NULL, " +
                    "description VARCHAR(10000), " +
                    "founded VARCHAR(255), " +
                    "headquarters VARCHAR(255));";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    // Testing connection to Postgres database
    public static void main(String[] args) {
        Persistence persistence = new Persistence();
        persistence.setupDatabase();
    }
}

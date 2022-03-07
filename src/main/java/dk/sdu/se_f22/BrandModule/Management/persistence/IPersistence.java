package dk.sdu.se_f22.BrandModule.Management.persistence;

import dk.sdu.se_f22.SharedLibrary.models.Brand;

public interface IPersistence {
    public void createBrand(Brand brand);
    public Brand getBrand(int id);
    public void deleteBrand(int id);
    public void updateBrand(int id, Brand brand);
    public void setupDatabase();
}
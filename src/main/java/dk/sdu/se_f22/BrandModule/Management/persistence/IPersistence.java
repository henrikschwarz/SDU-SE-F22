package dk.sdu.se_f22.BrandModule.Management.persistence;

import dk.sdu.se_f22.SharedLibrary.models.Brand;

public interface IPersistence {

    public void createBrand(Brand brand);

    public Brand getBrand(int id);

    public Brand getBrand(String name);

    public void removeBrand(Brand brand);

    public Brand updateBrand(Brand brand);

    public void setIndexInterval(int indexInterval);

    public void setupDatabase();


}

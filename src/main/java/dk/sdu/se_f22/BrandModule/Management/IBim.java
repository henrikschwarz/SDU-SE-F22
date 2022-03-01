package dk.sdu.se_f22.BrandModule.Management;

import dk.sdu.se_f22.SharedLibrary.models.Brand;

public interface IBim {

    //create a new brand in the database
    public void createBrand(Brand brand);

    //get a brand from database
    public Brand getBrand(int id);
    public Brand getBrand(String name);

    //remove a brand from the database
    public void removeBrand(Brand brand);

    //update brand on the database
    public Brand updateBrand(Brand brand);

    //set the index interval
    public void setIndexInterval(int indexInterval);






}


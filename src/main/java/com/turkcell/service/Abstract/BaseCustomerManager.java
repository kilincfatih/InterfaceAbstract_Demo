package com.turkcell.service.Abstract;

import com.turkcell.entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

    // ICustomerService interfacesinde ki Save methodunu somut bir şekilde gerçekleştirir
    // ve konsola kayıt oluşturulduğuna dair mesaj yazdırır
    @Override
    public  void Save(Customer customer) {
        System.out.println("Saved to DB : " + customer.getFirstName());
    }

}

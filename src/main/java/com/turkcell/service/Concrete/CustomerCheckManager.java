package com.turkcell.service.Concrete;

import com.turkcell.entities.Customer;
import com.turkcell.service.Abstract.ICustomerCheckService;

// Customer nesnesinin gerçek kişi olduğunu varsayıyoruz
public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}

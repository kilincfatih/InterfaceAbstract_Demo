package com.turkcell.service.Concrete;

import com.turkcell.entities.Customer;
import com.turkcell.service.Abstract.BaseCustomerManager;
import com.turkcell.service.Abstract.ICustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {
    ICustomerCheckService iCustomerCheckService;
    public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService){
        this.iCustomerCheckService = iCustomerCheckService;
    }

    // Mernis doğrulaması yaparak customer'in gerçek olup olmadığını kontrol eder ve
    // eğer gerçek ise save methodu çalışacak ve kayıt yapılacak.
    @Override
    public void Save(Customer customer){
        if(iCustomerCheckService.checkIfRealPerson(customer)){
            super.Save(customer);
        }else {
            throw new RuntimeException ("Not a valid person");
        }
    }
}

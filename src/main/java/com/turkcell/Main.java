package com.turkcell;

import com.turkcell.entities.Customer;
import com.turkcell.service.Abstract.BaseCustomerManager;
import com.turkcell.service.Concrete.CustomerCheckManager;
import com.turkcell.service.Concrete.NeroCustomerManager;
import com.turkcell.service.Concrete.StarbucksCustomerManager;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        BaseCustomerManager customerManager = new NeroCustomerManager();
        Customer newCustomer = new Customer();
        newCustomer.setDateOfBirth(LocalDate.of(2002, 2, 8));
        newCustomer.setFirstName("Fatih");
        newCustomer.setLastName("Kılınç");
        newCustomer.setNationalityId("52478569963");

        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager()); // new MernisServiceAdapter()
        BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
        starbucksCustomerManager.Save(newCustomer);
        neroCustomerManager.Save(newCustomer);
    }
}
package com.turkcell.service.Abstract;

import com.turkcell.entities.Customer;

// Customer'ın gerçek kişi olup olmadığını kontrol etmek için kullanılır
public interface ICustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}

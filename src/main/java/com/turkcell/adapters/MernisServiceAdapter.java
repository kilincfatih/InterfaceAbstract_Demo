package com.turkcell.adapters;

import com.turkcell.entities.Customer;
import com.turkcell.service.Abstract.ICustomerCheckService;
import connectedServices.mernis.MernisClient;

//MernisClient sınıfı kullanılarak Mernis doğrulaması yapar
public class MernisServiceAdapter implements ICustomerCheckService {
    MernisClient mernisClient;
    public MernisServiceAdapter(){
        this.mernisClient = new MernisClient();
    }
    @Override
    public boolean checkIfRealPerson(Customer customer){
        int year = customer.getDateOfBirth().getYear();
        return this.mernisClient.TCKimlikNoDogrula(
                customer.getNationalityId(),
                customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),
                String.valueOf(year)
        );
    }
}

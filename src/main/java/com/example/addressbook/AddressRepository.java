package com.example.addressbook;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address, Long>{
    List<Address> findAddressBy(String str);
}

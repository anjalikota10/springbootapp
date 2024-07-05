package com.example.myFirstProject;
import com.example.myFirstProject.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
@RestController
public class CustomerController {
    @GetMapping("customer")
    public List<Customer> data()
    {
        List<Customer> cust=new ArrayList<Customer>();
        int cust_id=1;
        String name="Lavanya";
        String product_name="Coffee Powder";
        int price=200;
        cust.add(new Customer(cust_id,name,product_name,price));
        return cust;
    }

}

package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/amazon")
// http://localhost:8080/amazon --> AmazonController amazonController = amazonObj.getController();
public class AmazonController {

//    http://localhost:8080/amazon/products --> amazonController.getProducts();
    @RequestMapping(value = "/products")
    public String getProducts()
    {
        return "products";
    }
    @RequestMapping(value = "/customer")
    public  String customer()
    {
        return "customer";
    }
    @RequestMapping(value = "/payment")
    public String payment()
    {
        return "payment";
    }
    @RequestMapping(value = "/discount")
    public String discount()
    {
        return "discount";
    }
    @RequestMapping(value = "/returns")
    public String returns()
    {
        return "return";
    }
}

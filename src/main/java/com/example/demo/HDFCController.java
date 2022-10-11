package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hdfc")
public class HDFCController {
    @RequestMapping(value = "/savings")
    public String savingsAccount()
    {
        return "Savings Account";
    }
    @RequestMapping(value = "/current")
    public  String currentAccount()
    {
        return "Current Account";
    }
    @RequestMapping(value = "/homeLoan")
    public String homeLoan()
    {
        return "Home Loan";
    }
}

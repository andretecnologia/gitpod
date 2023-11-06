package com.example.springpostgres.controller;

import com.example.springpostgres.entity.Account;
import com.example.springpostgres.dao.AccountRepository;
import com.example.springpostgres.logic.AccountLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountLogic accountLogic;
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping()
    @ResponseBody()
    public List<Account> account(){
        Account account = new Account();
        account.setUserId(2);
        account.setUsername("ANDRE");
        
        accountRepository.save(account);
        return accountLogic.getAccounts();
    }
}

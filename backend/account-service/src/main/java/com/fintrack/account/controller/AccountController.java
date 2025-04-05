package com.fintrack.account.controller;

import com.fintrack.account.entity.AccountEntity;
import com.fintrack.account.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<AccountEntity> getAll() {
        return service.findAll();
    }

    @PostMapping
    public AccountEntity create(@RequestBody AccountEntity account) {
        return service.create(account);
    }
}

//========================================================================================================
//package com.fintrack.account.controller;
//
//import org.springframework.web.bind.annotation.*;
//import java.util.*;
//
//@RestController
//@RequestMapping("/api/accounts")
//public class AccountController {
//
//    @GetMapping
//    public List<Map<String, String>> getAllAccounts() {
//        return List.of(
//                Map.of("id", "1", "name", "Cash"),
//                Map.of("id", "2", "name", "Receivables")
//        );
//    }
//}

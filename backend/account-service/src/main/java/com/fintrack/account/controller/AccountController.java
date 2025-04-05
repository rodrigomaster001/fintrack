package com.fintrack.account.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @GetMapping
    public List<Map<String, String>> getAllAccounts() {
        return List.of(
                Map.of("id", "1", "name", "Cash"),
                Map.of("id", "2", "name", "Receivables")
        );
    }
}

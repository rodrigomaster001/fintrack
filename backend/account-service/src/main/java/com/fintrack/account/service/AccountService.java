package com.fintrack.account.service;

import com.fintrack.account.entity.AccountEntity;
import com.fintrack.account.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public List<AccountEntity> findAll() {
        return repository.findAll();
    }

    public AccountEntity create(AccountEntity account) {
        account.setId(UUID.randomUUID());
        return repository.save(account);
    }
}

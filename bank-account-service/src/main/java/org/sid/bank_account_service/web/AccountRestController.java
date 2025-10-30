package org.sid.bank_account_service.web;

import org.sid.bank_account_service.Services.IbankAccountService;
import org.sid.bank_account_service.dto.BankAccountRequestDto;
import org.sid.bank_account_service.dto.BankAccountResponseDto;
import org.sid.bank_account_service.entities.BankAccount;
import org.sid.bank_account_service.repositories.BankAccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
 @RestController
 @RequestMapping("/api")
public class AccountRestController {
     private final IbankAccountService ibankAccountService;
     public BankAccountRepository bankAccountRepository;

    public AccountRestController(BankAccountRepository bankAccountRepository, IbankAccountService ibankAccountService) {
        this.bankAccountRepository = bankAccountRepository;
        this.ibankAccountService = ibankAccountService;
    }


    @PostMapping("/bankAccounts")
    public BankAccountResponseDto save (BankAccountRequestDto bankAccount) {
        return ibankAccountService.addAccount(bankAccount);
    }


    }



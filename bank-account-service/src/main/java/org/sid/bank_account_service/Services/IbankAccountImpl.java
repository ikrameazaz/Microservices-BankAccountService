package org.sid.bank_account_service.Services;

import org.sid.bank_account_service.Mappers.BankAccountMapper;
import org.sid.bank_account_service.dto.BankAccountRequestDto;
import org.sid.bank_account_service.dto.BankAccountResponseDto;
import org.sid.bank_account_service.entities.BankAccount;
import org.sid.bank_account_service.repositories.BankAccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service @Transactional
public class IbankAccountImpl implements IbankAccountService{

    BankAccountRepository bankAccountRepository;
    BankAccountMapper bankAccountMapper;

    public IbankAccountImpl(BankAccountRepository bankAccountRepository , BankAccountMapper bankAccountMapper) {
        this.bankAccountRepository = bankAccountRepository;
        this.bankAccountMapper = bankAccountMapper;
    }

    @Override
    public BankAccountResponseDto addAccount(BankAccountRequestDto bankAccountDto) {
        BankAccount bankAccount = BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .createdAt(new Date())
                .balance(bankAccountDto.getBalance())
                .type(bankAccountDto.getType())
                .currency(bankAccountDto.getCurrency())

                .build();
        BankAccount savedBankAccount=bankAccountRepository.save(bankAccount);
        BankAccountResponseDto bankAccountResponseDto =bankAccountMapper.fromBankAccount(savedBankAccount);



        return bankAccountResponseDto;

    }
}

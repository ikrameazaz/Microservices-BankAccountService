package org.sid.bank_account_service.Services;

import org.sid.bank_account_service.dto.BankAccountRequestDto;
import org.sid.bank_account_service.dto.BankAccountResponseDto;
import org.sid.bank_account_service.entities.BankAccount;

public interface IbankAccountService {

    public BankAccountResponseDto addAccount (BankAccountRequestDto bankAccountRequestDto);
}

package org.sid.bank_account_service.Mappers;

import org.sid.bank_account_service.dto.BankAccountRequestDto;
import org.sid.bank_account_service.dto.BankAccountResponseDto;
import org.sid.bank_account_service.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class BankAccountMapper {

    public BankAccountResponseDto fromBankAccount (BankAccount bankAccount) {
        BankAccountResponseDto bankAccountResponseDto=new BankAccountResponseDto();
        BeanUtils.copyProperties(bankAccount,bankAccountResponseDto);
        return bankAccountResponseDto;

    }
}

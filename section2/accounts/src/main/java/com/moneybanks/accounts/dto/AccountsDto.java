package com.moneybanks.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class AccountsDto {

    @NotEmpty(message = "AccountNumber cannot be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "AccountType cannot be a null or empty")
    private String accountType;

    @NotEmpty(message = "BranchAddress cannot be a null or empty")
    private String branchAddress;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    @Override
    public String toString() {
        return "AccountsDto{" +
                "accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                ", branchAddress='" + branchAddress + '\'' +
                '}';
    }
}

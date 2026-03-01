package com.moneybanks.accounts.service;

import com.moneybanks.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto);


    /**
     * @param mobileNumber Input Mobile Number
     * @return Account Details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

}

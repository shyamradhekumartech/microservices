package com.moneybanks.accounts.service;

import com.moneybanks.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto);

}

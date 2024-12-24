// Created by PhonePe

package Adapter.WithAdapter;

import Adapter.WithoutAdapter.ThirdPartyAPI.YesBankApi;

public class YesBankApiAdapter implements BankApiAdapter{
    private YesBankApi api = new YesBankApi();

    @Override
    public int getBalance() {
        return api.balanceCheck();
    }

    @Override
    public void addFunds() {
        api.moneyAdd();
    }
}

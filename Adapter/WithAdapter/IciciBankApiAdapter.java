// Created by PhonePe

package Adapter.WithAdapter;

import Adapter.WithoutAdapter.ThirdPartyAPI.IciciBankApi;

public class IciciBankApiAdapter implements BankApiAdapter{
    private IciciBankApi api = new IciciBankApi();

    @Override
    public int getBalance() {
        return api.checkBalance();
    }

    @Override
    public void addFunds() {
        api.addMoney();
    }
}

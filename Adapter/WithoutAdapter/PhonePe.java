// A lot of changes to be done if Yes Bank crashes as now we will have to integrate ICICI band ALI's into the PhonePe system

package Adapter.WithoutAdapter;


import Adapter.WithAdapter.ThirdPartyAPI.YesBankApi;

public class PhonePe {
    public int checkBalance() {
        YesBankApi api = new YesBankApi();

        int balance = api.balanceCheck();

        return balance;
    }

    // many more methods
}

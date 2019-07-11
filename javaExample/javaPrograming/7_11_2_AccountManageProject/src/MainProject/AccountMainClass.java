package MainProject;

import MainProject.common.AccountCommon;

public class AccountMainClass {
    public static void main(String[] args)
    {
        AccountManagement am = new AccountManagement();

        am.insertAccount(AccountCommon.generateAccount(true));
        am.insertAccount(AccountCommon.generateAccount(true));
        am.insertAccount(AccountCommon.generateAccount(true));
        am.insertAccount(AccountCommon.generateAccount(true));
        am.insertAccount(AccountCommon.generateAccount(false));

        am.totalDisplay();

        am.interest();

        am.totalDisplay();
    }
}

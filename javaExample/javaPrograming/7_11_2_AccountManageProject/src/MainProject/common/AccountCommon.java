package MainProject.common;

import MainProject.Account;

import java.util.Random;

public class AccountCommon {

    private static Random random = new Random(System.currentTimeMillis());

    public static Account generateAccount(boolean flag){
        Account account = null;
        int grade = -1;
        float balance = 0.0f;
        String aNumber = "", aName = "";

        if(flag) {

             grade = random.nextInt(3) + 1;
             balance = Math.abs(random.nextInt());
             aNumber = String.valueOf(Math.abs(random.nextLong()));
             aName = "accountOwner_" + random.nextInt(1000000);
             account = new Account(balance,aNumber,aName,grade);

            return new Account(balance, aNumber, aName, grade);
        }else{
            balance = Math.abs(random.nextInt());
            aNumber = String.valueOf(Math.abs(random.nextLong()));
            aName = "accountOwner_" + random.nextInt(1000000);
            account = new Account(balance,aNumber,aName);

        }
        return  account;
    }

}

package com.iot.account.first;

public class AccountFirstMain {

    public static void main(String args[]){

        AccountManagement am = new AccountManagement();

        am.insertAccount(100000,"1111","계좌1");
        am.insertAccount(200000,"2222","계좌2");
        am.insertAccount(300000,"3333","계좌3");
        am.insertAccount(400000,"4444","계좌4");
        am.insertAccount(500000,"5555","계좌5");
        am.insertAccount(600000,"6666","계좌6");

        am.removeAccount("3333");

        am.deposit(50000,"1111");
        am.displayAccount("1111");

        am.withdraw(50000,"2222");
        am.displayAccount("2222");

        float totalBalance = am.getTotalBalance();
        System.out.println("전체 잔고는 " + totalBalance + " 입니다");

        am.averageBalance();
        am.displayAll();
    }
}

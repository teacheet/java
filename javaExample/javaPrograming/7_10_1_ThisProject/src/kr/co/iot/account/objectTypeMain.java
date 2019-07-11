package kr.co.iot.account;

import java.util.Random;

public class objectTypeMain {

    public objectTypeMain(){
        super();
    }
    public static void main(String[] args) {
        objectTypeMain typeobj = new objectTypeMain();
//        typeobj.instanceofTesting();
        displayAccount();
//
//        System.out.println("typeobj => " + typeobj.toString());
    }

    public void instanceofTesting(){
//        System.out.println("this => " + this.toString());

        Account [] accounts = new Account[10];
        accounts[0] = new Account(50000,"12345","현준");

        accounts[0].deposit(50000);

        System.out.println(accounts[0].toString());

        if(accounts instanceof Account[]){
            System.out.println("accounts는 Account[] 객체 타입 입니다.");
        }
        if(accounts[0] instanceof Account){
            System.out.println("accounts[0]는 Account 객체 타입 입니다.");
        }
    }
    //Account 배열객체 11개를 만들어 우리반원들의 계좌를 생성하고 총 평균을 구하라
    public static void displayAccount(){
//        Account [] accounts = new Account[10];

//
//        accounts[0] = new Account(50000,"12345","현준0");
//        accounts[1] = new Account(90000,"12345","현준1");
//        accounts[2] = new Account(20000,"12345","현준2");
//        accounts[3] = new Account(10000,"12345","현준3");
//        accounts[4] = new Account(50000,"12345","현준4");
//        accounts[5] = new Account(30000,"12345","현준5");
//        accounts[6] = new Account(20000,"12345","현준6");
//        accounts[7] = new Account(50000,"12345","현준7");
//        accounts[8] = new Account(40000,"12345","현준8");
//        accounts[9] = new Account(90000,"12345","현준9");
//
//        int aa = 0;
//        for(int i = 0; i < accounts.length;i++){
//            aa += accounts[i].getBalance();
//        }
//        System.out.println(aa/accounts.length);

        Account [] accounts = new Account[11];

        Random random = new Random(System.currentTimeMillis());

        float sum = 0f;

        for(int i = 0; i <accounts.length;i++){
            int balance = random.nextInt();
        }


    }
}

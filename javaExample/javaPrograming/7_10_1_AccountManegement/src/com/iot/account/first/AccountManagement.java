package com.iot.account.first;

public class AccountManagement {
    private Account [] accounts;
    /*
    * 실제 배열에 들어갈 최종 개수
    * */
    private int increment;
    public AccountManagement(){
        accounts = new Account[5];
    }
    public AccountManagement(int initSize){
        if( initSize > 0) {
            accounts = new Account[initSize];
        }else{
            accounts = new Account[10];
        }
    }
    /*
    * 계좌객체를 추가하는 메소드
    * */
    public void insertAccount(float balance, String aNumber, String aName){
        accounts[increment++] = new Account(balance,aNumber,aName);
    }
    /*
    * 입금하는 메소드
    * */
    public void deposit(float money,String aNumber) {
//        for (int i = 0; i < increment; i++) {
//            String accountNumber = accounts[i].getAccountNumber();
//            if (accountNumber.equals(aNumber)) {
//                float balance = accounts[i].getBalance() + money;
//                accounts[i].setBalance(balance);
//                break;
//            }
//        }
        Account account = this.findAccount(aNumber);
        if( account != null ){
            account.setBalance(account.getBalance() + money);
        }else{
            System.out.println(aNumber + "  계좌가 없네요!!");
        }
    }
    /*
    * 춤금하는 메소드
    * */
    public void withdraw(float money,String aNumber) {
//        for (int i = 0; i < increment; i++) {
//            String accountNumber = accounts[i].getAccountNumber();
//            if (accountNumber.equals(aNumber)) {
//                float balance = accounts[i].getBalance() - money;
//                accounts[i].setBalance(balance);
//                break;
//            }
//        }
        Account account = this.findAccount(aNumber);
        if( account != null ){
            account.setBalance(account.getBalance() - money);
        }else{
            System.out.println(aNumber + "  계좌가 없네요!!");
        }
    }
    private Account findAccount(String aNumber){
        Account tempAccount = null;
        //지역변수는 기본/객체타임이어도 초기화를 명시적으로 하는 습곤을 갓도록 하자
        for(int i = 0; i < increment ; i++){
            if(accounts[i].getAccountNumber().equals(aNumber)){
                tempAccount = accounts[i];
                break;
            }
        }
        return tempAccount;
    }
    /*
    * 전체 계좌의 총합을 나타내는 매소드
    * */
    public float getTotalBalance(){
        float sum = 0f;
        for(int i = 0 ; i < increment ; i++){
            sum += accounts[i].getBalance();
        }
        return sum;
    }
    /*
    * 전체 잔고 평균을 구함
    * */
    public void averageBalance(){
        System.out.println(" 전체 평균 잔액은 " + getTotalBalance()/increment);
    }
    /*
    * 계좌번호별 잔고 출력하는 메소드
    * */
    public void displayAccount(String aNumber){
        Account account = findAccount(aNumber);
        if( account != null){
            System.out.println(account.toString());
        }else{
            System.out.println(aNumber + " 라는 계좌번호는 존재하지 않네요!");
        }
    }
    public void displayAll(){
        for(int i = 0; i < increment; i++){
            System.out.println(accounts[i].toString());
        }
    }
//    public void removeAccount(String aNumber)
//    {
//        //없어질 배열의 인덱스를 저장;
//        int j = 0;
//        Account account = findAccount(aNumber);
//
//        for(int i = 0;i < increment ; i++){
//
//            if(accounts[i] == account){
//                j=i;
//            }else{
//                accounts[j]=accounts[i];
//                j++;
//            }
//        }
//        //System.out.println(accounts[increment-2]);
//        // System.out.println(accounts[increment-1]);
//        accounts[increment-1]=null;
//        increment--;
//    }
    public void removeAccount(String aNumber){
        for (int i = 0; i < increment ; i++){
            if(aNumber.equals(accounts[i].getAccountNumber())){
                for(int j = i; j < increment;){
                    accounts[j] =  accounts[++j];
                }
                increment--;
                break;
            }
        }
    }
    public void insert(float balance,String aNumber,String aName){
        if( accounts.length != increment ){
            accounts[increment++] = new Account(balance, aNumber, aName);
        }else{
            Account tempAccounts [] = new Account [ accounts.length * 2 ];
            for(int i = 0 ; i < increment ; i++){
                tempAccounts[i] = accounts[i];
            }
            accounts = tempAccounts;
            accounts[increment++] = new Account(balance, aNumber, aName);
        }
    }
}

















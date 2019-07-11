package MainProject;

import MainProject.common.AccountConstant;


public class AccountManagement {

    private Account [] accounts;
    /*
        실제 배열에 들어갈 최종 개수
     */

    private int increment;
    private int capacity;

    public AccountManagement() {
        accounts = new Account[10];
        capacity = accounts.length;
    }

    public AccountManagement(int initSize)
    {
        if(initSize > 0 ) {
            accounts = new Account[initSize];
            capacity = initSize;
        }
        else{
            accounts = new Account[10];
            capacity = accounts.length;
        }
    }


    /*
     계좌 객체를 추가하는 메소드
    */

    public void insertAccount(float balance, String aNumber, String aName){

        if(accounts.length == increment)
        {

            int newSize = increment * 2;

            Account[] temp = new Account[newSize];

            for (int i = 0; i < accounts.length; i++) {
                temp[i] = accounts[i];
            }
            //temp[temp.length-1] = new Account(balance, aNumber, aName);

            accounts = temp;

            accounts[increment++] = new Account(balance, aNumber, aName);
        }
        else
        {
            accounts[increment++] = new Account(balance, aNumber, aName);

        }

    }

    public void insertAccount(Account insertedAccount){

        if(accounts.length == increment)
        {

            int newSize = increment * 2;

            Account[] temp = new Account[newSize];

            for (int i = 0; i < accounts.length; i++) {
                temp[i] = accounts[i];
            }
            //temp[temp.length-1] = new Account(balance, aNumber, aName);

            accounts = temp;

            accounts[increment++] = insertedAccount;
        }
        else
        {
            accounts[increment++] = insertedAccount;

        }

    }


    /*
    * 입금하는 메소드
    */

    public boolean deposit(float money, String aNumber) {

        boolean flags = false;
        Account account = findAccount(aNumber);

        if(account != null)
        {
            account.setBalance(account.getBalance() + money);
            flags = true;
        }
        else { System.out.println(aNumber + "계좌가 존재하지 않습니다."); }

        return flags;
    }

    /* 출금메서드 */

    public void withdraw(float money, String aNumber) {

        Account account = findAccount(aNumber);

        if(account != null)
        {
            account.setBalance(account.getBalance() - money);
        }
        else { System.out.println(aNumber + "계좌가 존재하지 않습니다."); }
    }


    private Account findAccount(String aNumber) {

        Account Result = null;

        for(int i = 0; i < increment ; i++){
            if(accounts[i].getAccountNumber().equals(aNumber)) {
                Result = accounts[i];
                break;
            }
        }
        return Result;
    }

    /*
        전쳬 계좌의 총합을 알려주는 메소드
    */
    public float getTotalBalance()
    {
        float sum = 0f;
        for(int i = 0; i < increment ; i++)
        {
            sum += accounts[i].getBalance();
        }
        return sum;
    }

    /*
        전체 계좌의 평균을 알려주는 메소드
     */
    public void averageBalance() {
        System.out.println("전체 평균 잔액은 " + getTotalBalance() / increment + "원 입니다.");
    }


    /*
        계좌 번호별 잔고 출력
     */
    public void displayAccount(String aNumber)
    {
        Account account = findAccount(aNumber);
        if(account != null){
            System.out.println(account.toString());
        }else System.out.println(aNumber + "계좌 번호가 없습니다");
    }

    public void totalDisplay()
    {
        for(int i = 0; i < increment ; i++)
        {
            System.out.println(accounts[i].toString());
        }
        System.out.println();
    }


    /*
    계좌를 삭제하는 메소드
     */

    public void removeAccount(String aNumber) {
        // vector 방식

        /*Account[] temp = new Account[increment-1];

        int j = 0;

        for (int i = 0; i < increment; i++) {
            if (accounts[i].getAccountNumber().equals(aNumber)) {
                continue;
            } else {
                temp[j] = accounts[i];
                j++;

            }
        }

        increment--;
        accounts = temp;
    }*/


        // 순차 탐색 후 찾은 값과 교환
        /*int index = 0;
        for(int i = 0 ; i < increment ;i++)
        {
            if(accounts[i].getAccountNumber().equals(aNumber))
            {
                index = i ;
                Account temp = accounts[index];
                accounts[index] = accounts[increment - 1];
                accounts[increment - 1] = accounts[index];
            }
        }
        increment--;
        accounts[increment] = null;
         */


        // 순차탐색 후 순차 교환
        int index = 0;
        for(int i = 0 ; i < increment ;i++)
        {
            if(accounts[i].getAccountNumber().equals(aNumber))
            {
                index = i ;
            }
        }
        for(int j = index; j < increment ; j++)
        {
            Account temp = accounts[j];
            accounts[j] = accounts[j + 1];
            accounts[j + 1] = temp;
        }
        increment--;
        accounts[increment] = null;
    }

    /*
    * 이자율을 적용하라
    * */

    public void interest()
    {
//        for(int i = 0; i < increment ; i++) {
//            if (accounts[i].getGrade() == AccountConstant.GRADE_GOLD) {
//                accounts[i].setBalance(accounts[i].getBalance() + accounts[i].getBalance() * AccountConstant.INTEREST_GOLD_RATE);
//            } else if (accounts[i].getGrade() == AccountConstant.GRADE_SILVER) {
//                accounts[i].setBalance(accounts[i].getBalance() + accounts[i].getBalance() * AccountConstant.INTEREST_SILVER_RATE);
//            } else if (accounts[i].getGrade() == AccountConstant.GRADE_BRONZE) {
//                accounts[i].setBalance(accounts[i].getBalance() + accounts[i].getBalance() * AccountConstant.INTEREST_BRONZE_RATE);
//            }
//        }

        //
        for(int i = 0; i < increment ; i++) {
            float balance = accounts[i].getBalance();
            switch (accounts[i].getGrade()) {
                case AccountConstant.GRADE_GOLD:
                    accounts[i].setBalance(balance + balance * AccountConstant.INTEREST_GOLD_RATE);
                    break;
                case AccountConstant.GRADE_SILVER:
                    accounts[i].setBalance(balance + balance * AccountConstant.INTEREST_SILVER_RATE);
                    break;
                case AccountConstant.GRADE_BRONZE:
                    accounts[i].setBalance(balance + balance * AccountConstant.INTEREST_BRONZE_RATE);
                    break;
                    default:break;
            }
        }


    }

//    accounts[i].setBalance(accounts[i].getGrade() * accounts[i].getBalance());

}

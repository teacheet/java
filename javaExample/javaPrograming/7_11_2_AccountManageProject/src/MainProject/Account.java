package MainProject;

public class Account {
    private float balance;
    private String accountNumber;
    private String accountName;
    private int grade;

    public Account() {}

    public Account(float balance, String accountNumber, String accountName) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public Account(float balance, String accountNumber, String accountName, int grade) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.grade = grade;
    }

    public float getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + (int)balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", grade=" + grade +
                '}';
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}

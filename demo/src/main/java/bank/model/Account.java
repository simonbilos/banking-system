package bank.model;

public class Account {
    private String accountNumber;
    private String firstName;
    private String surname;
    private String dateOfBirth;
    private String phoneNumber;
    private int balance;

    public Account(String id,String firstName, String surname, String dateOfBirth, String phoneNumber) {
        this.accountNumber = id;
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.balance = 0;
    }

    public String getFirtstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountInformation() {
        return "Account " + accountNumber + " is maintained under the name: " + firstName + " " + surname;
    }

    public void deposit(int balance) {
        this.balance = balance;
    }

    public int withdraw(int withdrawAmount) {
        if (this.balance < withdrawAmount) {
            throw new IllegalStateException("Not enough balance on an account!");
        }

        this.balance -= withdrawAmount;
        return this.balance;
    }

}
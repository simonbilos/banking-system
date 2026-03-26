package bank.model;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Customer {
    private String customerId;
    private String firstName;
    private String surname;
    private String dateOfBirth;
    private String phoneNumber;

    public Customer(String customerId, String firstName, String surname, String dateofBirth) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateofBirth;
    }

    public void updatePhoneNumber(String newPhoneNumber) {
        if (checkPhoneNumber(newPhoneNumber)) {
            this.phoneNumber = newPhoneNumber;
        }
        else {
            throw new IllegalArgumentException("Invalid phone number format");
        }
    }

    public boolean checkPhoneNumber(String phoneNumber) {
        String pattern = "(^09\\d{2}\\s?\\d{3}\\s?\\d{3}|^\\+421\\s?\\d{3}\\s?\\d{3}\\s?\\d{3})$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}

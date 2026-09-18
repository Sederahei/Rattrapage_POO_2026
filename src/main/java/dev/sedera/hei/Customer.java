package dev.sedera.hei;


import java.time.LocalDate;

public class Customer {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String address;
    private String email;
    private String phoneNumber;

    public Customer(String firstName, String lastName, LocalDate birthDate,
                    String address, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + email + ")";
    }
}


package com.kodilla.testing.library;

public class LibraryUser {

    String firstName;
    String lastName;
    String peselId;

    public LibraryUser(String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public String toString() {
        return "LibraryUser{" + "firstName=" + firstName + '\'' + ", lastName=" + lastName + '\'' + ", peselId" + peselId + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof LibraryUser)) return false;
        LibraryUser that = (LibraryUser) obj;
        if (!firstName.equals(that.firstName)) return false;
        if (!lastName.equals(that.lastName)) return false;
        return peselId.equals(that.peselId);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + peselId.hashCode();
        return result;
    }
}


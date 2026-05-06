package com.pluralsight;

public class Formatting {
    private String firstName;
    private String lastName;
    private String middleName;
    private String prefix;
    private String suffix;

    public Formatting(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = null;
        this.prefix = null;
        this.suffix = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1) + " ";;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (middleName.isEmpty()) {
            middleName = "";
        } else {
            middleName = middleName.substring(0, 1).toUpperCase() + " ";
        }
        this.middleName = middleName;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        if (prefix.isEmpty()) {
            prefix = "";
        } else {
            prefix += " ";
        }
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        if (suffix.isEmpty()) {
            suffix = "";
        } else {
            suffix = ", " + suffix;
        }
        this.suffix = suffix;
    }

    @Override
    public String toString() {
        return prefix + firstName +  middleName + lastName + suffix;
    }
}

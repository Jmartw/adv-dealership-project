package com.pluralsight;

public abstract class Contract {

    private String dateOfContract;
    private String name;
    private String email;
    private Vehicle vehicle;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String dateOfContract, String name, String email, String vehicleSold) {
        this.dateOfContract = dateOfContract;
        this.name = name;
        this.email = email;
        this.vehicle = vehicle;
    }

    public String getDateOfContract() {
        return dateOfContract;
    }

    public void setDateOfContract(String dateOfContract) {
        this.dateOfContract = dateOfContract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract double getTotalPrice();

    public abstract double getmonthlyPayment ();

    @Override
    public String toString() {
        return "Contract{" +
                "dateOfContract='" + dateOfContract + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", vehicleSold='" + vehicle + '\'' +
                ", totalPrice=" + totalPrice +
                ", monthlyPayment=" + monthlyPayment +
                '}';
    }
}

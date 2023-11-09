package com.pluralsight;

public class LeaseContract extends Contract{

    private double value;

    private double fee;

    public LeaseContract(String dateOfContract, String name, String email, String vehicleSold, double value, double fee) {
        super(dateOfContract, name, email, vehicleSold);
        this.value = getVehicle().getPrice() * 0.50;
        this.fee = getVehicle().getPrice() * 0.07;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}

    @Override
    public double getTotalPrice() {
        return (getVehicleSold().getPrice() - expectedEndingValue) + leaseFee;
    }

    @Override
    public double getMonthlyPayment() {
        int numberOfPayments = 36;
        double interestRate = 4.0 / 1200;
        double monthlyPayment = getTotalPrice() * (interestRate * Math.pow(1 + interestRate, numberOfPayments)) / (Math.pow(1 + interestRate, numberOfPayments) - 1);
        monthlyPayment = Math.round(monthlyPayment * 100);
        monthlyPayment /= 100;
        return monthlyPayment;
    }
}
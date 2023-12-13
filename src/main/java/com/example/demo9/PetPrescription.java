package com.example.demo9;

public class PetPrescription {
    private String petId;
    private String prescription;
    private String days;
    private String drug;

    // Getters and setters for the prescription fields
    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    // Method to print prescription details
    public void printDetails() {
        System.out.println("Pet ID: " + petId);
        System.out.println("Prescription: " + prescription);
        System.out.println("Days: " + days);
        System.out.println("Drug: " + drug);
    }
}

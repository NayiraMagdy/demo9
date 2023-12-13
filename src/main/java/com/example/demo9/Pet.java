package com.example.demo9;

public class Pet {
    // Attributes
    private int prescriptionDays; // Number of days for prescription
    private String illnessState;
    private String adoptionState;

    // Constructor (if needed)

    // Getters and setters for the attributes
    public int getPrescriptionDays() {
        return prescriptionDays;
    }

    public void setPrescriptionDays(int prescriptionDays) {
        this.prescriptionDays = prescriptionDays;
    }

    public String getIllnessState() {
        return illnessState;
    }

    public void setIllnessState(String illnessState) {
        this.illnessState = illnessState;
    }

    public String getAdoptionState() {
        return adoptionState;
    }

    public void setAdoptionState(String adoptionState) {
        this.adoptionState = adoptionState;
    }
}

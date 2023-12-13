// PetPrescriptionController.java
package com.example.demo9;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PetPrescriptionController {

    @FXML
    private TextField petIdField;

    @FXML
    private TextField prescriptionField;

    @FXML
    private TextField daysField;

    @FXML
    private TextField drugField;

    @FXML
    private Button submitButton;

    private PetPrescription petPrescription;

    @FXML
    public void initialize() {
        submitButton.setOnAction(event -> handleSubmitButtonAction());
        petPrescription = new PetPrescription();
    }

    private void handleSubmitButtonAction() {
        petPrescription.setPetId(getPetId());
        petPrescription.setPrescription(getPrescription());
        petPrescription.setDays(getDays());
        petPrescription.setDrug(getDrug());

        petPrescription.printDetails(); // Method to print prescription details

        clearFields();
    }

    private void clearFields() {
        petIdField.clear();
        prescriptionField.clear();
        daysField.clear();
        drugField.clear();
    }

    public String getPetId() {
        return petIdField.getText();
    }

    public String getPrescription() {
        return prescriptionField.getText();
    }

    public String getDays() {
        return daysField.getText();
    }

    public String getDrug() {
        return drugField.getText();
    }

    // Assuming this method is responsible for handling the form submission
    public void handleSubmit() {
        int days = Integer.parseInt(getDays()); // Assuming 'days' is the number of days set for the prescription
        Pet pet = new Pet(); // Initialize or retrieve the Pet instance

        IllnessStateChanger.changeStateAfterDays(pet, days); // Handling state changes based on days
        AdoptionStateChanger.changeAdoptionStateAfterDays(pet, days);

        // Rest of your existing code after state changes...
    }
}

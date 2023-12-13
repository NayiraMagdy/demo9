// AdoptionStateChanger.java
package com.example.demo9;

public class AdoptionStateChanger {
    public static void changeAdoptionStateAfterDays(Pet pet, int days) {
        // Assuming a pet has an 'adoptionState' attribute and a method 'setAdoptionState'
        if (days >= pet.getPrescriptionDays()) {
            pet.setAdoptionState("Adoptable");
        }
    }
}

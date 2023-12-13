// IllnessStateChanger.java
package com.example.demo9;

public class IllnessStateChanger {
    public static void changeStateAfterDays(Pet pet, int days) {
        // Assuming a pet has an 'illnessState' attribute and a method 'setIllnessState'
        if (days >= pet.getPrescriptionDays()) {
            pet.setIllnessState("Good Health");
        }
    }
}

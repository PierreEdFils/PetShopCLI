package com.careerdevs;

import java.util.List;

public class Pet {

    // 1) Fields
    private String petshopName;
    private String petId;
    private List<Pet> availablePets;
    private List<Pet> soldPets;

    // 2) Constructor
    public Pet (String PetShop ){
        this.petshopName = PetShop;
    }

    // 3) Getter/Setter


    public String getPetshopName() {
        return petshopName;
    }

    public void setPetshopName(String petshopName) {
        this.petshopName = petshopName;
    }

    public List<Pet> getAvailablePets() {
        return availablePets;
    }

    public void setAvailablePets(List<Pet> availablePets) {
        this.availablePets = availablePets;
    }

    public List<Pet> getSoldPets() {
        return soldPets;
    }

    public void setSoldPets(List<Pet> soldPets) {
        this.soldPets = soldPets;
    }

    public void buyPet(String petId) {


    }

    public void  returnPet(String petId) {

    }
}

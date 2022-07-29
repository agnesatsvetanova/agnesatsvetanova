package com.InterfacesAndAbstraction.DefineAnInterfacePerson;

import com.InterfacesAndAbstraction.FoodShortage.Buyer;
import com.InterfacesAndAbstraction.MultipleImplementation.Birthable;
import com.InterfacesAndAbstraction.MultipleImplementation.Identifiable;

public class Citizen implements Person, Identifiable, Birthable, Buyer {

    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = food;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void buyFood() {
        food += 10;
    }

    @Override
    public int getFood() {
        return food;
    }
}

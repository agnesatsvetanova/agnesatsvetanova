package com.DefiningClasses.Google;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Parent> parents = new ArrayList<>();
    private List<Child> children = new ArrayList<>();
    private List<Pokemon> pokemons = new ArrayList<>();

    public Person(String name) {
        this.name = name;
        this.company = company;
        this.car = car;
        this.parents = parents;
        this.children = children;
        this.pokemons = pokemons;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(System.lineSeparator());
        sb.append("Company:").append(System.lineSeparator());
        if (this.company != null) {
            sb.append(this.company.toString()).append(System.lineSeparator());
        }
        sb.append("Car:").append(System.lineSeparator());
        if (this.car != null){
            sb.append(this.car.toString()).append(System.lineSeparator());
        }
        sb.append("Pokemon:").append(System.lineSeparator());
        if (this.pokemons != null){
            for(Pokemon p : pokemons) {
                sb.append(p).append(System.lineSeparator());
            }
        }
        sb.append("Parents:").append(System.lineSeparator());
        if (this.parents != null){
            for (Parent p : this.parents) {
                sb.append(p).append(System.lineSeparator());
            }
        }
        sb.append("Children:").append(System.lineSeparator());
        if (this.children != null){
            for(Child c : this.children) {
                sb.append(c).append(System.lineSeparator());
            }
        }
        return sb.toString().trim();
    }
}

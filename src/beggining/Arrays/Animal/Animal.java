package beggining.Arrays.Animal;

import beggining.Arrays.Product;

import java.util.Objects;

public class Animal implements Comparable<Animal> {

    private final String name;
    private final Integer weight;
    private final String animalBreed;

    public String getAnimalBreed() {
        return animalBreed;
    }

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    public Animal(String name, Integer weight, String animalBreed) {
        if (name == null || weight == null || animalBreed == null) {
            throw new IllegalArgumentException();
        }
            this.name = name;
            this.weight = weight;
            this.animalBreed = animalBreed;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal that = (Animal) o;
        return Objects.equals(name, that.name) && Objects.equals(weight, that.weight) && Objects.equals(animalBreed, that.animalBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, animalBreed);
    }

    @Override
    public String toString() {
        return "AnimalBreed{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", animalBreed='" + animalBreed + '\'' +
                '}';
    }
    public int compareTo(Animal o) {
        return name.compareTo(o.name);
    }
}


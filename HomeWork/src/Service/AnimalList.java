package Service;
import all.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AnimalList {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Cat> getCats() {
        List<Cat> cats = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                cats.add((Cat) animal);
            }
        }
        return cats;
    }

    public List<Dog> getDogs() {
        List<Dog> dogs = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                dogs.add((Dog) animal);
            }
        }
        return dogs;
    }

    public List<Hamster> getHamsters() {
        List<Hamster> hamsters = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Hamster) {
                hamsters.add((Hamster) animal);
            }
        }
        return hamsters;
    }

    public Cat findCat(String name) {
        Optional<Cat> optionalCat = getCats().stream()
                .filter(c -> c.getName().equals(name))
                .findFirst();
        return optionalCat.orElse(null);
    }

    public Dog findDog(String name) {
        Optional<Dog> optionalDog = getDogs().stream()
                .filter(d -> d.getName().equals(name))
                .findFirst();
        return optionalDog.orElse(null);
    }

    public Hamster findHamster(String name) {
        Optional<Hamster> optionalHamster = getHamsters().stream()
                .filter(h -> h.getName().equals(name))
                .findFirst();
        return optionalHamster.orElse(null);
    }
}
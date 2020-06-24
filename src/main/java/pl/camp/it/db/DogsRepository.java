package pl.camp.it.db;

import pl.camp.it.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogsRepository {
    private List<Dog> dogs = new ArrayList<>();
    private static final DogsRepository dogsRepository = new DogsRepository();

    private DogsRepository() {
        for (int i = 0; i < 10; i++) {
            dogs.add(new Dog());
        }
    }

    public List<Dog> getDogs() {
        return this.dogs;
    }

    public static DogsRepository getDogsRepository() {
        return dogsRepository;
    }
}
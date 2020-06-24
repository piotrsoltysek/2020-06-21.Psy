package pl.camp.it.db;

import pl.camp.it.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogsRepository {
    public List<Dog> dogs = new ArrayList<>();

    public DogsRepository() {
        this.dogs.add(new Dog());
    }

    public List<Dog> getDogs() {
        return this.dogs;
    }
}

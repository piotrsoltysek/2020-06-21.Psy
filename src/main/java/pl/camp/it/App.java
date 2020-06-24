package pl.camp.it;

import pl.camp.it.db.DogsRepository;
import pl.camp.it.model.Dog;

public class App {
    public static void main(String[] args) {

        DogsRepository dogsRepository = new DogsRepository();

        dogsRepository.getDogs();



    }
}

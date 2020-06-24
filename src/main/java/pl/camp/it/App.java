package pl.camp.it;

import pl.camp.it.db.DogsRepository;
import pl.camp.it.model.Dog;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        DogsRepository dogsRepository = new DogsRepository();

        try {
            FileWriter fileWriter = new FileWriter("D:\\DOKUMENTY\\JAVA\\IT Camp\\Pliki do projektów\\psy\\psyDb.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            boolean flag = false;

            for (Dog dog : dogsRepository.getDogs()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(dog.getName())
                        .append(";")
                        .append(dog.getAge());

                if (flag) {
                    bufferedWriter.newLine();
                }
                flag = true;
                bufferedWriter.append(stringBuilder.toString());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
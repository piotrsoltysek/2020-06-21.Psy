package pl.camp.it.db;

import pl.camp.it.model.Dog;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Persistance {
    private static final String fileName = "D:\\DOKUMENTY\\JAVA\\IT Camp\\Pliki do projektów\\psy\\psyDb.txt";

    public static void saveData() {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            boolean flag = false;

            for (Dog dog : DogsRepository.getDogsRepository().getDogs()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder
                        .append("Imię psa: ")
                        .append(dog.getName())
                        .append(", wiek psa: ")
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
package dev.esz;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Reader reader = new FileReader("./src/main/resources/statesmodel.json");

        Gson gson = new Gson();
        StatesModel[] statesModels = gson.fromJson(reader, StatesModel[].class);

        Stream.of(statesModels).forEach(System.out::println);
    }
}

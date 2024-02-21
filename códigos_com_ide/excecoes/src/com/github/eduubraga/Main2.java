package com.github.eduubraga;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\choco\\www\\repositories\\test.txt");
        BufferedReader reader = null;

        try {
            reader = Files.newBufferedReader(path);
            System.out.println(reader.readLine());

            reader.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            Objects.requireNonNull(reader).close();
        }
    }
}

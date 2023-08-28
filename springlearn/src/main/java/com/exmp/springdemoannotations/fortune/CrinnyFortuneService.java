package com.exmp.springdemoannotations.fortune;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class CrinnyFortuneService implements FortuneService {
    private final List<String> fortunes = new ArrayList<>();

    private final Random random = new Random();

    @PostConstruct
    private void loadFortunesFromFile() throws IOException {
        FileReader fileReader = new FileReader("src/main/java/com/exmp/springdemoannotations/fortunes.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            fortunes.add(line);
        }

        bufferedReader.close();
        fileReader.close();

        System.out.println("Loaded fortunes.txt");
    }
    @Override
    public String getFortune() {
        return fortunes.get(random.nextInt(fortunes.size()));
    }
}

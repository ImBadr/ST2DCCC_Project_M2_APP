package com.boirard_tadjer;

import com.opencsv.CSVReader;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import java.io.StringReader;

@Component
public class MapToObject {

    @SneakyThrows
    public Actor mapActor(String data) {
        CSVReader reader = new CSVReader(new StringReader(data));
        String[] nextLine = reader.readNext();

        return Actor.builder()
                .id(Integer.valueOf(nextLine[0]))
                .name(nextLine[1])
                .birthYear(Integer.valueOf(nextLine[2]))
                .idMovie(Integer.valueOf(nextLine[3]))
                .build();
    }

    @SneakyThrows
    public Movie mapMovie(String data) {
        CSVReader reader = new CSVReader(new StringReader(data));
        String[] nextLine = reader.readNext();

        return Movie.builder()
                .id(Integer.valueOf(nextLine[0]))
                .title(nextLine[1])
                .releaseDate(Integer.parseInt(nextLine[2]))
                .author(nextLine[3])
                .build();
    }

}
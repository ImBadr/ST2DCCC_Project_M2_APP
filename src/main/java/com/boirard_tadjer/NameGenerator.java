package com.boirard_tadjer;

import org.springframework.integration.file.FileNameGenerator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class NameGenerator implements FileNameGenerator {

    public String generateFileName(Message<?> message) {
        return ((String)
                Objects.requireNonNull(message.getHeaders().get("file_name"))
                ).split("\\.")[0]
                + ".json";
    }
}
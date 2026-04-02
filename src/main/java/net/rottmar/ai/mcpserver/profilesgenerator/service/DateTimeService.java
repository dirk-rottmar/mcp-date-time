package net.rottmar.ai.mcpserver.profilesgenerator.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class DateTimeService {

    private static final Logger log = LoggerFactory.getLogger(DateTimeService.class);

    public String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        String formatted = now.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        log.info("Current datetime requested: {}", formatted);
        return formatted;
    }
}

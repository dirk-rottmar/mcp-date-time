package net.rottmar.ai.mcpserver.profilesgenerator.tool;

import net.rottmar.ai.mcpserver.profilesgenerator.service.DateTimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class DateTimeTools {

    private static final Logger log = LoggerFactory.getLogger(DateTimeTools.class);
    private final DateTimeService dateTimeService;

    public DateTimeTools(DateTimeService dateTimeService) {
        this.dateTimeService = dateTimeService;
    }

    @Tool(name = "mcp-current-datetime", description = "Returns the current date and time")
    public String getCurrentDateTime() {
        return dateTimeService.getCurrentDateTime();
    }

}

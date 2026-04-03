package net.rottmar.ai.mcpserver.datetime;

import net.rottmar.ai.mcpserver.datetime.tool.DateTimeTools;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DateTimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DateTimeApplication.class, args);
	}

	@Bean
	public ToolCallbackProvider profileToolCallbackProvider(DateTimeTools dateTimeTools) {
		return MethodToolCallbackProvider.builder()
				.toolObjects(dateTimeTools)
				.build();
	}

}

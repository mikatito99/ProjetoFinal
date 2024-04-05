package br.com.Vainaweb.escolat1.token;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class AppConfig {

    @SuppressWarnings("rawtypes")
	@Bean
    public CompletionService completionService() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        return new ExecutorCompletionService(executorService);
    }
}

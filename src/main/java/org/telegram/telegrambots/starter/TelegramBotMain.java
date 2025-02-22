package org.telegram.telegrambots.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
//Clase principal de la aplicación
public class TelegramBotMain {
    
    public static void main(String[] args) {		
		SpringApplication.run(TelegramBotMain.class, args);

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new ValleSiliconaBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
	}
}
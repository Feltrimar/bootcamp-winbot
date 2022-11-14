package org.telegram.telegrambots.starter;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
//Clase principal del bot de telegram
public class ValleSiliconaBot extends TelegramLongPollingBot{

    @Override
    public void onUpdateReceived(Update update) {
        
        //Aqui el bot recibe actualizaciones y actúa
        //El ejemplo siguiente es de enviar y recibir mensajes

        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(update.getMessage().getText());
            
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        // TODO Auto-generated method stub
        return "ValleSiliconaBot";
    }

    @Override
    public String getBotToken() {
        // TODO Auto-generated method stub
        return "5740527557:AAFe5wPRGOYPwmrkhOPj0gFUtYBMLpERGk4";
    }
    
}

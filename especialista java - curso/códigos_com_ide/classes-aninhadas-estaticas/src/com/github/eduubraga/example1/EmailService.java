package com.github.eduubraga.example1;

public class EmailService {
    public void send (Message message) {
        System.out.printf("Mensagem de %s enviando para %s: \"%s\"\n",
                message.getSender(), message.getRecipient(), message.getContent());
    }

    public static class Message {
        private final String sender;
        private final String recipient;
        private final String content;

        public Message(String sender, String recipient, String content) {
            this.sender = sender;
            this.recipient = recipient;
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public String getSender() {
            return sender;
        }

        public String getRecipient() {
            return recipient;
        }
    }
}

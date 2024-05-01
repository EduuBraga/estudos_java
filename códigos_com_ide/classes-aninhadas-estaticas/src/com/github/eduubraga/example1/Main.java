package com.github.eduubraga.example1;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        EmailService.Message messageEd = new EmailService
                .Message("eduardo@gmail.com", "vivi@gmail.com", "Tudo bom?");

        emailService.send(messageEd);
    }
}

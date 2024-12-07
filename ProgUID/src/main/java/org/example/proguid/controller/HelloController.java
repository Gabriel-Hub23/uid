package org.example.proguid.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class HelloController {

    @FXML
    private ImageView IMAGE1;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button cancelButton;

    @FXML
    public void initialize() {
        try {
            // Caricamento dell'immagine
            System.out.println("Inizializzazione HelloController...");
            Image imagePath = new Image(Objects.requireNonNull(getClass().getResourceAsStream(
                    "/org/example/proguid/images/PP.png")));
            IMAGE1.setFitWidth(400);  // Larghezza desiderata
            IMAGE1.setFitHeight(1000); // Altezza desiderata
            IMAGE1.setPreserveRatio(true); // Mantieni le proporzioni
            IMAGE1.setImage(imagePath);
            System.out.println("Immagine caricata con successo.");
        } catch (NullPointerException e) {
            System.err.println("Errore: Impossibile trovare l'immagine nel percorso specificato.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Si è verificato un errore durante il caricamento dell'immagine.");
            e.printStackTrace();
        }

        // Configura i pulsanti con gli handler
        loginButton.setOnAction(event -> handleLogin());
        cancelButton.setOnAction(event -> handleCancel());
    }

    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Inserisci username e password.");
            return;
        }

        if ("admin".equals(username) && "password".equals(password)) {
            System.out.println("Login effettuato con successo!");
            // Puoi cambiare scena qui se necessario
        } else {
            System.out.println("Username o password errati.");
        }
    }

    private void handleCancel() {
        usernameField.clear();
        passwordField.clear();
        System.out.println("Campi cancellati.");
    }
}

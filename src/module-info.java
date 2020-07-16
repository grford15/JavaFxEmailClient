module JavaFxEmailClient {
    requires javafx.web;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.greg;
    opens com.greg.view;
    opens com.greg.controller;
}

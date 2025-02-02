package com.example.simuladorregistro;

import javafx.fxml.FXML;
import javafx.scene.control.*;

    public class HelloController {
        @FXML
        private Button btnSignUp;

        @FXML
        private Button btnValidateData;

        @FXML
        private Button btnSendData;

        @FXML
        private TextField txtUsername;

        @FXML
        private TextField txtEmail;

        @FXML
        private TextField txtTelephone;

        @FXML
        private SplitMenuButton countries;

        @FXML
        private TabPane tabPane;

        @FXML
        private Label lblData;

        @FXML
        private Label lblDataSent;

        private String selectedCountry;

        @FXML
        protected void btnSignUpOnAction() {
            tabPane.getSelectionModel().select(1);
        }

        @FXML
        protected void btnValidateOnAction() {
            if (!txtUsername.getText().isEmpty() && !txtEmail.getText().isEmpty()
                    && !txtTelephone.getText().isEmpty()
                    && !selectedCountry.isEmpty()) {
                String userData = "Name: " + txtUsername.getText()
                        + "\nEmail: " + txtEmail.getText() +
                        "\nTelephone: " + txtTelephone.getText()
                        + "\nCountry: " + selectedCountry;
                tabPane.getSelectionModel().select(2);
                lblData.setText(userData);
            } else {

            }
        }

        @FXML
        protected void btnSendDataOnAction() {
            tabPane.getSelectionModel().select(3);
            lblDataSent.setText("You have registered successfully");
        }


        public void selectCountriesOnAction(javafx.event.ActionEvent event) {
            MenuItem item = (MenuItem) event.getSource();
            selectedCountry = item.getText();
            countries.setText(selectedCountry);
        }
    }
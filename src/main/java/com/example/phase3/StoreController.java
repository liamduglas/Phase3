package com.example.phase3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;

public class StoreController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToLogIn(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToIncoming(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Incoming.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToAccept(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Accept.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSeeOrder(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SeeOrder.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void switchToPizza(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("PizzaType.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToToppings(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Toppings.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToCart(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPickup(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Pickup.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToCheckout(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Checkout.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToStatus(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Status.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToMain(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

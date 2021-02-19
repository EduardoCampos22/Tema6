/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appayuda;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Eduardo
 */
public class AppAyuda extends Application 
{
    private Scene scene;
    
    @Override
    public void start(Stage stage) 
    {
        // create the scene
        stage.setTitle("Web View");
        scene = new Scene(new Browser(), 750, 500, Color.web("#666970"));
        stage.setScene(scene);
        scene.getStylesheets().add(AppAyuda.class.getResource("style/BrowserToolbar.css").toExternalForm());
        stage.show();
    }

    
    public static void main(String[] args) 
    {
        launch(args);
    }    
}

package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Trokut prvi = new Trokut(3,4,6);
		System.out.println("opseg trokuta = " + prvi.getO());
		System.out.println("površina trokuta = " + prvi.getP());
		Kruznica drugi = new Kruznica(10);
		System.out.println("opseg kružnice = " + drugi.getO());
		System.out.println("površina kružnice = " + drugi.getP());
		Pravokutnik treci = new Pravokutnik(10,6);
		System.out.println("opseg pravokutnika = " + treci.getO());
		System.out.println("površina pravokutnika = " + treci.getP());


	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}

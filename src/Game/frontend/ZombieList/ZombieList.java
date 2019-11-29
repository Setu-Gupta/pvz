package Game.frontend.ZombieList;

import Game.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ZombieList
{
	private static ImageView zombieImage = null;
	private static ChoiceBox<String> zombieChoice = null;
	private static TextArea zombieDescription = null;

	public static void run(Stage primaryStage) throws Exception
	{
		FXMLLoader loader = new FXMLLoader(ZombieList.class.getResource("ZombieList.fxml"));
		Parent root = loader.load();
		ZombieListController controller = loader.getController();
		controller.setPrimaryStage(primaryStage);
		zombieImage = controller.getZombieImage();
		zombieChoice = controller.getZombieChoice();
		zombieDescription = controller.getZombieDescription();
		zombieImage.setVisible(false);
		setUpChoices();

		primaryStage.setScene(new Scene(root, Main.width, Main.height));
		primaryStage.show();
	}

	private static void setUpChoices()
	{
		zombieChoice.getItems().addAll("Lawn Zombie", "Traffic Zombie", "Bucket Zombie", "Rugby Zombie", "Runner Zombie", "Boss Zombie", "---");
		zombieChoice.setValue("---");
		zombieChoice.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> newChoice(newValue));
	}

	private static void newChoice(String value)
	{
		switch(value) {
			case "Lawn Zombie":
				zombieImage.setImage(new Image("./Game/assets/backend/Zombies/LawnZombie.gif"));
				zombieImage.setVisible(true);
				zombieDescription.setText("Lawn Zombie");
				zombieDescription.setVisible(true);
				break;
			case "Traffic Zombie":
				zombieImage.setImage(new Image("./Game/assets/backend/Zombies/TrafficZombie.gif"));
				zombieImage.setVisible(true);
				zombieDescription.setText("Traffic Zombie");
				zombieDescription.setVisible(true);
				break;
			case "Bucket Zombie":
				zombieImage.setImage(new Image("./Game/assets/backend/Zombies/BucketZommbie.gif "));
				zombieImage.setVisible(true);
				zombieDescription.setText("Bucket Zombie");
				zombieDescription.setVisible(true);
				break;
			case "Rugby Zombie":
				zombieImage.setImage(new Image("./Game/assets/backend/Zombies/RugbyZombie.png"));
				zombieImage.setVisible(true);
				zombieDescription.setText("Rugby Zombie");
				zombieDescription.setVisible(true);
				break;
			case "Runner Zombie":
				zombieImage.setImage(new Image("./Game/assets/backend/Zombies/RunnerZombie.gif "));
				zombieImage.setVisible(true);
				zombieDescription.setText("Runner Zombie");
				zombieDescription.setVisible(true);
				break;
			case "Boss Zombie":
				zombieImage.setImage(new Image("./Game/assets/backend/Zombies/BossZombie.gif "));
				zombieImage.setVisible(true);
				zombieDescription.setText("Boss Zombie");
				zombieDescription.setVisible(true);
				break;
			default:
				zombieImage.setVisible(false);
				zombieDescription.setVisible(false);

		}
	}
}

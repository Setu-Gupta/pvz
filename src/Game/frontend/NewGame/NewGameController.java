package Game.frontend.NewGame;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Timer;

public class NewGameController
{
	@FXML
	private Button addUserButton;
	@FXML
	private TextField usernameTextBox;
	private Stage primaryStage;
	private Timer timer;
	@FXML
	private ImageView zombieImage;
	@FXML
	private AnchorPane pane;

	void setTimer(Timer timer)
	{
		this.timer = timer;
	}

	void setPrimaryStage(Stage primaryStage)
	{
		this.primaryStage = primaryStage;
		addUserButton.setDisable(true);
	}

	ImageView getZombieImage()
	{
		return zombieImage;
	}

	@FXML
	private void newUserClick()
	{
		System.out.println("New user by the name: " + usernameTextBox.getText());
	}

	@FXML
	private void mainMenuClick() throws Exception
	{
		timer.cancel();
		Game.frontend.MainMenu.MainMenu.run(primaryStage);
	}

	@FXML
	private void usernameKeyRelease()
	{
		String input = usernameTextBox.getText();
		boolean isDisabled = input.isEmpty() || !input.matches("[a-zA-Z0-9]+");
		addUserButton.setDisable(isDisabled);
	}

	void removeZombie()
	{
		pane.getChildren().remove(zombieImage);
	}
}


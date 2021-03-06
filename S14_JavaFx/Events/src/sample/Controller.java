package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
  @FXML
  private TextField nameField;
  @FXML
  private Button helloButton;
  @FXML
  private Button ByeButton;
  @FXML
  private CheckBox ourCheckBox;
  @FXML
  private Label ourLabel;

  @FXML
  public void initialize() {
    helloButton.setDisable(true);
    ByeButton.setDisable(true);
  }

  @FXML
  public void onButtonClicked(ActionEvent e) {
    if (e.getSource().equals(helloButton)) {
      System.out.println("Hello, " + nameField.getText());
    } else if(e.getSource().equals(ByeButton)) {
      System.out.println("Bye, " + nameField.getText());
    }

    Runnable task = new Runnable() {
      @Override
      public void run() {
        try {
          Thread.sleep(10000);
          Platform.runLater(new Runnable() {
            @Override
            public void run() {
              ourLabel.setText("We did something!");
            }
          });
        } catch(InterruptedException event) {
          // We don't care about this
        }
      }
    };

    new Thread(task).start();

    if(ourCheckBox.isSelected()) {
      nameField.clear();
      helloButton.setDisable(true);
      ByeButton.setDisable(true);
    }
  }

  @FXML
  public void handleKeyReleased() {
    String text = nameField.getText();
    boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
    helloButton.setDisable(disableButtons);
    ByeButton.setDisable(disableButtons);
  }

  @FXML
  public void handleChange() {
    System.out.println("The checkbox is " + (ourCheckBox.isSelected() ? "checked" : "not checked"));
  }
}

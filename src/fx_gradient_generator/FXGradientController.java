package fx_gradient_generator;

import com.jfoenix.controls.JFXColorPicker;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.effects.JFXDepthManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

public class FXGradientController implements Initializable {

    @FXML
    private HBox Preview;
    @FXML
    private JFXColorPicker StartColor;
    @FXML
    private JFXColorPicker FinishColor;
    @FXML
    private JFXRadioButton rdTop;
    @FXML
    private JFXRadioButton rdBottom;
    @FXML
    private JFXRadioButton rdRight;
    @FXML
    private JFXRadioButton rdLeft;
    @FXML
    private TextArea CodePreview;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        JFXDepthManager.setDepth(Preview, 1);
        ToggleGroup t = new ToggleGroup();
        rdTop.setToggleGroup(t);
        rdBottom.setToggleGroup(t);
        rdRight.setToggleGroup(t);
        rdLeft.setToggleGroup(t);
        String s = "-fx-background-color: linear-gradient(to bottom,#" + StartColor.getValue().toString().subSequence(2, 8) + ",#" + FinishColor.getValue().toString().subSequence(2, 8) + " );";
        Preview.setStyle(s);

    }

    @FXML
    private void ApplyStartColor(ActionEvent event) {
        rdTop.setSelected(true);
        String s = "-fx-background-color: linear-gradient(to bottom,#" + StartColor.getValue().toString().subSequence(2, 8) + ",#" + FinishColor.getValue().toString().subSequence(2, 8) + " );";
        Preview.setStyle(s);
        CodePreview.setText(s.substring(22));
      
    }

    @FXML
    private void ApplyFinishColor(ActionEvent event) {

        rdTop.setSelected(true);
        String s = "-fx-background-color: linear-gradient(to bottom,#" + StartColor.getValue().toString().subSequence(2, 8) + ",#" + FinishColor.getValue().toString().subSequence(2, 8) + " );";

        Preview.setStyle(s);

      CodePreview.setText(s.substring(22));

    }

    @FXML
    private void StartFromTop(ActionEvent event) {
        String s = "-fx-background-color: linear-gradient(to bottom,#" + StartColor.getValue().toString().subSequence(2, 8) + ",#" + FinishColor.getValue().toString().subSequence(2, 8) + " );";
        Preview.setStyle(s);
        CodePreview.setText(s.substring(22));
    }

    @FXML
    private void StartFromBottom(ActionEvent event) {

        String s = "-fx-background-color: linear-gradient(to top,#" + StartColor.getValue().toString().subSequence(2, 8) + ",#" + FinishColor.getValue().toString().subSequence(2, 8) + " );";
        Preview.setStyle(s);
        CodePreview.setText(s.substring(22));
    }

    @FXML
    private void StartFromRight(ActionEvent event) {
        String s = "-fx-background-color: linear-gradient(to left,#" + StartColor.getValue().toString().subSequence(2, 8) + ",#" + FinishColor.getValue().toString().subSequence(2, 8) + " );";
        Preview.setStyle(s);
       CodePreview.setText(s.substring(22));
    }

    @FXML
    private void StartFromLeft(ActionEvent event) {
        String s = "-fx-background-color: linear-gradient(to Right,#" + StartColor.getValue().toString().subSequence(2, 8) + ",#" + FinishColor.getValue().toString().subSequence(2, 8) + " );";
        Preview.setStyle(s);
        CodePreview.setText(s.substring(22));
    }

    @FXML
    private void Shutdown(ActionEvent event) {
        Platform.exit();
    }

}

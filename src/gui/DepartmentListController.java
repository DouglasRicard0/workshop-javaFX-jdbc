package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

public class DepartmentListController implements Initializable {

	@FXML
	private TableView<Department> tableViewDepartment;
	
	@FXML
	private TableColumn<Department, Integer> tableCollumnId;
	
	@FXML
	private TableColumn<Department, String> tableCollumnName;
	
	@FXML
	private Button btNew;
	
	@FXML
	public void OnBtNewAction() {
		System.out.println("BOTAO ATIVADO");
	}
	
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		initializedNodes();
		
	}


	private void initializedNodes() {
		tableCollumnId.setCellValueFactory(new PropertyValueFactory<Department, Integer>("id"));
		tableCollumnName.setCellValueFactory(new PropertyValueFactory<Department, String>("name"));
	
		
	}

}

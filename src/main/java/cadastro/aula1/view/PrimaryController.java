package cadastro.aula1.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cadastro.aula1.controle.ContatoControle;
import cadastro.aula1.model.Contato;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class PrimaryController {

	@FXML
	private TextField editNome;
	
	@FXML
	private TextField editTelefone;
	@FXML
	private ToggleGroup sexo;
	@FXML
	private TextArea editNotacoes;
	@FXML
	private RadioButton editSexoFemino;
	@FXML
	private RadioButton editSexoMasculino;
	@FXML
	private RadioButton editSexcoOutros;
	
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void salvarDados() {
    	String sexo_ ="";
    	if(editSexoMasculino.isSelected())
    		sexo_ = editSexoMasculino.getText();
    	else if(editSexoFemino.isSelected())
    		sexo_ = editSexoFemino.getText();
    	else
    		sexo_ = editSexcoOutros.getText();
    	if(ContatoControle.LISTA_DADOS==null || ContatoControle.LISTA_DADOS.size() ==0) {
    		ContatoControle.LISTA_DADOS =  new ArrayList<>();
    	}
    	ContatoControle.LISTA_DADOS.add(new Contato(editNome.getText(), editTelefone.getText(), sexo_, editNotacoes.getText()));
    	
		System.out.println("Nome: "+editNome.getText()+" Telefone: " +editTelefone.getText()+" Sexo :"+ sexo_);
		new Alert(AlertType.INFORMATION,"Salvo com sucesso!").show();
	}
}

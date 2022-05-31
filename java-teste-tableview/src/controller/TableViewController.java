package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Pessoa;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {

    @FXML
    private TableColumn<Pessoa, String> tcAnimal;

    @FXML
    private TableColumn<Pessoa, Integer> tcIdade;

    @FXML
    private TableColumn<Pessoa, String> tcNome;

    @FXML
    private TableView<Pessoa> tvPessoa;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        carregarTableViewPessoa();

    }
    private List<Pessoa> listPessoa = new ArrayList<>();
    private ObservableList<Pessoa> observableListPessoa;
    public void carregarTableViewPessoa(){

        tcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tcIdade.setCellValueFactory(new PropertyValueFactory<>("idade"));
        tcAnimal.setCellValueFactory(new PropertyValueFactory<>("animal"));

        Pessoa pessoa = new Pessoa("Matheus",19,"Cachorro");
        Pessoa pessoa1 = new Pessoa("Danilo",19,"Cachorro");
        Pessoa pessoa2 = new Pessoa("Cecilia",16,"Gato");

        listPessoa.add(pessoa);
        listPessoa.add(pessoa1);
        listPessoa.add(pessoa2);

        observableListPessoa = FXCollections.observableArrayList(listPessoa);

        tvPessoa.setItems(observableListPessoa);
    }
}


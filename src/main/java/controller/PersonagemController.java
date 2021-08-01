package controller;

import dao.PersonagemDAO;
import entities.Personagem;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class PersonagemController {

    @FXML
    TextField textjogador, textpersona, textclasse, textnivel, textantecedente, textraca, textalinhamento, textpontoexp, textPesquisa;
    @FXML
    Button btSelect;
    @FXML
    ImageView imagem;
    File imagemSelecionada;

    //onAction botao cadastrar
    public void cadastrar(ActionEvent e) throws IOException {
        //Coletar os dados digitados e inserir no BD
        Personagem personagem = new Personagem();
        personagem.setJogador(textjogador.getText().toString());
        personagem.setPersona(textpersona.getText().toString());
        personagem.setClasse(textclasse.getText().toString());
        personagem.setNivel(textnivel.getText().toString());
        personagem.setAntecedente(textantecedente.getText().toString());
        personagem.setRaca(textraca.getText().toString());
        personagem.setAlinhamento(textalinhamento.getText().toString());
        personagem.setPontoexp(textpontoexp.getText().toString());
         //Obter bytes de uma imagem
        //BufferedImage image = ImageIO.read(new File("C:\\Users\\seu pc\\Desktop\\seu pc.png"));
        BufferedImage image = ImageIO.read(imagemSelecionada);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        ImageIO.write(image, "png", output);
        personagem.setPerfil(output.toByteArray());
        //Chamar classe para DAO persistir no BD
        Long idCadastrado = PersonagemDAO.inserir(personagem).getId();
        System.out.println("Id do Personagem cadastrado: " + idCadastrado);
    }

    //onAction botao Pesquisar
    public void pesquisar(ActionEvent e) throws IOException {
        Long id = Long.parseLong(textPesquisa.getText().toString());
        Personagem consulta = PersonagemDAO.pesquisar(id);
        System.out.println(consulta.getPerfil().length);
        //Salvar imagem no Perfil
        ByteArrayInputStream bis = new ByteArrayInputStream(consulta.getPerfil());
        BufferedImage image = ImageIO.read(bis);
        ImageIO.write(image, "png", new File("imagem.png"));
        Image img = SwingFXUtils.toFXImage(image, null);
        imagem.setImage(img);


    }

    public void selectImage(ActionEvent e){
        FileChooser fc = new FileChooser();
        fc.setTitle("Selecione uma imagem");
        //fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Image Files"), "*.png", "*.jpg");
        imagemSelecionada = fc.showOpenDialog(new Stage());

    }
}

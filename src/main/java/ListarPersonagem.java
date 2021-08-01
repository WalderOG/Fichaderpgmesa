import dao.PersonagemDAO;
import entities.Personagem;


import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ListarPersonagem {
    public static void main(String[] args) {
        List<Personagem> personagem = PersonagemDAO.listar();
        System.out.println("Quantidade de Personagem na lista " + personagem.size());
        //Percorrer uma lista em Java do jeito feio
        for(int i = 0; i < personagem.size(); i++)
            System.out.println(personagem.get(i).getPersona());

        //Percorrer uma lista em Java do jeito simples
        //Pfor(personagem l : personagem)
        //P   System.out.println(l.getPersona());
    }
    //  private void pupulartabela(List<Personagem> ppersonagemList){
        //      //      //      DefaultTableModel modeloTabela = new DefaultTableModel();
        //      this.Jtbpersonagem.setModel(modeloTabela);
    //     modeloTabela.addColumn("Id");
    //     modeloTabela.addColumn("persona");
    //     modeloTabela.addColumn("raca");
    //     for (Persona Persona : ppersonagemList){
    //       modeloTabela.addRow(
                    //                new Object[]{
    //                       Persona.getId(),Persona.getJogador
//          }
//       );

    //      }
    //   }
}

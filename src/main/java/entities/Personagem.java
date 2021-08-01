package entities;

import javax.persistence.*;

@Entity
@Table(name = "Personagem")
public class Personagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jogador;
    private String persona;
    private String classe;
    private String nivel;
    private String antecedente;
    private String raca;
    private String alinhamento;
    private String pontoexp;
    @Column(columnDefinition = "MEDIUMBLOB") //16MB
    private byte[] perfil;//byte array

    public Personagem() {
    }

    public Personagem(String jogador, String persona, String classe,String nivel, String antecedente, String raca, String alinhamento,String pontoexp,byte[] perfil, byte[] media) {
        this.jogador = jogador;
        this.persona = persona;
        this.classe = classe;
        this.nivel = nivel;
        this.antecedente = antecedente;
        this.raca = raca;
        this.alinhamento = alinhamento;
        this.pontoexp = pontoexp;
        this.perfil = perfil;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getJogador() {
        return jogador;
    }
    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public String getPersona() { return persona;  }
    public void setPersona(String persona) {  this.persona = persona;    }

    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getNivel() {  return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel;    }

    public String getAntecedente() {
        return antecedente;
    }
    public void setAntecedente(String antecedente) {
        this.antecedente = antecedente;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getAlinhamento() {
        return alinhamento;
    }
    public void setAlinhamento(String alinhamento) {
        this.alinhamento = alinhamento;
    }

    public String getPontoexp() {  return pontoexp; }
    public void setPontoexp(String pontoexp) {
        this.pontoexp = pontoexp;
    }

    public byte[] getPerfil() { return perfil;    }
    public void setPerfil(byte[] perfil) { this.perfil = perfil;    }


}

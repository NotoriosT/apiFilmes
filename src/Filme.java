import java.net.URL;
import java.util.List;

public class Filme {
    private String nome;
    private String url;
    private String ano;
    private  String nota;

    public Filme(String nome, String url, String ano, String nota) {
        this.nome = nome;
        this.url = url;
        this.ano = ano;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", url='" + url + '\'' +
                ", ano='" + ano + '\'' +
                ", nota='" + nota + '\'' +
                '}';
    }
}

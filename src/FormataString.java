
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FormataString {
    private String [] fomataFilme(String filmes){

        String filme=filmes.split("[\\[\\]]")[1];
        return filme.split("},\\{");

    }
    public List<String> nomeFilmes(String fimes){

        return Stream.of(fomataFilme(fimes)).
                map(e -> e.split("\",\"")[3]).
                map(e->e.split(":\"")[1]).collect(Collectors.toList());

    }

    public List<String> linkImagem(String fimes){
     return   Stream.of(fomataFilme(fimes)).
                map(e -> e.split("\",\"")[5]).
                map(e->e.split(":\"")[1]).map(e -> e.replaceAll("\"", "")).collect(Collectors.toList());

    }

    public List<String> ano(String fimes){
        return Stream.of(fomataFilme(fimes)).
                map(e -> e.split("\",\"")[4]).
                map(e->e.split(":\"")[1]).map(e -> e.replaceAll("\"", "")).collect(Collectors.toList());
    }
    public List<String> rank(String fimes){
        return Stream.of(fomataFilme(fimes)).
                map(e -> e.split("\",\"")[7]).
                map(e->e.split(":\"")[1]).map(e -> e.replaceAll("\"", "")).collect(Collectors.toList());
    }

}

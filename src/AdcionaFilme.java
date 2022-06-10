import java.util.ArrayList;
import java.util.List;

public class AdcionaFilme {
    public static List<Filme> adciona(String filmes){
        FormataString formataString= new FormataString();
        List<String> nome=formataString.nomeFilmes(filmes);
        List<String>ano=formataString.ano(filmes);
        List<String>nota=formataString.rank(filmes);
        List<String>url=formataString.linkImagem(filmes);
        List<Filme> filmeList=new ArrayList<>();
        for(int i=0;i<url.size();i++){
            filmeList.add(new Filme(nome.get(i),url.get(i), ano.get(i), nota.get(i)));

        }
return  filmeList;
    }
}

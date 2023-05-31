import org.junit.Assert;
import org.junit.Test;

public class FilmeTest {

    @Test
    public void meiaEntradaEstudante(){

        Assert.assertEquals(
                new Filme("Barbie e o castelo de diamante",
                        new Pessoa("Renan", 21, true ),50).getIngressoDesconto(), 25);

    }
    @Test
    public void meiaEntradaMenor18(){

        Assert.assertEquals(new Filme("Sexta-feira 13",
                new Pessoa("Andreisse", 12, false ), 50).getIngressoDesconto(), 25);

    }
    @Test
    public void meiaEntradaMais60(){

        Assert.assertEquals(new Filme("Barbie e as sapatilhas mágicas",
                new Pessoa("Xablau", 61, false ), 50).getIngressoDesconto(), 25);

    }


    @Test
    public void naoRecebeMeia(){

        Assert.assertEquals(new Filme("Frozen",
                new Pessoa("Arend", 21, false ), 50).getIngressoDesconto(), 50);

    }

}

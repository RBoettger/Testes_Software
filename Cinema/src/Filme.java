import java.util.List;

public class Filme {

    //Atributos
    private String nome;
    private Pessoa pessoa;
    private int valorIngressoBruto;
    private int ingressoDesconto;


    //Construtor
    public Filme(String nome, Pessoa pessoa, int valorIngressoBruto) {
        this.nome = nome;
        this.pessoa = pessoa;
        this.valorIngressoBruto = valorIngressoBruto;
        this.ingressoDesconto = calcularDesconto(pessoa);
    }


    //Métodos
    private int calcularDesconto(Pessoa pessoa) {

        if(pessoa.getIdade() < 18 || pessoa.getIdade() >= 60) {

            return valorIngressoBruto / 2;

        }else if(pessoa.isEstudante()){

            return valorIngressoBruto / 2;

        }else{

            return valorIngressoBruto;

        }

    }






    //Getters n setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getValorIngressoBruto() {
        return valorIngressoBruto;
    }

    public void setValorIngressoBruto(int valorIngressoBruto) {
        this.valorIngressoBruto = valorIngressoBruto;
    }

    public int getIngressoDesconto() {
        return ingressoDesconto;
    }

    public void setIngressoDesconto(int ingressoDesconto) {
        this.ingressoDesconto = ingressoDesconto;
    }


}

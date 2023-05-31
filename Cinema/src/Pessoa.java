public class Pessoa {

    //Atributos
    private String name;
    private int idade;
    private boolean estudante;



    //Construtor
    public Pessoa(String name, int idade, boolean estudante) {
        this.name = name;
        this.idade = idade;
        this.estudante = estudante;
    }



    //Getters n setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

}

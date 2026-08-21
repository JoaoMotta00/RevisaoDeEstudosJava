package basico.crudmemoria;

public class Conta {

    private int id;
    private String cpf;
    private String nome;
    private String sobrenome;

    public Conta(int id, String cpf, String nome, String sobrenome) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id:" + id +
                "\nCpf=" + cpf  +
                "\nNome=" + nome  +
                "\nSobrenome=" + sobrenome + '\n';
    }


}

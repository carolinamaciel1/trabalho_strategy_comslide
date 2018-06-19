public class Funcionario implements Descontos{

    private String nome;
    private String endereco;
    private String cpf;
    private String rg;
    private double salario;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }




    public void desconto_funcionario(double valor_a_pagar){
        double desconto = valor_a_pagar - (valor_a_pagar * 0.1);
        System.out.println("Valor final:" + desconto);
    }





    @Override
    public double desc(double valor_conta) {
        return valor_conta - (valor_conta * 0.1);
    }
}

public class Cliente {
    private String nome;
    private String tipo;
    private double valor_a_pagar;

    public double getValor_a_pagar() {
        return valor_a_pagar;
    }

    public void setValor_a_pagar(double valor_final) {
        this.valor_a_pagar = valor_final;
    }


    public Cliente(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public double calculo_tipo() {
        if (tipo == "gold") {
            Descontos g = new Gold();
            return g.desc(valor_a_pagar);
        } else if (tipo == "platinum") {
            Descontos p = new Platinum();
            return p.desc(valor_a_pagar);
        } else if (tipo == "normal") {
            Descontos n = new Normal();
            return n.desc(valor_a_pagar);
        } else if (tipo == "func") {
            Descontos f = new Funcionario();
            return f.desc(valor_a_pagar);
        }
        return 0;
    }

    public String toString(){
        System.out.println("*************** NOTA FISCAL***************");
        System.out.println("Cliente:" + this.getNome());
        System.out.println("Tipo:" + this.getTipo());
        System.out.println("Valor final:"+ calculo_tipo());
        System.out.println("Volte sempre!");
        System.out.println("");

        return "";
    }


}

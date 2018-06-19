public class Gold implements Descontos {
    @Override
    public double desc(double valor_conta) {
        return valor_conta - (valor_conta * 0.5);
    }
}



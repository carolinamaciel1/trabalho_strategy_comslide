public class main {
    public static void main(String[] args) {

        Cliente a = new Cliente("Carolina","gold");
        a.setValor_a_pagar(200);
        a.toString();

        Cliente b = new Cliente("Joana", "platinum");
        b.setValor_a_pagar(200);
        b.toString();

        Cliente c = new Cliente("Catarina", "normal");
        c.setValor_a_pagar(300);
        c.toString();

        Cliente d = new Cliente("Nana","func");
        d.setValor_a_pagar(100);
        d.toString();
    }
}
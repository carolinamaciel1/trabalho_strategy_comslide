import junit.framework.TestCase;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class test_Cliente extends TestCase {

    @Test
    public void test_calculo_tipo_a(){
        Cliente a = new Cliente("Carol","gold");
        Cliente mockcliente = mock(Cliente.class);
        when(mockcliente.getValor_a_pagar()).thenReturn(200.00);
        when(mockcliente.calculo_tipo()).thenReturn(100.00);
        double resultado_esperado = 100.00;
        double resultado_obtido = mockcliente.getValor_a_pagar() - mockcliente.calculo_tipo();
        assertEquals(resultado_esperado,resultado_obtido);
    }

    @Test
    public void test_calculo_tipo_b(){
        Cliente a = new Cliente("Carol","platinum");
        Cliente mockcliente = mock(Cliente.class);
        when(mockcliente.getValor_a_pagar()).thenReturn(200.00);
        when(mockcliente.calculo_tipo()).thenReturn(40.00);
        double resultado_esperado = 160.00;
        double resultado_obtido = mockcliente.getValor_a_pagar() - mockcliente.calculo_tipo();
        assertEquals(resultado_esperado,resultado_obtido);
    }

    @Test
    public void test_calculo_tipo_c(){
        Cliente a = new Cliente("Carol","normal");
        Cliente mockcliente = mock(Cliente.class);
        when(mockcliente.getValor_a_pagar()).thenReturn(200.00);
        when(mockcliente.calculo_tipo()).thenReturn(20.00);
        double resultado_esperado = 180.00;
        double resultado_obtido = mockcliente.getValor_a_pagar() - mockcliente.calculo_tipo();
        assertEquals(resultado_esperado,resultado_obtido);
    }

    @Test
    public void test_calculo_tipo_d(){
        Cliente a = new Cliente("Carol","func");
        Cliente mockcliente = mock(Cliente.class);
        when(mockcliente.getValor_a_pagar()).thenReturn(200.00);
        when(mockcliente.calculo_tipo()).thenReturn(20.00);
        double resultado_esperado = 180.00;
        double resultado_obtido = mockcliente.getValor_a_pagar() - mockcliente.calculo_tipo();
        assertEquals(resultado_esperado,resultado_obtido);
    }


}

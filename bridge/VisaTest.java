package padroesestruturaisteste_exercicios.bridge;

import org.junit.jupiter.api.Test;
import padroesestruturais_exercicios.bridge1.Credito;
import padroesestruturais_exercicios.bridge1.Debito;
import padroesestruturais_exercicios.bridge1.Visa;
import padroesestruturais_exercicios.bridge1.TipoPagamento;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisaTest {

    @Test
    void deveRetornarTarifaVisaNoDebito() {
        TipoPagamento tipoPagamento = new Debito();
        Visa visa = new Visa(1000.0f);
        visa.setTipoPagamento(tipoPagamento);
        assertEquals(1000.0f, visa.calcularTarifa(), 0.0f);
    }

    @Test
    void deveRetornarTarifaVisaNoCredito() {
        TipoPagamento tipoPagamento = new Credito();
        Visa visa = new Visa(1000.0f);
        visa.setTipoPagamento(tipoPagamento);
        assertEquals(1000.0f, visa.calcularTarifa(), 0.05f);
    }
}

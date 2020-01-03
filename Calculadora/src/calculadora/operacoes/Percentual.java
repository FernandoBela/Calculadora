/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.operacoes;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author fernando.belarmino
 */
public class Percentual implements calculadora.calc
{
    private BigDecimal valor1=null;
   
    public Percentual(BigDecimal valor){
        valor1=valor;
    }

    @Override
    public BigDecimal calcular(BigDecimal percentual)
    {
        return valor1.multiply(percentual.divide(new BigDecimal("100"), 3, RoundingMode.HALF_UP));
    }
}

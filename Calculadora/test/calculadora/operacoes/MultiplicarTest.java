/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.operacoes;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author fernando.belarmino
 */
public class MultiplicarTest
{
    @Test
    public void testMultiplicar()
    {
        System.out.println("Teste Multiplicar");
        BigDecimal valor2 = new BigDecimal("10.0");
        Multiplicar instance = new Multiplicar(new BigDecimal("100"));
        BigDecimal expResult = new BigDecimal("1000.0");;
        BigDecimal result = instance.calcular(valor2);
        Assert.assertEquals(expResult, result);
    }
    
}

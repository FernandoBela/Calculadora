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
public class DividirTest
{
    @Test
    public void testDividir()
    {
        System.out.println("Teste Dividir");
        BigDecimal valor2 = new BigDecimal("10.0");
        Dividir dividir = new Dividir(new BigDecimal("100"));
        BigDecimal expResult = new BigDecimal("10.000");
        BigDecimal result = dividir.calcular(valor2);
        Assert.assertEquals(expResult, result);
        
    }
    
}

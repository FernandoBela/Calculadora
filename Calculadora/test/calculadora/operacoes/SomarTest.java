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
public class SomarTest
{
    @Test
    public void testSomar()
    {
        System.out.println("Teste Somar");
        BigDecimal valor2 = new BigDecimal("10.0");
        Somar instance = new Somar(new BigDecimal("10.0"));
        BigDecimal expResult = new BigDecimal("20.0");
        BigDecimal result = instance.calcular(valor2);
        Assert.assertEquals(expResult, result);
    }
    
}

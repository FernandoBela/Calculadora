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
public class PercentualTest
{    
    @Test
    public void testPercentual()
    {
        System.out.println("Teste Percentual");
        BigDecimal percentual = new BigDecimal("11.0");
        Percentual instance = new Percentual(new BigDecimal("10.0"));
        BigDecimal expResult = new BigDecimal("1.1000");
        BigDecimal result = instance.calcular(percentual);
        Assert.assertEquals(expResult, result);
    }
    
}

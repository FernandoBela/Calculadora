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
public class QuadradoTest
{    
    @Test
    public void testQuadrado()
    {
        System.out.println("Teste Quadrado");
        BigDecimal valor = new BigDecimal("10.0");
        Quadrado instance = new Quadrado();
        BigDecimal expResult = new BigDecimal("100.00");
        BigDecimal result = instance.calcular(valor);
        Assert.assertEquals(expResult, result);
    }
    
}

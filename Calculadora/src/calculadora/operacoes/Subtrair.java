/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.operacoes;

import java.math.BigDecimal;

/**
 *
 * @author fernando.belarmino
 */
public class Subtrair implements calculadora.calc
{
    private BigDecimal valor1=null;
   
    public Subtrair(BigDecimal valor){
        valor1=valor;
    }
    
    @Override
    public BigDecimal calcular(BigDecimal valor2)
    {
        return valor1.subtract(valor2);
    }
}

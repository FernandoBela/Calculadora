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
public class Dividir implements calculadora.calc
{
    private BigDecimal valor1=null;
   
    public Dividir(BigDecimal valor){
        valor1=valor;
    }
    
    @Override
    public BigDecimal calcular(BigDecimal valor2)
    {
        return valor1.divide(valor2,3,RoundingMode.HALF_UP);
    }
}

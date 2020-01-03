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
public class Quadrado implements calculadora.calc
{
    @Override
    public BigDecimal calcular(BigDecimal valor){
        return valor.multiply(valor);
    }
    
}

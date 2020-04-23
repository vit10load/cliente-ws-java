/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.teste.cliente.imc.ws;

import com.br.teste.ws.imc.CalculaImc;
import com.br.teste.ws.imc.CalculaImcService;

/**
 *
 * @author vitcl
 */
public class Main {
    
    public static void main(String[] args) {
        
        CalculaImcService service = new CalculaImcService();
        CalculaImc calculaImc = service.getCalculaImcPort();
        
        double result = calculaImc.getImc(64, 1.77);
        
        System.out.println(result);
    }
}

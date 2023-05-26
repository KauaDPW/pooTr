/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.unipar.central;

import br.unipar.central.exceptions.CampoNaoInformadoException;
import br.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.unipar.central.exceptions.TamanhoCampoInvalidoException;
import br.unipar.central.models.Pais;
import br.unipar.central.services.PaisService;
import javax.swing.JOptionPane;

/**
 *
 * @author 00235565
 */
public class UniparCentral {

     
    public static void main(String[] args) {
       
        try{
        PaisService paisService = new PaisService();
        
        Pais pais = new Pais();
        pais.setId(1);
        pais.setNome("Brasil");
        pais.setSigla("BR");
        
        paisService.validar(pais);
        
     } catch (EntidadeNaoInformadaException | CampoNaoInformadoException | TamanhoCampoInvalidoException ex){
    JOptionPane.showMessageDialog(null, ex.getMessage());
     } catch (Exception ex){
    JOptionPane.showMessageDialog(null, "Exceção Nao Esperada." + ex.getMessage());
     }
   
  }
}

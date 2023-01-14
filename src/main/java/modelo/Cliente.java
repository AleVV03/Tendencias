/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

//
import controlador.FormularioCtr;
import sw.Service_Service;
import sw.Service;
import vista.FormularioAcceso;

/**
 *
 * @author Alexandra
 */

public class Cliente {

    public static void main(String[] args) {        
        FormularioAcceso vista= new FormularioAcceso();
        Usuario modelo= new Usuario();
       FormularioCtr crt= new FormularioCtr(vista);
        vista.setVisible(true);

    }
}

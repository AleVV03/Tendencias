/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.FormularioAcceso;
import vista.RegistroUsuario;
import sw.Service;
import sw.Service_Service;
import vista.CuentaUsuario;

/**
 *
 * @author Alexandra
 */
public class FormularioCtr {

    FormularioAcceso vista;
//    usuario us;
    RegistroUsuario vista2 = new RegistroUsuario();
    Service_Service servicio = new Service_Service();
    Service cliente = servicio.getServicePort();
    CuentaUsuario vista3 = new CuentaUsuario();

    public FormularioCtr(FormularioAcceso fda) {
        this.vista = fda;
        metodos();
    }

    public void metodos() {
        vista.getBtnregistrarse().addActionListener(l -> registrar());
//        vista.getBtnSesion().addActionListener(l -> acceder());
        vista.getBtniniciar().addActionListener(l -> Inicio_Seccion());
        vista2.getBtnregistrarse().addActionListener(l -> registrar2());
        vista3.getBtnregistrarse().addActionListener(l -> ModificarSaldo());

    }

    public void registrar() {
        RegistroUsuario rg = new RegistroUsuario();
        vista.setVisible(false);
        vista2.setVisible(true);

    }

    public void registrar2() {
        vista2.getTxtcontrasena().getText();
        vista2.getTxtcontrasena().getText();
        vista2.getTxtsaldo().getText();

        boolean llave = cliente.regitrarUsuario(vista2.getTxtusuario().getText(), vista2.getTxtcontrasena().getText(), Integer.parseInt(vista2.getTxtsaldo().getText()));
        if (llave) {
            JOptionPane.showMessageDialog(null, "USUARIO REGISTRADO");
            vista2.setVisible(false);
            vista.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR, EL USUARIO NO SE PUEDE REGISTRAR");
        }

    }

    public void Inicio_Seccion() {
        vista.setVisible(false);
        vista3.setVisible(true);
        String llave2 = cliente.iniciarSeccion(vista.getTxtusuario().getText(), vista.getTxtcontrasena().getText());
        if (llave2.equals("No exite")) {
            JOptionPane.showMessageDialog(null, "El usuario no esta registrado");
        } else {
            String[] nombre = llave2.split("-");
            String user = nombre[0];
            int saldo = Integer.parseInt(nombre[1]);
            vista3.getLblsaldo().setText(String.valueOf(saldo));
            vista3.getLblusuario().setText(String.valueOf(user));

        }
    }

    public void ModificarSaldo() {

        if (vista3.getRdbdeposito().isSelected()) {
            int result = Integer.parseInt(vista3.getLblsaldo().getText());
            int fd = Integer.parseInt(vista3.getTxtvalor().getText());
            int total = result + fd;
          
            int valor = cliente.updateSaldo(vista3.getLblusuario().getText(), total);

            if (valor == -1) {
                JOptionPane.showMessageDialog(null, "No se pudo realizar la operacion de deposito");
            } else {
                vista3.getLblsaldo().setText(String.valueOf(valor));
            }

        } else {
            int result = Integer.parseInt(vista3.getLblsaldo().getText());
            int fd = Integer.parseInt(vista3.getTxtvalor().getText());
            if (fd > result) {
                JOptionPane.showMessageDialog(null, "No sepuede sacar mas dinero.");
            } else {
                int total = result - fd;

                int valor = cliente.updateSaldo(vista3.getLblusuario().getText(), total);
                if (valor == -1) {
                    JOptionPane.showMessageDialog(null, "No se pudo realizar la operacion retiro");
                } else {
                    vista3.getLblsaldo().setText(String.valueOf(valor));
                }
            }

        }
    }

}

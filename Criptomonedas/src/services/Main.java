//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package services;

import interfaz.Ventana;

public class Main {
    public static Ventana ventana;
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        //wallet.acturalizarPrecios();
        ventana = new Ventana(wallet);
        ventana.setVisible(true);
    }
}
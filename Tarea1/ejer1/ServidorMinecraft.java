/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servidorminecraft;

/**
 *
 * @author jaeger
 */
public class ServidorMinecraft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Servidor s= new Servidor("joel", 2000);
        s.agregarJugador("Angel", 129);
        s.agregarJugador("Mari", 78);
        s.mostrar();
        
        //llamada a la fincion para el inciso b)
        s.verificarStacks();
        //llamada a la fincion para el inciso c)
        s.masDiamantes();
        //llamada a la fincion para el inciso d)
        s.totalDiamantes();
    }
    
}

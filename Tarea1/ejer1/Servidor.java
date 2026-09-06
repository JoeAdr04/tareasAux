package servidorminecraft;

import java.util.ArrayList;

public class Servidor {
    //private String[] jugadores =new String[10];
    private ArrayList<String> jugadores = new ArrayList();
    private ArrayList<Integer> diamantes = new ArrayList();

    public Servidor(String j1, int diamant) {
        this.jugadores.add(j1);
        this.diamantes.add(diamant);
    }
    
    public void agregarJugador(String jug, int diam){
        this.jugadores.add(jug);
        this.diamantes.add(diam);   
    }
    
    public void verificarStacks(){
        for(int i=0; i<(this.jugadores).size(); i++){
            int cantidad = this.diamantes.get(i)/64;
            System.out.println("Jugador: "+this.jugadores.get(i)+" tiene: "+cantidad+ "stacks de diamantes");
        }
    }
    public void masDiamantes(){
        int may =0;
        int pos = 0;
        for(int i=0; i<(this.jugadores).size(); i++){
            if(this.diamantes.get(i)>=may){
                may = this.diamantes.get(i);
                pos =i;
            }
        }
        System.out.println("Jugador con mas diamantes: "+this.jugadores.get(pos)+", tiene: "+may+" diamantes");
    }
    public void totalDiamantes(){
        int sum = 0;
        for(int d: this.diamantes){ // d tomara cada valor del arreglo [200, 239, 78]
            sum = sum +d;
        }
        System.out.println("Diamantes conseguidos en el servidor: "+sum);
    }
    public void mostrar(){
        for(int i=0; i<(this.jugadores).size(); i++){
            System.out.println("jugador: "+this.jugadores.get(i)+ " diamantes: "+ this.diamantes.get(i));
        }
    }
    
}

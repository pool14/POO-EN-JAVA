package Interfaz;
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera implements Juego { 
        
        private int compu;
        private int jugador;
        Scanner lectura=new Scanner(System.in);
        
    public void iniciar(){
        System.out.print("ingrese que quiere elegir: 2 tijera, 3 papel, 4 piedra");
       jugador = lectura.nextInt(); 
    }

    public void jugar(){
      Random random=new Random();
    compu=random.nextInt(3);
    }
    public void finalizar(){
    if (compu==2 ) {
        if (jugador==4 ) {
        System.out.print("HA GANADO POR QUE LA COMPUTADORA SACO TIJERA");
        }
        else if (jugador==3) {
        System.out.print("HA GANADO LA COMPUTADORA POR QUE SACO TIJERA");
        }
        else {
        System.out.print("NO HAY GANADOR POR QUE LA COMPUTADORA SACO TIJERA");
        }
    } 
    else if (compu==4) {
        if (jugador==4) {
        System.out.print("NO HAY GANADOR POR QUE LA COMPUTADORA SACO PIEDRA");
        }
        else if (jugador==3) {
        System.out.print("HA GANADO POR QUE LA COMPUTADORA SACO PIEDRA");
        }
        else {
        System.out.print("GANO LA COMPUTADORA POR QUE SACO PIEDRA");
       } 
    }
    else {
        if (jugador==4) {
        System.out.print("HA GANADO LA COMPUTADORA POR QUE SACO PAPEL");
        }
        else if (jugador==3) {
        System.out.print("NO HAY GANADOR POR QUE LA MAQUINA SACO PAPEL");
        }
        else {
        System.out.print("HA GANADO POR QUE LA MAQUINA SACO PAPEL");
        }      
    }
}
}

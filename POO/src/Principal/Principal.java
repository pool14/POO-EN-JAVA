package Principal;
import java.util.Scanner;
import Salud.Empleado;
import Salud.Persona;


public class Principal {
    

    public static void main(String[] args) {
    String cargo, departamento;
    int valorhora, horastrabajadas;

    Scanner lectura=new Scanner(System.in);
    Persona a = new Persona();

    // reto 3
        System.out.println("Digite su cargo");
        cargo=lectura.next();
        System.out.println("Digite su departamento");
        departamento=lectura.next();
        System.out.println("Digite cuanto gana por hora");
        valorhora=lectura.nextInt();
        System.out.println("Digite el numero de horas trabajadas");
        horastrabajadas=lectura.nextInt();
       
        
        //Reto 2
        double resultado, peso=0, estatura=0;
        //crear un objeto->instancia de una clase
        a.pedirDatos();

        Empleado m =new Empleado(a.getTipoDoc(),a.getDocumento(),a.getNombre(),a.getApellido(), cargo, departamento,valorhora,horastrabajadas);
        //invocando un metodo
        a.mostrarPersona();
        m.mostrarEmpleado();
        m.calcularHonorarios();


        resultado=a.calcularImc(peso, estatura);
        if (resultado<20){
            System.out.println("PESOBAJO");
        }
        else if (resultado >= 20 && resultado <= 25){
            System.out.println("PESOIDEAL");
        }
        else if (resultado > 25){
            System.out.println("SOBREPESO");
        }

        a.mayorEdad(); 
        lectura.close();
   }

   
}
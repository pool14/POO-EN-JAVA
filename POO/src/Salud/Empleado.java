
package Salud;

public class Empleado extends Persona{
    private String cargo;
    private String departamento;
    private double valorhora;
    private double horastrabajadas;
    
       
    public Empleado(String tipoDoc, int documento, String nombre, String apellido, String cargo, String departamento,
        double valorhora, double horastrabajadas) {
        super(tipoDoc, documento, nombre, apellido);
        this.cargo = cargo;
        this.departamento = departamento;
        this.valorhora = valorhora;
        this.horastrabajadas = horastrabajadas;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getValorhora() {
        return valorhora;
    }
    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }
    public double getHorastrabajadas() {
        return horastrabajadas;
    }
    public void setHorastrabajadas(double horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

public void calcularHonorarios() {
    
    double valortotal=(valorhora * horastrabajadas);
    double reteica=(0.0096 * valortotal);
    double valorhoro=(valortotal- reteica);
    System.out.println("su valor toral es: " + valorhoro);
}
 public void mostrarEmpleado(){
System.out.println("Los datos del empleado son: \n1.Código: "+getTipoDoc()+"\n2.Documento: "+getDocumento()+"\n3.Nombre: "+getNombre()+"\n4.Apellido: "+getApellido()
+"\n5.Cargo: "+cargo +"\n6.Departamento: "+departamento +"\n7.Horas: "+horastrabajadas +"\n8.Valor: "+valorhora);
}
}
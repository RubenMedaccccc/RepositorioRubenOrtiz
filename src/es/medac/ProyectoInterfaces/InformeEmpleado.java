package es.medac.ProyectoInterfaces;

/**
 * 
 * @author Rubén Ortiz
 */

public class InformeEmpleado extends Empleado {
    
    private int cant_hijos;
    private String hacienda;
    private String rentencion;

    public InformeEmpleado() {
        super();
        this.cant_hijos = 0;
        this.hacienda = "";
        this.rentencion = "";
    }

    public InformeEmpleado(int cant_hijos, String hacienda, String rentencion, String nombre, String apellido, String dni, String direccion, int edad, String formacionAcademica, int añosExperiencia, int horas_trabajadas, int pagoPorHora) {
        super(nombre, apellido, dni, direccion, edad, formacionAcademica, añosExperiencia, horas_trabajadas, pagoPorHora);
        this.cant_hijos = cant_hijos;
        this.hacienda = hacienda;
        this.rentencion = rentencion;
    }

    public int getCant_hijos() {
        return cant_hijos;
    }

    public void setCant_hijos(int cant_hijos) {
        this.cant_hijos = cant_hijos;
    }

    public String getHacienda() {
        return hacienda;
    }

    public void setHacienda(String hacienda) {
        this.hacienda = hacienda;
    }

    public String getRentencion() {
        return rentencion;
    }

    public void setRentencion(String rentencion) {
        this.rentencion = rentencion;
    }
    
    
    //Metodos
    private double pension(){
        
        if(this.rentencion.equals("retencion 2.5%")){
            return sueldoBruto()*0.025;
        }else if(this.hacienda.equals("hacienda 1.5%")){
            return sueldoBruto()*0.015;
        }else{
            return 0;
        }
    }
    
    
    private double bonoHijos (){
        if(this.cant_hijos == 1 || this.cant_hijos == 2){
            return sueldoBruto()*0.032;
        }else if(this.cant_hijos == 3 || this.cant_hijos == 4){
            return sueldoBruto()*0.05;
        }else if(this.cant_hijos >= 5){
            return sueldoBruto()*0.075;
        }else{
            return 0;
        }
    }
    
    
    @Override
    public String imprimirReciboPago() {
        return "INFORME DEL TRABAJADOR" + "\n" +
 "---------------------" + "\n" +
 " "+ "\n" +
 "Datos del Empleado" + "\n" +
 "Nombres: " + super.getNombre()+"\n" +
 "Apellidos: " + super.getApellido()+"\n" +
 "DNI: " + super.getDni()+ "\n" +
 "Edad: " + super.getEdad()+"\n" +
 "Dirección: " + super.getDireccion()+"\n" +
 "Formación Academica: " + super.getFormacionAcademica()+ "\n" +
 "Años de experiencia: " + super.getAñosExperiencia()+ "\n" + " " + "\n" +
 "Resumen de Pago" + "\n" + " "+ "\n" +
 "Sueldo Bruto: S/ " + this.sueldoBruto()+ "\n" +
 "Horas Extras: " + cant_horas_extras() + "\n" +
 "Pago por horas Extras: S/ " + horasExtras() + "\n" +
 "Pension: S/ " + pension()+ "\n" +
 "Bono por hijos: S/ " + bonoHijos()+ "\n" + "Sueldo Neto: S/ " + sueldoNeto();
    }

    @Override
    public int horasExtras() {
        int horaExtra =super.getPagoPorHora()*2;
        return horaExtra*cant_horas_extras();
    }

    @Override
    public int cant_horas_extras() {
        if(super.getHoras_trabajadas() > 40){
            return super.getHoras_trabajadas() - 40;
        }else{
            return 0;
        }
    }

    @Override
    public double sueldoBruto() {
        return super.getHoras_trabajadas()*super.getPagoPorHora();
    }

    @Override
    public double sueldoNeto() {
        return sueldoBruto() + horasExtras();
    }
    
    
    
    
    
}

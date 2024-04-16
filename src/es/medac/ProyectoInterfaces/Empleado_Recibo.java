package es.medac.ProyectoInterfaces;

public class  Empleado_Recibo extends Empleado {
    
    private String recibo;

    public Empleado_Recibo() {
        super();
        this.recibo = "";
    }

    public Empleado_Recibo(String recibo, String nombre, String apellido, String dni, String direccion, int edad, String formacionAcademica, int añosExperiencia, int horas_trabajadas, int pagoPorHora) {
        super(nombre, apellido, dni, direccion, edad, formacionAcademica, añosExperiencia, horas_trabajadas, pagoPorHora);
        this.recibo = recibo;
    }

    public String getRecibo() {
        return recibo;
    }

    public void setRecibo(String recibo) {
        this.recibo = recibo;
    }
    
    
    
    
    @Override
    public String imprimirReciboPago() {
         return "INFORME DEL TRABAJADOR" + "\n"
 + "----------------------" + "\n"
 + " " + "\n"
 + "Datos del Empleado" + "\n"
 + "Nombres: " + super.getNombre() + "\n"
 + "Apellidos: " + super.getApellido() + "\n"
 + "DNI: " + super.getDni() + "\n"
 + "Edad: " + super.getEdad() + "\n"
 + "Dirección: " + super.getDireccion() + "\n"
 + "Formación Academica: " + super.getFormacionAcademica() + "\n"
 + "Años de experiencia: " + super.getAñosExperiencia() + "\n"
 + " " + "\n"
 + "Resumen de Pago de " +this.recibo+ "\n"
 + "Sueldo Bruto: S/ " + sueldoBruto() + "\n"
 + "Horas Extras: " + cant_horas_extras() + "\n"
 + "Pago por horas Extras: S/ " + horasExtras() + "\n"
 + "Sueldo Neto: S/ " + sueldoNeto();
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


package Parcial;

public class Sport extends Moto{
    
    private String motor,potencia,tanque;

    public Sport(String motor, String potencia, String tanque, String placa, int modelo, int cilindraje) {
        super(placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
        this.tanque = tanque;
    }

    public String getMotor() {
        String tipo="";
        if(motor=="4t"){
            tipo="4t";
            
        }else{
            if(motor=="monocilindrico"){
                tipo="monocilindrico";
            }
        }
        return tipo;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getTanque() {
        return tanque;
    }
    
    public double motorGarantia (){
       
        
        if(getMotor()=="4t"){
            System.out.println("La garantia de la moto es por 2 años ");
         
    }if(getMotor()=="monocilindrico"){
            System.out.println("La garantia de la moto es por un año");
        }
        
        return motorGarantia();
    }
    

    
    
}

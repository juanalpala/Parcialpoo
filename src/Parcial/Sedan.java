
package Parcial;

public class Sedan extends Automovil{
    
    private double motor;
    private Boolean frenos;

    public Sedan(double motor, Boolean frenos, String placa, int modelo, double precio) {
        super(placa, modelo, precio);
        this.motor = motor;
        this.frenos = frenos;
    }

    public double getMotor() {
        return motor;
    }
    
    
    public Boolean isFrenos() {
        return frenos;
    }
    
    public Boolean frenosABS (){
        
        if(frenos){
            System.out.println("El automovil tiene frenos ABS");
        }else{
            System.out.println("El automovil no tiene frenos ABS");
        }
        return frenos;
        
    }
    
}


package Parcial;

public class ChevroletSail extends Sedan{
     
    private String tanque;
    private Boolean seguro;

    public ChevroletSail(String tanque, Boolean seguro, double motor, Boolean frenos, String placa, int modelo, double precio) {
        super(motor, frenos, placa, modelo, precio);
        this.tanque = tanque;
        this.seguro = seguro;
    }
    
    public Boolean Seguro (){
        
        if (seguro){
            System.out.println("El automovil tiene seguro todo riesgo");
        }else {
            System.out.println("El automovil no tiene seguro todo riesgo");
        }
       return seguro;
    }
    public double precioSeguro (double precio){
       
        double valorSeguro=0;
       valorSeguro=precio*0.1;
        
        if(precio>50000000){
            System.out.println("El valor del seguro es :"+valorSeguro);
     
        }else{
            System.out.println("No hay valor del seguro puesto que el valor del automovil es menor a 50000000");
        }
        
        return precioSeguro(0);
    }
    
   
}

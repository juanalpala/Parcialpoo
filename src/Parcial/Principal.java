
package Parcial;

import javax.swing.JOptionPane;

public class Principal {

   
    public static void main(String[] args) {
        
        
         
        boolean a=true;
        while(a){
       
        String menu = "CONCESIONARIO CAUCANO DE VEHIVULOS S.A \n"+
                 "   REGISTRO DE VEHICULOS VENDIDOS \n"+
                 "1. Registro de automoviles \n"+
                 "2. Registro de motos\n"+
                 "3. Vendedor\n"+
                 "4. Salir ";
        
      // mostrar el munu en una ventana emerjente 
      //para seleccionar la opcion del usuario
      
      String opMenu = JOptionPane.showInputDialog(menu);
      int opcion = Integer.parseInt(opMenu);
        
            
      
      switch (opcion){
          
          case 1:
                 Automovil automovil=new Automovil("ABC123",2030, 49000000); 
                 JOptionPane.showMessageDialog(null, "Los datos son : \n"+
                        "\nLa placa es : "+automovil.getPlaca()+
                        "\n El modelo es : "+automovil.getModelo()+
                        "\n El precio es : "+automovil.getPrecio());
                 
                 System.out.println("");
                
                
              break;
              
          case 2:
              Moto moto= new Moto("AND414", 2014, 150);
               JOptionPane.showMessageDialog(null, "Los datos son : \n"+
                        "\nLa placa es : "+moto.getPlaca()+
                        "\n El modelo es : "+moto.getModelo()+
                        "\n El Cilindraje es : "+moto.getCilindraje());
                 
                 System.out.println("");
              break;
              
          case 3:
              JOptionPane.showMessageDialog(null, "Creado por :\n"+
                      "Juan Carlos Alpala\n"+
                      "Keiner Buitron");
              break;
              
          case 4:
              a=false;
              break;
          
      }    
    }
    }
}

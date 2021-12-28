/*
 *clase para las funciones logicas de una lavadora
 */
package Libreria;

public class LLFunciones {
    
    private int kilos=0, llenadoCompleto=0,TipoDeRopa=0, lavadoCompleto=0,secadoCompleto=0;
    
    
    public LLFunciones(int kilos, int TipoDeRopa){
        this.kilos=kilos;
        this.TipoDeRopa=TipoDeRopa;
    }
    
    private void Llenado(){// void permite retortar el resultado de una funcion
    
        if(kilos<=12){
            llenadoCompleto=1;
            System.out.println("Llenando...");
            System.out.println("llenado completo");
            
            
        }else{
        
            System.out.println("la carga de ropa es muy pesada, reduce la carga");
        }
        
    }
        
    private void Lavado(){
        Llenado();
        
        if(llenadoCompleto==1){
           if(TipoDeRopa==1){//ropa de color
                System.out.println("ropa blanca/lavado suave");  
                System.out.println("Lavando ");
                lavadoCompleto=1;
           } else if(TipoDeRopa==2){
               System.out.println("ropa de color/ lavado intenso");
               System.out.println("Lavando");
               lavadoCompleto=1;
           }else{
               System.out.println("el tipo de ropa no esta disponible");
               System.out.println("Se lavará como ropa de color/ lavado intenso");
           }   lavadoCompleto=1;
        } 
         
    }
      
    private void Secado(){
        Lavado();
        if(lavadoCompleto==1){
          System.out.println("secando...");
          secadoCompleto=1; 
        }
        
    }
    public void CicloFinalizado(){
        Secado();
        if(secadoCompleto==1){
            System.out.println("tu ropa esta lista");
        }
    }
    
    //setter y getter permiten tener acceso a encapsulamiento privado
    public int getTipoDeRopa(){
        return TipoDeRopa;
    }
    public void setTipoDeRopa(int TipoDeRopa){
        this.TipoDeRopa=TipoDeRopa;
    }
} 

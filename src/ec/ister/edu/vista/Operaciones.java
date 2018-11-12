
package ec.ister.edu.vista;

import javax.swing.JOptionPane;


public class Operaciones {
    
    public static void main(String[] args) {
        
         Operaciones  res = new Operaciones();
        
        //res.numerosPares();
        //res.Factorial();
        res.serieTres();
    }
    
    public void numerosPares(){
        int i;
        int num;
        
       num= Integer.parseInt(JOptionPane.showInputDialog("Inhrese un numero : "));
       
       for( i = 1;i<=num;i++){
           if(i%2==0){
               
               JOptionPane.showMessageDialog(null,"Mis numeros pares son : "+i);
           }
       }    
    }
    
    public void Factorial(){
        int n1;
        int i;
        int res=1;
        
       n1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : ")); 
         for( i = 1;i<=n1;i++){
            res=res*i;
             JOptionPane.showMessageDialog(null," Factorial : "+res);
         }
    }
    public void serieTres(){
      int num;
      int i;
      
       num= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
       for( i = 0;i<=num;i+=3){
           
           JOptionPane.showMessageDialog(null,"Mi serie de 3 es : "+i);
       }
       
    }
    
    
}

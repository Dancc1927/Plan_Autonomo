import javax.swing.JOptionPane;

public class Segundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int numeros= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
     int[] num= new int[numeros];
     int[] num1= new int[num.length];
     int resul[]= new int[numeros];
     
     for(int i=0; i< num.length;i++) {
     num[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de num en la posicion:"+i));
     System.out.println(num[i]+"|");
     }
     System.out.println();
     for(int i=0; i< num.length;i++) {
         num1[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de num1 en la posicion:"+i));
         System.out.println(num1[i]+"|");
         }
         System.out.println();
         for(int i=0; i< resul.length;i++) {
             resul[i]=num[i]+num1[i];
             System.out.println(resul[i]+"|");
	}
	}
}

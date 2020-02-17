import java.util.Scanner;

public class OrLogic {
   public static void main (String[] args){
      Scanner sc = new Scanner (System.in);
      
      String p[] = new String[4];
      String q[] = new String[4];  
      String answer[] = new String[4];
      
      for(int i=0 ; i<p.length ; i++){
         System.out.print("Input p: ");
         p[i] = sc.nextLine();
         
      }
 
      for(int i=0 ; i<q.length ; i++){
      if(i==0){
       System.out.print("\nInput q: ");
       q[i] = sc.nextLine();
       }
      else{
      System.out.print("Input q: ");
       q[i] = sc.nextLine();
      }
      }
      
         for(int i=0; i<answer.length; i++){
      
         if(p[i].equalsIgnoreCase("T") && q[i].equalsIgnoreCase("T"))
         answer[i] = "T";
         if(p[i].equalsIgnoreCase("T") && q[i].equalsIgnoreCase("F"))
         answer[i] = "T";
         if (p[i].equalsIgnoreCase("F") && q[i].equalsIgnoreCase("T"))
         answer[i] = "T";
         if(p[i].equalsIgnoreCase("F") && q[i].equalsIgnoreCase("F"))
         answer[i] = "F";
   
         if(i==0){
         System.out.println("\n----------------------------");
         System.out.println("|   p   |   q   |  p || q  |  ");
         System.out.println("----------------------------");
         System.out.println("|\t "+p[i]+"\t  |\t"+q[i]+"\t |\t\t"+answer[0]+"\t   |");
         System.out.println("----------------------------");
         }
         else if (i<answer.length){
         System.out.println("|\t "+p[i]+"\t  |\t"+q[i]+"\t |\t\t"+answer[i]+"\t   |");
         System.out.println("----------------------------");
         }
     }
      
   }
}
//Χρυσούλα Ντέρα 2118181 Σε συνεργασία με Αναστασία Πηρίγκου 2118046 (Β'Εξάμηνο)

package money67;
import java.util.*;

public class Money67 {
     String billingaddress;
     String shippingaddress;
        public String baddress(){
           System.out.println("Give the billing address:");               //Pairnei times apo ton xrhsth gia to billing kai shipping adress
           Scanner sc2 = new Scanner(System.in);
           return billingaddress = sc2.nextLine();}
        
        public String saddress (){
           System.out.println("Give the shipping address:");
           Scanner sc2 = new Scanner(System.in);
           return shippingaddress = sc2.nextLine();}
    
   
    public static void main(String[] args) {
   
      
       Money67 customer = new Money67();
       
       System.out.println("The billing address:"+customer.baddress());      
       System.out.println("The shipping address:"+customer.saddress());
       
       System.out.println("How many products do you sell?");            //pairnei times apo ton xrhsth ton arithmo twn proiontwn pou poulaei
      
       Scanner sc1 = new Scanner(System.in);
       int a = sc1.nextInt();
       Invoices v1 = new Invoices();
       int[] m = new int [a];
       v1.array(a);                                                    //kalei th methodo pou bazei ta onomata twn prointwn kai tis times tous se pinakes
   
       for(int i=0;i<a;i++)
       {
           System.out.println("Give product name:");                  //pairnei times apo ton xrhsth gia to onoma tou proiontos pou agorase o customer kai tis posothtes
           Scanner sc2 = new Scanner(System.in);
           String b = sc2.nextLine();
        
           System.out.println("Give order amount:");
           Scanner sc3 = new Scanner(System.in);
           int c = sc3.nextInt();
           m[i]=m[i]+c;
           v1.remains(b, c);
       }
       int totalpay=0;
       for(int i=0;i<a;i++)
       {         
         v1.payment(m, i);
         System.out.println("Product payments:"+v1.payment(m,i));     //ektupwnei to payment gia to kathe proion
         totalpay = v1.payment(m,i) + totalpay;
       }
         System.out.println("Total payments:"+totalpay);
       
       
    }
}
class Invoices{
        int payments;
        int items;
        int i=0;
  
       

      
        String[] array = new String [items];
        int amounts[] = new int [items];
        
        public void array(int items)
        {
            for(i=0;i<items;i++)                                       //Gemizw tous pinakes list kai amounts
            {
                System.out.println("Type in the products:");
                Scanner sc1 = new Scanner(System.in);
                array[i] = sc1.nextLine();
                System.out.println("Type in the quantities of each product:");
                Scanner sc2 = new Scanner(System.in);
                int quant = sc2.nextInt();
                amounts[i] = quant;
            }
        }
        public void remains(String a, int b){
            int k=0;
            int found = 0;
            for (int i = 0; i < items; i++)
            {
               if(array[i].equals(a))
               {
                  k=i;
                  found=1;
               }
            }
            if(found==1)
            {    
            amounts[k]=amounts[k] - b;
            
           }
        }
         public int payment(int h[] , int i){
             
             System.out.println("Type the amount of money the customer will pay for:"+array[i]);
             Scanner sc2 = new Scanner(System.in);
             int n = sc2.nextInt(); 
             
             payments=n*h[i];

             return payments;
             
             
         }
        }
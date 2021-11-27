/*Resources*/
class Table{  
void printTable(int n)
{
   
   for(int i=1;i<=5;i++)
   {  
     System.out.println(n*i);  
     try
     {  
      Thread.sleep(400);  
     }
     catch(Exception e)
     {
         System.out.println(e);
         
     }  
   }  
  
 }  
} 
/*Thread1*/
class Thread1 extends Thread
{
   Table t;
   Thread1(Table t) 
   {
       this.t=t;
   }
   public void run()
   {
       t.printTable(5);
       
   }
   
}
/*Thread2*/
class Thread2 extends Thread
{
   Table t;
   Thread2(Table t) 
   {
       this.t=t;
   }
   public void run()
   {
      t.printTable(100);  
   }
   
}
/*Main Class*/
class HelloWorld {
    public static void main(String[] args) {
      Table t=new Table(); 
      Thread1 t1=new Thread1(t);
      t1.start();
      Thread2 t2=new Thread2(t);
      t2.start();
      
    }
}

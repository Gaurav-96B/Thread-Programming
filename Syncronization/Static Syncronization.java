/*Resources*/
class Table{  
synchronized static void printTable(int n)
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
       t.printTable(1);
       
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
      t.printTable(10);  
   }
   
}
/*Thread3*/
class Thread3 extends Thread
{
   Table t;
   Thread3(Table t) 
   {
       this.t=t;
   }
   public void run()
   {
      t.printTable(100);  
   }
   
}
/*Thread4*/
class Thread4 extends Thread
{
   Table t;
   Thread4(Table t) 
   {
       this.t=t;
   }
   public void run()
   {
      t.printTable(1000);  
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
      
      Table tl=new Table();
      Thread3 t3=new Thread3(tl);
      t3.start();
      Thread4 t4=new Thread4(tl);
      t4.start();
      
      
      
    }
}


/*Resources*/
class Customer
{    
int amount=10000;    
synchronized void withdraw(int amount)
{    
System.out.println("going to withdraw...");    
if(this.amount<amount)
{    
System.out.println("Less balance; waiting for deposit...");    
try
{
    wait();   
}
catch(Exception e)
{    
}    
}    
this.amount-=amount;    
System.out.println("withdraw completed...");    
}    
synchronized void deposit(int amount)
{    
System.out.println("going to deposit...");    
this.amount+=amount;    
System.out.println("deposit completed... ");    
notify();    
}    
} 


/*Thread1*/
class Thread1 extends Thread
{
   Customer c;
   Thread1(Customer c) 
   {
       this.c=c;
   }
   public void run()
   {
       c.withdraw(15000);
       
   }
   
}

/*Thread2*/
class Thread2 extends Thread
{
   Customer c;
   Thread2(Customer c) 
   {
       this.c=c;
   }
   public void run()
   {
       c.deposit(10000);
   }
   
}


/*Main Class*/
class HelloWorld {
    public static void main(String[] args) {
      Customer c=new Customer(); 
      Thread1 t1=new Thread1(c);
      t1.start();
      Thread2 t2=new Thread2(c);
      t2.start();
      
    }
}

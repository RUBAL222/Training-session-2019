package com.abc;
/*class One
{
	void runTask()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("***my App***");
			
		}
	}
}*/
class MyTask extends Thread
{
	public void run()
   {
		for(int i=0;i<=10;i++)
		{
			try 
			{
				Thread.sleep(500);
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			System.out.println("Task:"+i);
			
		}
	}
}
class C
{
	
}
class OurTask extends C implements Runnable{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try
			{
				Thread.sleep(1500);
			}
			catch(Exception e)
			{
				System.out.println(">>>>>>>OurTask:"+i);
			}
			
		}
	}
}
public class Threads
{
	public static void main(String args[])
	{   
		//job1
		System.out.println("app started");
		//blocking job
		MyTask mref=new MyTask();//thread
	    //mref.runTask();
		mref.setDaemon(true);
		Runnable r=new OurTask();
		//Thread yref=new Thread(r);
		Thread yref=new Thread(new OurTask());
		
	    Thread.currentThread().setName("jonyyy");
	    mref.setName("jackyyyy");
	    yref.setName("jennie");
	   
	    Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
	    mref.setPriority(Thread.NORM_PRIORITY);
	    yref.setPriority(Thread.MIN_PRIORITY);
	    
	    yref.start();
	    try {
	    	yref.join();
	    }
	    catch(InterruptedException e1)
	    {
	    	e1.printStackTrace();	
	    }
	    
	    mref.start();
        try {
        	mref.join();
        }
        catch(InterruptedException e1)
        {
        	e1.printStackTrace();
        	
        }
        //job2
		for(int i=1;i<=10;i++)
		{   
			try {
			Thread.sleep(1000);
		    }
			catch(Exception e) {
		    e.printStackTrace();
			}
		System.out.println("main thread:"+i);		
        }
        System.out.println("main thread name:"+Thread.currentThread().getName());
        System.out.println("my task name:"+mref.getName());
        System.out.println("ourTask name:"+yref.getName());
        
        System.out.println("main thread Priority:"+Thread.currentThread().getPriority());
        System.out.println("Mytask Priority:"+mref.getPriority());
        System.out.println("OurTask pririty:"+yref.getPriority());
        
        //job 3
     	System.out.println("App finished");
	 }                                            
}
    

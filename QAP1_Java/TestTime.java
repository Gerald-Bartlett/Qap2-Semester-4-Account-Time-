

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time ();
        Time t4 = new Time();   
       
       
        t1.setHour(21);
        t1.setMinute(10 ); 
        t1.setSecond(59); 
 
        t2.setHour(10);
        t2.setMinute(20); 
        t2.setSecond(00); 
 
        t3.setHour(11);
        t3.setMinute(59); 
        t3.setSecond(59); 
 
        t4.setHour(12);
        t4.setMinute(00); 
        t4.setSecond(00); 
 
     System.out.println( " ");
     System.out.println( "Time object = t1  " + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
     System.out.println( "Time object = t2  " + t2.getHour() +":" + t2.getMinute() + ":" + t2.getSecond());
     System.out.println( "Time object = t3  " + t3.getHour() + ":" + t3.getMinute() + ":" + t3.getSecond());
     System.out.println( "Time object = t4  " + t4.getHour() + ":" + t4.getMinute() + ":" + t4.getSecond());
     System.out.println( "==============================");
     
 
     System.out.println("NextSecond of Time t1: "+ t1.nextSecond());
     System.out.println("PreviousSecond of Time t2: "+ t2.previousSecond());
 
     System.out.println("NextSecond of Time t3: "+ t3.nextSecond());
     System.out.println("PreviousSecond of Time t4: "+ t4.previousSecond());
     System.out.println( " ");
 
    } 
 
    
 
 }
 
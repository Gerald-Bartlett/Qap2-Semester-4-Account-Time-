

public class Time {   
   private int hh; 
   private int mm;  
   private int ss;
   

   public Time(int hh,int mm,int ss) {
    this.hh = hh;
    this.mm = mm;
    this.ss = ss;
    
    
 }

 public Time() {  
    this.hh = 0;
    this.mm = 0;   
    this.ss = 0;
 }
 // Getters 
//hour
public int getHour() {
    return this.hh;
 }
 
//minute
 public int getMinute() {
    return this.mm;
 }
 
//second
 public int getSecond() {
    return this.ss;
 }


  //setters
 public void setHour(int hh) {
    this.hh = hh;
    
 }

 public void setMinute(int mm) {
    this.mm = mm;
 }
 public void setSecond(int ss) {
    this.ss = ss;
 }

 // returns hh:mm:ss
 public String toString() {     
      return String.format("%02d:%02d:%02d", hh, mm, ss);           
 }

 // sets time to given values
 public void setTime(int hh , int mm, int ss) {  
    this.hh = hh; 
    this.mm = mm;
    this.ss = ss;    
 }
 // produces next second
 public Time nextSecond() {
    ++ss;
    if (ss >= 60) {
       ss = 0;
       ++mm;
       if (mm >= 60) {
          mm = 0;
          ++hh;
          if (hh >= 23) {
             hh = 0;
          }
       }
       
    }
    return this;
}


// produces previous second
 public Time previousSecond() { 
    --ss;
    if (ss == -1) {
       ss = 59;
       --mm;
       if (mm == -1) {
          mm = 59;
          --hh;
          if (hh >= 23) {
             hh = 0;
          }
       }
       
    }  
        
    
    return this;   
 }
}
   


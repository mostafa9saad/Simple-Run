
package simple.run;
import java.awt.Event;
import static java.lang.System.exit;
 import java.util.Scanner;

public class SimpleRun {
    public static int total_burnt=0;
    public static double heart_rate=80;
     public static Activities s = new Activities("Swimming",4,0.002);
     public static Activities r = new Activities("Running",5,0.003);
     public static Activities k = new Activities("Kick_Boxing",3,0.005 );
     public static Activities t = new Activities("Strength_training",5,0.006);
    public static String t1;
   
 public static Activities sort[]={s,r,k,t};

    
    public static void main(String[] args)  {
        //Gui g=new Gui();
        Gui g=new Gui();
        
       
       
       
        
       
    }
    public static  void activity( int t1,char choics){
  
           
      
        
        
       
      
       switch(choics){
        case'1':              
           
            
        
       
          
           
                
               
               
                s.settime(t1);
                s.cal_burn(activity_burn(t1,choics));
                s.heart_inc(heart_rate(t1,choics));
                total_burnt(t1,choics);
                calc_heart_rate(t1 , choics);
               
              
              main(null);
                break;
                
                
                
                case'2':
               
               
               
                r.settime(t1);
                r.cal_burn(activity_burn(t1,choics));
                r.heart_inc(heart_rate(t1,choics));
                total_burnt(t1,choics);
                calc_heart_rate(t1 , choics);
              
                main(null);
                break;
                                 
                case'3':
           
           
               
                
                k.settime(t1);
                k.cal_burn(activity_burn(t1,choics));
                k.heart_inc(heart_rate(t1,choics));
                total_burnt(t1,choics);
                calc_heart_rate(t1 , choics);
               
                main(null);
                break;
                
                case'4':
           
                   
                    
                
                
                t.settime(t1);
                t.cal_burn(activity_burn(t1,choics));
                t.heart_inc(heart_rate(t1,choics));
                total_burnt(t1,choics);
                calc_heart_rate(t1 , choics);
             
                main(null);
                break;  
                case'5':
                sort();
                
                
                
                
                }
                
    
    
    
    }
    public static int activity_burn(int time ,char choics){
        
        int burn;
           switch (choics) {
            case '1':
               return
                       burn=s.get_calories()*time;
                
            case '2':
               return
                       burn=r.get_calories()*time;
                
            case '3':
               return
                       burn=k.get_calories()*time;
                
            case '4':
              return
                      burn=t.get_calories()*time;
                
            
        }
        return 0;
        
    }
   
       public static void total_burnt(int time,char activity){
         
        switch (activity) {
            case '1':
               
                       total_burnt=total_burnt+s.get_calories()*time;
                       break;
                
            case '2':
              
                       total_burnt=total_burnt+r.get_calories()*time;
                break;
            case '3':
               
                       total_burnt=total_burnt+k.get_calories()*time;
                break;
            case '4':
              
                      total_burnt=total_burnt+t.get_calories()*time;
                break;
            
        }
        
    }
       public static double heart_rate(int time ,char choics){
           double rate;
       
           switch (choics) {
            case '1':
                return
                rate=80 +(80*time*s.get_heart_rate_inc());
              
            case '2':
                return
                       rate=80 +(80*time*r.get_heart_rate_inc());
                
            case '3':
               return
                      rate=80+(80*time*k.get_heart_rate_inc());
                
            case '4':
                return
               rate=80 +(80*time*t.get_heart_rate_inc());
                
            
        }
        return 0;
       
       
       
       
       }
       
       
       
       
       public static void calc_heart_rate(int time , char activity){
           
           switch (activity) {
            case '1':
                
                heart_rate=heart_rate +(heart_rate*time*s.get_heart_rate_inc());
              break;
            case '2':
                
                        heart_rate=heart_rate +(heart_rate*time*r.get_heart_rate_inc());
                break;
            case '3':
              
                       heart_rate=heart_rate +(heart_rate*time*k.get_heart_rate_inc());
                break;
            case '4':
                
                heart_rate=heart_rate +(heart_rate*time*t.get_heart_rate_inc());
                break;
            
        }
           
           
       }
       
       public static void sort() {
           int c,d;
           int n=4;
           Activities swap;
           
           
            
     
   
    for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
          if(sort[d].get_burnt()!= sort[d+1].get_burnt()){
        if (sort[d].get_burnt() < sort[d+1].get_burnt()) 
        {
          swap       = sort[d];
          sort[d]   = sort[d+1];
          sort[d+1] = swap;
        }
      }
          else if(sort[d].get_burnt()== sort[d+1].get_burnt()){
          
          if (sort[d].get_heart_rate() < sort[d+1].get_heart_rate_inc()) 
        {
          swap       = sort[d];
          sort[d]   = sort[d+1];
          sort[d+1] = swap;
        }
          
          }
          
    }
    }
           
           
  
           
    
       }     

  
  


       
      
      
	    }
                       
    



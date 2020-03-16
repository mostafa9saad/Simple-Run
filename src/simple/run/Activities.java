
package simple.run;


public class Activities   {
    private final  String activity;
    private final  int calories;
    private final  double heart_rate_inc ;
    private int burnt;
    private int time ;
    private double heart_rate;
       public Activities( String name ,int cal,double rate_inc){
    activity  = name;
    calories=cal;
    heart_rate_inc=rate_inc;
    burnt=0;
    time=0;
    heart_rate=0;
    
    }public String get_name(){
    return activity;
}
public int get_calories(){
    return calories;
}
public double get_heart_rate_inc(){
    return heart_rate_inc;
}
  public void cal_burn(int b){
    burnt=burnt+b;
} 
  public int get_burnt(){
    return burnt;
}
  public void settime(int t){
    time=t;
}
  public int get_time(){
      return time;
  }
  public void heart_inc(double h){
    h=heart_rate+h;
    heart_rate=h-80;
}
  public double get_heart_rate(){
    return heart_rate;}
  
  
  
    
   
    
  
}

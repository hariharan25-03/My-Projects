import java.util.Date;
import java.time.*;
  public class BasicWatch {
     String material;
     String caseType;
     float width;
     float height;
     float weight;
     int thickness;
     Date d ;
      public BasicWatch(String material,String caseType,int width,int height,int weight,int thickness)
      {
           this.material=material;
           this.caseType=caseType;
           this.width=width;
           this.height=height;
           this.weight=weight;
           this.d= new Date();
      }
     public void showTime()
     {
          System.out.println(java.time.LocalTime.now());
     }
     public void showDate()
     {
          System.out.println(d.getDate()+":"+d.getMonth()+":"+d.getYear());
     }

}

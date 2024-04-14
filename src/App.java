import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        
		//GMT = Greenwich Mean Time (time zone)
		//(UTC)= Coordinated Universal Time (time standard)-3 hrs diferença Brasil
		//ISO 8601 formato yyyy-MM-ddTHH:mm:ssZ (2024-04-14T16:15:08Z
		
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		   SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		   
		   
		   
		   java.util.Date y1 = sdf1.parse("14/04/2024");
		   java.util.Date y2 = sdf2.parse("14/04/2024 16:15:08");
		   
		  
		  
		   System.out.println("y1: "+sdf1.format(y1));
		   System.out.println("y2: "+sdf2.format(y2));
		
		

    }
}

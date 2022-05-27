package javap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class date {

	public static void main(String args[]) throws ParseException {
		
	    // create old date in string format  
        String dateBefore = "2/24/2022";    
        System.out.println(dateBefore+" is the date before adding days");  
          
        // create instance of the SimpleDateFormat that matches the given date  
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");  
          
        //create instance of the Calendar class and set the date to the given date  
        Calendar cal = Calendar.getInstance();  
        try{  
           cal.setTime(sdf.parse(dateBefore));  
        }catch(ParseException e){  
            e.printStackTrace();  
         }  
             
        // use add() method to add the days to the given date  
        cal.add(Calendar.DAY_OF_MONTH, 3);  
        String dateAfter = sdf.format(cal.getTime());  
          
        //date after adding three days to the given date  
        System.out.println(dateAfter+" is the date after adding 3 days.");  
	}
}

package main.app.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

public class DateUtil {
	private static Logger logger = Logger.getLogger("main.app.util.DateUtil");
	
	/**
     * Get current Date Time 
     * @return Calender (AppConstants.APP_WEB_DATE_TIMESTAMP)
     */
    public static Calendar getCurrentDateTime()
    {
        try
        {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat(AppConstants.APP_WEB_DATE_TIMESTAMP);
            String currentDate = sdf.format(cal.getTime());            
            Date date = sdf.parse(currentDate);
            cal.setTime(date);
            return cal;
         }
        catch (Exception exception)
        {
            logger.error("Error converting to Date: " + exception.getMessage());
            return null;
        }
    }

}

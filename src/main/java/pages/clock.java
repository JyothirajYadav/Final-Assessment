package pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

public class clock
{
    public static void main(String [] args)
    {
//        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//        currentDate=currentDate.replace("-","_");
//        String last="";
//        String [] currentdate=currentDate.split("-");
//        System.out.println(Arrays.toString(currentdate));
//        last = last +currentdate[0]+currentdate[1]+currentdate[2];
//
////        for(int i=0;i<currentdate.length;i++)
////        {
////            last =last + currentdate[i];
////        }
      System.out.println(new Date());
    }
}

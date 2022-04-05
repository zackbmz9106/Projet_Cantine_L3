package model;

import java.util.Scanner;

    public class DisplayCalendar
       {  
        public static void main(String[] args)
        {
        //Create a new scanner 
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter year 
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        // Prompt user to enter first day of the year
        System.out.print("Enter the weekday that the year starts: ");
        int firstDayYear = input.nextInt();
        
        // A for loop that prints out each month
        for(int month = 1; month <= 12; month++)
        {
            // Set the value of the amount of days in a month
            int daysMonth = 0;
            
            // Set value of the month 
            String monthDisplay = "";   
            
            // Find name of each month and number of days
            switch(month)
            {
                case 1: monthDisplay = "January"; 
                    daysMonth = 31;
                    break;
                
                case 2: 
                    monthDisplay = "February";
                    int leapYear = 0;
                    while (leapYear > -1)
                    {   
                        // Count all years that are divisible by 4 to be a leap year.
                        leapYear += 4;
                        
                        // If the year inputted is a leap year, the days of the month will be 29.
                        if (year == leapYear)
                        {
                            daysMonth = 29;
                            break;
                        }
                        
                        else 
                        {
                            daysMonth = 28;
                        }
                    }
                    break;

                case 3: monthDisplay = "March";
                    daysMonth = 31;
                    break;
                
                case 4: monthDisplay = "April";
                    daysMonth = 30;
                    break; 
                
                case 5: monthDisplay = "May";
                    daysMonth = 31;
                    break;
                
                case 6: monthDisplay = "June";
                    daysMonth = 30;
                    break; 
                
                case 7: monthDisplay = "July";
                    daysMonth = 31;
                    break;
                
                case 8: monthDisplay = "August";
                    daysMonth = 31;
                    break;
                
                case 9: monthDisplay = "September";
                    daysMonth = 30;
                    break;
            
                case 10: monthDisplay = "October";
                    daysMonth = 31;
                    break;
                
                case 11: monthDisplay = "November";
                    daysMonth = 30;
                    break;
                
                case 12: monthDisplay = "December";
                    daysMonth = 31;
                    break; 
                
                // If the month is not recognized, dialog box will be displayed, and then exits program. 
                default : System.out.print("Invalid: Your month is not recognized. ");
                    System.exit(0); 

            }
            // Display the month and year
            System.out.println("                      "+ monthDisplay + " " + year);
            
            // Display the lines
            System.out.println("_____________________________________");
            
            // Display the days of the week
            System.out.println("Sun     Mon     Tue     Wed     Thu     Fri     Sat");
            
            // Print spaces depending on the day the month starts.
            int firstDayEachMonth = (daysMonth + firstDayYear)%7;
            for (int space = 1; space <= firstDayEachMonth; space++)
                System.out.print("   ");

            // Print the days 
            for (int daysDisplay = 1; daysDisplay <= daysMonth; daysDisplay++)
            {
                if (firstDayYear%7 == 0)
                    System.out.println();
                
                System.out.printf("%3d      ", daysDisplay);
                firstDayYear += 1;
            }
            System.out.println();
        }
            
    }
}   
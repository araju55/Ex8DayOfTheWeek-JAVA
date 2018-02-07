/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 17011947
 */
public class Ex8DayOfTheWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter Number of the Day: ");
        int NumDay = kb.nextInt();
        
        
        if (NumDay == 1)
        {    
            System.out.println("Monday");
        }
        if (NumDay == 2)
        {
            System.out.println("Tuesday");
        }
        if (NumDay == 3)
        {
            System.out.println("Wednesday");
        }
        if (NumDay == 4)
        {
            System.out.println("Thursday");
        }
        if (NumDay == 5)
        {
            System.out.println("Friday");
        }
        if (NumDay == 6)
        {
            System.out.println("Saturday");
        }
        if (NumDay == 7)
        {
            System.out.println("Sunday");
        }   
        if (NumDay >= 8)
        {    
            System.out.println("INVALID DAY NUMBER!");
        }
            System.out.print("Today is: " + NumDay);
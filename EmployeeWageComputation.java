package com.day3_program.Basics;
public class UC_1_Check_Employee_Attendance 
{
    public static void main( String[] args )
    {
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random()*10)%2;
	System.out.println(""
                        + "    ##     ## ###### ##     ###### ###### ###   ### ######\r\n"
                        + " *  ##     ## ##     ##     ##     ##  ## ## # # ## ##      *\r\n"
                        + "*** ##  #  ## #####  ##     ##     ##  ## ##  #  ## #####  ***\r\n"
                        + " *  ## # # ## ##     ##     ##     ##  ## ##     ## ##      *\r\n"
                        + "    ###   ### ###### ###### ###### ###### ##     ## ###### \r\n"
                        + "--------------- EMPLOYEE WAGE COMPUTATION-----------------------\r\n");

        if (empCheck == IS_FULL_TIME)
        {
        System.out.println("Employee is present");
        }
        else 
        {
        	System.out.println("Employee is Absent");
        }
        
    }
}

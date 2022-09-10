package Basics;

public class employeeWageComputation {
<<<<<<< HEAD
	public static final int IS_PART_TIME = 1;
  	 public static final int IS_FULL_TIME = 2;
  	 public static final int EMP_RATE_PER_HOUR = 20;
=======
	 public static final int IS_PART_TIME = 1;
	 public static final int IS_FULL_TIME = 2;
	 public static final int EMP_RATE_PER_HOUR = 20;
	 public static final int NUM_OF_WORKING_DAYS = 20;
>>>>>>> UC-5_Calculating_Wages_For_Month
	 public static void main( String[] args )
	    {
	        System.out.println(""
	                        + "    ##     ## ###### ##     ###### ###### ###   ### ######\r\n"
	                        + " *  ##     ## ##     ##     ##     ##  ## ## # # ## ##      *\r\n"
	                        + "*** ##  #  ## #####  ##     ##     ##  ## ##  #  ## #####  ***\r\n"
	                        + " *  ## # # ## ##     ##     ##     ##  ## ##     ## ##      *\r\n"
	                        + "    ###   ### ###### ###### ###### ###### ##     ## ###### \r\n"
	                        + "--------------- EMPLOYEE WAGE COMPUTATION-----------------------\r\n");
<<<<<<< HEAD
	   		 int empHrs = 0;
	   		 int empWage = 0;
	   		 int empCheck = (int) Math.floor(Math.random() * 10)% 3;
	   		 switch(empCheck) {
	   		    case IS_PART_TIME:
	   		    empHrs = 4;
	   		    break;
	   		    case IS_FULL_TIME:
	   			    empHrs = 8;
	   			    break;
	   			default:
	   				empHrs=0;
	   		 }
	   		 empWage = empHrs * EMP_RATE_PER_HOUR;
	   		 System.out.println("Employee Wage is: " + empWage);
=======
	        int empWage=0, empHrs=0, totalEmployeewage=0;
			 for(int day=0; day<NUM_OF_WORKING_DAYS; day++) {
				 int empCheck = (int) Math.floor(Math.random() * 10)% 3;
				 switch(empCheck) {
				    case IS_PART_TIME:
				    empHrs = 4;
				    break;
				    case IS_FULL_TIME:
					    empHrs = 8;
					    break;
					default:
						empHrs=0;
				 }
				 empWage = empHrs * EMP_RATE_PER_HOUR;
				 totalEmployeewage += empWage;
			 }
			 System.out.println("Total Employee Wage is: " + totalEmployeewage);
>>>>>>> UC-5_Calculating_Wages_For_Month
	   	 
	    }


}

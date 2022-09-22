package com.inheritance_interface.bll;

public class HourlyEmployee extends Employee{
	
	private double wage;
	private double hours;
	
	
    
    public HourlyEmployee( String name, String jobTitle, double hrSalary, double hoursWorked )
    {
       super( name, jobTitle ); 
       setWage( hrSalary );
       setHours(hoursWorked);
    }
    
    public void setWage( double hrSalary )
         {
             if ( hrSalary >= 0.0 )
                wage = hrSalary;
             else
                throw new IllegalArgumentException(
                   "Hourly wage must be  >= 0.0" );
          } 
    
       
          public double getWage()
          {
             return wage;
          } 
          
          
          public void setHours(double hoursWorked)
          {
        	  if ( ( hoursWorked >= 0.0 ))
        	  {
        		  hours=hoursWorked;
        	  }
        	  else
        	  {
        		  throw new IllegalArgumentException(
        		  "Hours worked must be >= 0.0" );
        	  }
          }
          public double getHours()
          {
        	  return hours;
          }
          
         
          @Override                                                           
          public double calculatePay()                                            
          {
              return getHours()*getWage();                                        
          }

		@Override
		public String toString() {
			return "HourlyEmployee [name="+getName()+", jobTitle="+getJobTitle()+", wage=" + wage + ", hours=" + hours +", totalWage="+calculatePay()+ "]";
		}

			    
          
}

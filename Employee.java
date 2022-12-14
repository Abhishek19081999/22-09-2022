package com.inheritance_interface.bll;

public abstract class Employee {
	  
	    
	        private String name;
	        private String jobTitle;
	 
	     
	       public Employee( String name, String jobTitle )//parameterized constructor for name and job title
	       {
	          this.name = name;
	          this.jobTitle = jobTitle;
	       }


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getJobTitle() {
			return jobTitle;
		}


		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}

		public abstract double calculatePay();//calculate total wage method

		@Override
		public String toString() {
			return "Employee [Name=" + name + ", Job Title=" + jobTitle + "]";
		} 
	       
	       

}

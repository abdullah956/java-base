public class Department 
{
	private String departmentName ;
	private int totalStudents ;
	public String hodName ;
	public String address ;
	
	public Department ( String departmentName )
	{
		this.departmentName = departmentName ;
	}
	
	public Department ( String departmentName , int totalStudents )
	{
		this.departmentName = departmentName ;
		this.totalStudents = totalStudents ;
	}
	
	public Department ( String departmentName , int totalStudents , String hodName )
	{
		this.departmentName = departmentName ;
		this.totalStudents = totalStudents ;
		this.hodName = hodName ;
	}
	
	public Department ( String departmentName , int totalStudents , String hodName , String address )
	{
		this.departmentName = departmentName ;
		this.totalStudents = totalStudents ;
		this.hodName = hodName ;
		this.address = address ;
	}
	
		// end of constructors
	

	
	public void displayDeptData ()
	{
		System.out.println( "Department Name : " + this.departmentName );
		System.out.println( "Total Students : " + this.totalStudents );
		System.out.println( "HOD Name : " + this.hodName );
		System.out.println( "Address : " + this.address );
	}                                                                                                                                                                     
	
		// end of displays methods
	
	public void setDepartmentName ( String n )
	{
		this.departmentName = n ;
	}
	
	public String getDepartmentName ()
	{
		return this.departmentName ;
	}
	
		// end of department name setter and getter
	
	public void setTotalStudents ( int t )
	{
		this.totalStudents = t ;
	}
	
	public int getTotalStudents ()
	{
		return this.totalStudents ;
	}
	
		// end of total students setter and getter
	
	public void setHODName ( String n )
	{
		this.hodName = n ;
	}
	
	public String getHODName ()
	{
		return this.hodName ;
	}
	
		// end of HOD Name setter and getter
	
	public void setAddress ( String a )
	{
		this.address = a ;
	}
	
	public String getAddress ()
	{
		return this.address ;
	}
	
		// end of department address setter and getter
        public static void main ( String [] args )
        {
            Department d1 = new Department ( "Computer Science " ) ;
            Department d2 = new Department ( "Computer Science " , 150 ) ;
            Department d3 = new Department ( "Computer Science " , 150 , "Abdul Sattar" ) ;
            Department d4 = new Department ( "Computer Science " , 150 , "Abdul Sattar" , "Rahim Yar Khan" ) ;
            
          
            
            d1.displayDeptData();
            
          
            
            d2.displayDeptData();
            
           
            
            d3.displayDeptData();
            

            
            d4.displayDeptData();
        }
}
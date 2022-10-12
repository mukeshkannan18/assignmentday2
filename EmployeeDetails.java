package week1.day2;

public class EmployeeDetails {
	public void employeeName() {
		String empName="mukeshkannan";
		int empId=5547;
		System.out.println("EmpName:"+empName);
		System.out.println("EmpID:"+empId);
	}
	public void employeeAddress() {
		String empAddress="coimbatore";
		System.out.println(empAddress);
	}
	public void employeeSalary() {
		double empSalary=45000.589;
		System.out.println(empSalary);
	}
	public void employeeMobileNumber() {
		long empMobileNumber=8585857499L;
		System.out.println(empMobileNumber);
	}
	public static void main(String[] args) {
		EmployeeDetails details=new EmployeeDetails();
		details.employeeName();
		details.employeeAddress();
		details.employeeSalary();
		details.employeeMobileNumber();
		
	}

}

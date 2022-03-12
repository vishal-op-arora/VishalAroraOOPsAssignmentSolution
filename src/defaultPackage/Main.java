package defaultPackage;

public class Main {
	public static void main(String[] args) {
		
		AdminDepartment adminDepartment = new AdminDepartment();
		System.out.println(" Welcome to" + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork().replace("Sub", "sub"));
		System.out.println(adminDepartment.getWorkDeadline().trim());
		System.out.println(adminDepartment.isTodayAHoliday().trim().replace("holiday", "Holiday") + "\n");
		
		HrDepartment hrDepartment = new HrDepartment();
		System.out.println(" Welcome to" + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork().trim().replace("worksheet", "timesheet"));
		System.out.println(hrDepartment.getWorkDeadline().trim());
		System.out.println(hrDepartment.isTodayAHoliday().trim().replace("holiday", "Holiday") + "\n");
		
		TechDepartment techDepartment = new TechDepartment();
		System.out.println(" Welcome to" + techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork().trim().replace("module", "Module"));
		System.out.println(techDepartment.getWorkDeadline().trim());
		System.out.println(" " + techDepartment.getTechStackInformation().replace("core", "Core"));
		System.out.println(techDepartment.isTodayAHoliday().trim().replace("holiday", "Holiday"));
	}
}

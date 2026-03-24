class Profile{
	String name;
	int age;
	String job;
	double salary;
	String address;
	double workExperience;
	
	Profile(String name, int age, String job, double salary, String address, double workExperience){
		this.name=name;
		this.age=age;
		this.job=job;
		this.salary=salary;
		this.address=address;
		this.workExperience=workExperience;
	}
	
	void printInfo(){
		System.out.println("Executing Profile Information...");
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Job:"+this.job);
		System.out.println("Salary:"+this.salary);
		System.out.println("Address:"+this.address);
		System.out.println("Work Experience:"+this.workExperience);
	}
}
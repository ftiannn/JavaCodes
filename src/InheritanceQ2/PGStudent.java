package InheritanceQ2;
class PGStudent extends Student
{
	private String specialization;
	private int noOfPapersPublished;
	
	public PGStudent(String name, String id, int age, double grade, String address, String specialization, int noOfPapersPublished) {
		super(name, id, age, grade, address);
		this.name = name;
		this.id = id;
		this.age = age;
		this.grade = grade;
		this.address = address;
		this.specialization = specialization;
		this.noOfPapersPublished = noOfPapersPublished;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public int getNoOfPapersPublished() {
		return noOfPapersPublished;
	}
	
	public void setNoOfPapersPublished(int noOfPapersPublished){
		this.noOfPapersPublished = noOfPapersPublished;
	}
	
	public void display() {
		System.out.println("Name : " + getName());
		System.out.println("Id : " + getId());
		System.out.println("Age : " + getAge());
		System.out.println("Grade : " + getGrade());
		System.out.println("Address : " + getAddress());
		System.out.println("Specialization : " + getSpecialization());
		System.out.println("No. of papers published : " + getNoOfPapersPublished());
		
	}
	
	public boolean isPassed() {
		if (grade>=70) {
			return true;
		}
		
		else {
			return false;
		}
	}
}

package InheritanceQ2;
class UGStudent extends Student
{
	private String degree;
	private String stream;
	/*FILL CODE HERE*/
	
	public UGStudent(String name, String id, int age, double grade, String address, String degree, String stream) {
		super(name, id, age, grade, address);
		this.name = name;
		this.id = id;
		this.age = age;
		this.grade = grade;
		this.address = address;
		this.degree = degree;
		this.stream = stream;
	}
	
	public String getDegree() {
		return degree;
	}
	
	public String getStream() {
		return stream;
	}
	
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public void setStream(String stream) {
		this.stream = stream;
	}
	
	public void display() {
		System.out.println("Name : " + getName());
		System.out.println("Id : " + getId());
		System.out.println("Age : " + getAge());
		System.out.println("Grade : " + getGrade());
		System.out.println("Address : " + getAddress());
		System.out.println("Degree : " + getDegree());
		System.out.println("Stream : " + getStream());
		
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
	

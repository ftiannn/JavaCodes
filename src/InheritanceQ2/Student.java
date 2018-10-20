package InheritanceQ2;
class Student
{
	protected String name;
	protected String id;
	protected int age;
	protected double grade;
	protected String address;
	/*FILL CODE HERE*/
	
	public Student(String name, String id, int age, double grade, String address) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.grade = grade;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId(){
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name : " + getName());
		System.out.println("Id : " + getId());
		System.out.println("Age : " + getAge());
		System.out.println("Grade : " + getGrade());
		System.out.println("Address : " + getAddress());
		
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
	

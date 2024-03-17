package MultipleInheritance;

public class Person {
	private String name;
	private long conatctNo;
	public int dateOfBirth;

	public Person(String name, long conatctNo, int dateOfBirth) {
		super();
		this.name = name;
		this.conatctNo = conatctNo;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getConatctNo() {
		return conatctNo;
	}

	public void setConatctNo(long conatctNo) {
		this.conatctNo = conatctNo;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Person() {
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", conatctNo=" + conatctNo + ", dateOfBirth=" + dateOfBirth + "]";
	}

}



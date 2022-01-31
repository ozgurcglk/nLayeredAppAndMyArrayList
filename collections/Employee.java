package collections;

public class Employee extends Entity{
	private int id;
	private String firstName;
	
	public Employee() {
		super();
	}

	public Employee(int id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
}

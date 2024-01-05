package Class_Diagrams;

public abstract class User {

	public Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserType type;

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}
}
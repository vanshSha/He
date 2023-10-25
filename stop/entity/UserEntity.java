package stop.entity;

public class UserEntity {

	private Long id;
	private String name;

	public UserEntity() {

	}

	public UserEntity(Long id, String name) {
        // Initialize id and name constructor

		this.id = id;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

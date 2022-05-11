package demo;

public class Member {

	private Long id;
	private String username;
	private Grade grade;
	private int age;

	public Member(Long id, String username, Grade grade, int age) {
		this.id = id;
		this.username = username;
		this.grade = grade;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

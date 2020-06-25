public class MySecondObject
{
	private String name;
	private int age;
	private boolean dead;
	
	public MySecondObject()
	{
	
	}


	public MySecondObject(String name, int age, boolean dead) {
		super();
		this.name = name;
		this.age = age;
		this.dead = dead;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isDead() {
		return dead;
	}
	public void setDead(boolean dead) {
		this.dead = dead;
	}
	
	@Override
	public String toString() {
		return "MySecondObject [name=" + name + ", age=" + age + ", dead=" + dead + "]";
	}
	
	
}


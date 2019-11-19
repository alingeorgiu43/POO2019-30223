package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;
import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;

public abstract class Employee {
	{

	}
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	private static Random random = new Random();

	Employee(String name, BigDecimal salary, boolean isDead) {
		this.name = name;
		this.salary = salary;
		this.isDead = isDead;
		this.id = Long.parseLong(getRandomNumber(14));
	}

	public static String getRandomNumber(int digCount) {
		StringBuilder sb = new StringBuilder(digCount);
		for (int i = 0; i < digCount; i++)
			sb.append((char) ('0' + random.nextInt(10)));
		return sb.toString();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public boolean getIsDead() {
		return this.isDead;
	}

	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

}

package com.mycompany.pattern;

public class Student 
{
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String address;
	private final String college;
	
	private Student(StudentBuild build)
	{
		this.firstName = build.firstName;
		this.lastName = build.lastName;
		this.age = build.age;
		this.address =  build.address;
		this.college = build.college;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public String getCollege()
	{
		return this.college;
	}
	
	public String details()
	{
		return "Student: "+this.firstName+" "+this.lastName+" "+this.age+" "+this.address+" "+this.college;
	}
	
	public static class StudentBuild
	{
		private final String firstName;
		private final String lastName;
		private int age;
		private String address;
		private final String college;
		
		public StudentBuild(String first,String last,String college)
		{
			this.firstName = first;
			this.lastName = last;
			this.college = college;
		}
		
		public StudentBuild age(int age)
		{
			this.age = age;
			return this;
		}
		
		public StudentBuild address(String address)
		{
			this.address = address;
			return this;
		}
		
		public Student acquire()
		{
			Student student = new Student(this);
			return student;
		}
		
	}
}

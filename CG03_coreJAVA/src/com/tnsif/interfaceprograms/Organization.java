package com.tnsif.interfaceprograms;

//Multiple level of inheritance demo

interface TechnicalRole{
	void designArchitecture();
}

interface ManagementRole{
	void ManageTeam();
}

class ProjectManager implements TechnicalRole, ManagementRole{

	private String name;
	private String Projectname;
	private int Teamsize;
	private double Projectbudget;
	
	public ProjectManager(String name, String projectname, int teamsize, double projectbudget) {
		super();
		this.name = name;
		Projectname = projectname;
		Teamsize = teamsize;
		Projectbudget = projectbudget;
	}

	@Override
	public void ManageTeam() {
		System.out.println("Managing a team of "+Teamsize+" Developers");
	}

	@Override
	public void designArchitecture() {
		System.out.println(name +" is architecture for "+Projectname);
	}
	
	void  checkBudegt() {
		if(Projectbudget>1000000) {
			System.out.println("High Budget Project");
		}
		else {
			System.out.println("Standard Budget Project");
		}
	}
	
	void displayProjectdetails() {
		System.out.println("Display Project details: ");
		System.out.println("Manager: "+name);
		System.out.println("Project: "+Projectname);
		System.out.println("Team: "+Teamsize);
		System.out.println("Project Budget: "+Projectbudget);
	}
}

public class Organization {
public static void main(String[] args) {
	ProjectManager m= new ProjectManager("Anil", "E-commerance Platform", 8, 250000);
	
	m.designArchitecture();
	m.ManageTeam();
	m.checkBudegt();
	m.displayProjectdetails();
}
}

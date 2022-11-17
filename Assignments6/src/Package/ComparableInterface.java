package Package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {

	public static void main(String[] args) 
	{
		List<Agent> data = new ArrayList<>();
		data.add(new Agent(104,"Dinesh","Krishnanagr"));
		data.add(new Agent(103,"Mahesh","Morya Nagar"));
		data.add(new Agent(102,"Divesh","Sarojini Nagar"));
		data.add(new Agent(101,"Ramesh","Ajanta Nagar"));
		Collections.sort(data);
		for (Agent i:data)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getArea());
		}
	}
}

class Agent implements Comparable<Agent>
{
	private int id;
	private String name;
	private String area;
	public Agent(int id, String name, String area) 
	{
		super();
		this.id = id;
		this.name = name;
		this.area = area;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getArea() 
	{
		return area;
	}
	public void setArea(String area) 
	{
		this.area = area;
	}
	@Override
	public int compareTo(Agent o) 
	{
		// TODO Auto-generated method stub
		return this.area.compareTo(o.area);
	}
}
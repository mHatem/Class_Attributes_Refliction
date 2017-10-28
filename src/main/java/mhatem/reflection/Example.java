package mhatem.reflection;

import java.util.*;

public class Example {

	private int id;
	private String name;
	private List<String> values;
	
	public Example(){
		id = 0;
		name = "";
		values = new ArrayList();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}
	
}

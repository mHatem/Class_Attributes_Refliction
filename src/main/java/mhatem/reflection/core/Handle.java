package mhatem.reflection.core;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class Handle {

	List<String> modifiers;
	List<String> fieldTypes;
	List<String> fields;
	List<Method> getters;
	List<Method> setters;

	public Handle() {
		modifiers = new ArrayList<String>();
		fields = new ArrayList<String>();
		fieldTypes = new ArrayList<String>();
		getters = new ArrayList<Method>();
		setters = new ArrayList<Method>();
	}

	public <T> void handleClass(Class<T> objClass) {

		Field[] fields = objClass.getDeclaredFields();

		for (Field field : fields) {
			this.fieldTypes.add(field.getType().getSimpleName());
			this.fields.add(field.getName());
			this.modifiers.add(Modifier.toString(field.getModifiers()));
		}

		Method[] methods = objClass.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			if (isGetter(methods[i]))
				getters.add(methods[i]);
			else if (isSetter(methods[i]))
				setters.add(methods[i]);

		}

	}

	public static boolean isGetter(Method method) {
		if (!method.getName().startsWith("get"))
			return false;
		if (void.class.equals(method.getReturnType()))
			return false;
		if (method.getParameterTypes().length != 0)
			return false;
		if (!Modifier.toString(method.getModifiers()).equals("public"))
			return false;

		return true;
	}

	public static boolean isSetter(Method method) {
		if (!method.getName().startsWith("set"))
			return false;
		if (method.getParameterTypes().length != 1)
			return false;
		return true;
	}

	public List<String> getModifiers() {
		return modifiers;
	}

	public void setModifiers(List<String> modifiers) {
		this.modifiers = modifiers;
	}

	public List<String> getFieldTypes() {
		return fieldTypes;
	}

	public void setFieldTypes(List<String> fieldTypes) {
		this.fieldTypes = fieldTypes;
	}

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public List<Method> getGetters() {
		return getters;
	}

	public void setGetters(List<Method> getters) {
		this.getters = getters;
	}

	public List<Method> getSetters() {
		return setters;
	}

	public void setSetters(List<Method> setters) {
		this.setters = setters;
	}
	
	
}

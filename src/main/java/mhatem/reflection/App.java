package mhatem.reflection;

import java.lang.reflect.Method;
import java.util.List;

import mhatem.reflection.core.Handle;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Handle handle = new Handle();
		handle.handleClass(Example.class);
		
		List<String> modifiers = handle.getModifiers();
		List<String> fieldTypes = handle.getFieldTypes();
		List<String> fields = handle.getFields(); 
		List<Method> getters = handle.getGetters();
		List<Method> setters = handle.getSetters();

		for(int i = 0 ; i < modifiers.size() ; i++){
			System.out.println(modifiers.get(i) + " " +fieldTypes.get(i) + " " + fields.get(i));
			System.out.println(getters.get(i) + "   " + setters.get(i));
		}
		
	}
}

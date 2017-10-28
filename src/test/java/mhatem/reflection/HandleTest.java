package mhatem.reflection;


import org.junit.Assert;
import org.junit.Test;

import mhatem.reflection.core.Handle;

public class HandleTest{
	
	@Test
	public void inspectTest(){
		Handle handle = new Handle();
		handle.handleClass(Example.class);
		
		Assert.assertEquals(handle.getFields().size(), 3);
		Assert.assertEquals(handle.getFieldTypes().size(), 3);
		Assert.assertEquals(handle.getGetters().size(), 3);
		Assert.assertEquals(handle.getSetters().size(), 3);
	}

}

import java.lang.reflect.Field;

public class Tester {

	public static void main(String[] args) throws Exception 
	{
		// GET THE CLASS
		Class c = Class.forName("MySecondObject");

		System.out.println(c);
		
		// MAKE INSTANCE
		Object obj = c.newInstance();
		
		
		// SEE WHATS INSIDE
		Field[] flist = c.getDeclaredFields();
		for (Field f : flist)
		{
			System.out.println(f.getName());
		}
		
		// GET WHAT YOU NEED TO MODIFY
		Field f = c.getDeclaredField("age");
		
		System.out.println(obj);
		
		// FORCE ACCESS
		f.setAccessible(true);
		
		String value = "10";
		
		// DETERMINING TYPE
		if (f.getType() == String.class)
		{
			// DO YOUR THING
			f.set(obj, value);
		}
		else if (f.getType() == Integer.TYPE)  // Integer vs int
		{
			f.set(obj, Integer.parseInt(value));
		}
		else if (f.getType() == Long.TYPE)  // Long vs long
		{
			f.set(obj, Long.parseLong(value));
		}
		
		
		
		
		System.out.println(obj);
		
	}

}

package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionRunner {

	public static void main(String[] args) {

		new ReflectionRunner().runner();

	}

	private void runner() {

		ClassToReflect ctr = new ClassToReflect();
		Class<?> ctrClass = ctr.getClass();

		for (Constructor<?> c : ctrClass.getConstructors()) {

			System.out.println(c);
		}

		for (Method m : ctrClass.getMethods()) {

			// Only those methods in the declared class, not Object
			if (m.getDeclaringClass().equals(ctr.getClass())) {
				System.out.println(String.format("Method '%s' returns %s", m.getName(), m.getReturnType()));
			}
		}

		for (Field f : ctrClass.getDeclaredFields()) {

			System.out.println(String.format("Field '%s' is of type %s", f.getName(), f.getType()));
		}
	}
}

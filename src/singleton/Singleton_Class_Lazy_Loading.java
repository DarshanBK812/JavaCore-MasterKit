package singleton;

public class Singleton_Class_Lazy_Loading {

	// Lazy loading : The refence will be declared by private static volatile
	// keywords
	// Volatile : Dont let multiple core access over a data ;
	private static volatile Singleton_Class_Lazy_Loading class_Lazy_Loading_object = null;

	private Singleton_Class_Lazy_Loading() {
		System.out.println("singleton obect created by lazy loading");
	}

	public static Singleton_Class_Lazy_Loading createObject() {
		if (class_Lazy_Loading_object == null) {
			class_Lazy_Loading_object = new Singleton_Class_Lazy_Loading();
		}
		return class_Lazy_Loading_object;
	}

	public static void main(String args[]) {

		Singleton_Class_Lazy_Loading object1 = createObject();
		Singleton_Class_Lazy_Loading object2 = createObject();
		System.out.println(object1.equals(object2));

		// We are able to cerate one more object even though this is a singleton class
		// with private contstructor bcz java allows to access private memebers within
		// the class

		Singleton_Class_Lazy_Loading class_Lazy_Loading = new Singleton_Class_Lazy_Loading();
		System.out.println(object1.equals(class_Lazy_Loading));

		// What if multiple thread try to access the object ref and able to create a 2
		// therads so overcome that do synchronization

	}

}

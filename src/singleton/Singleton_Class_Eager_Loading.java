package singleton;

//To create a singleton class
//1.constructor should be private
//2.create a object and give reference to a variable which is class type and should be declred by private final static 
//3.create a static method with class return type and return variable or refernce which is holding a object of the class
//*Eager loading : Bcz of static the object will be created during class loading process even though we are not creating object the object will be created 

public class Singleton_Class_Eager_Loading {

	// The object will be created during the class loading bcz of static we dont
	// need this
	private final static Singleton_Class_Eager_Loading singletonObj = new Singleton_Class_Eager_Loading();

	private Singleton_Class_Eager_Loading() {
		System.out.println("Singleton class obj created");
	}

	public static Singleton_Class_Eager_Loading createObj() {
		return singletonObj;
	}

	public static void main(String[] args) throws Throwable {

		Singleton_Class_Eager_Loading class1 = createObj();
		Singleton_Class_Eager_Loading class2 = createObj();

		System.out.println(class1.equals(class2));

	}

}

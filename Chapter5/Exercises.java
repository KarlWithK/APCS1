/* 5.1:
 * Java passes all parameters to a method by the current value of the actual parameter and is copied into the formal parameter. For an object, however, it is passing a reference to the object instead of an actual copy. The formal parameter and the actual parameter become aliases of each other. In this way, any changes done the reference inside the method affect the actual object.
 *
 * 5.2:
 *  A static method does not operate int eh context of a particular object thus the cannot reference instance variables which exist as an instance of class. Instance variables are not independent of specific objects.
 *
 *  5.3:
 *
 *  I believe that you can have two interfaces that contain the same method signature and it should work like method overloading - so it depends on the inputs. If in the case the methods have the same inputs you will probably get a error.
 */

// 5.4
public interface Visible {
	public boolean makeVisible();
	public boolean makeInbisible();
}

/* A class can implement this interface in a class by writing "Implements Complexity"and then making certain tasks visible or invisible. */ 

import cs1.Keyboard;

//Filename: TriangleArea.java/ problem 2.10
//Name: Carlos "Karl" Hernandez
//Osis: 217493030
//
//Description: A program that calculates the area of a triangle given the side lengths of the triangle.
//
//Known Bugs: If you give measurements that cannot produce a triangle the result will be zero. Ex: 1, 2, 3
//
//Learned: I learned how to properly oragnize my program into parts. For example the top is assigning variables and then the next part is my work. These parts are seperated by a new line.


public class TriangleArea
{
	public static void main (String[] args)
	{
		double a, b, c, s, area;
		
		System.out.println ("Enter the side measures of a triangle one side at a time");

		a = Keyboard.readDouble();
		b = Keyboard.readDouble();
		c = Keyboard.readDouble();
		s = (a + b + c) / 2.0;
		area = s * (s - a) * (s - b) * (s - c);
		area = Math.sqrt(area);

		System.out.println("Given the measurements above, the area of the Triangle is: " + area);
	}
}

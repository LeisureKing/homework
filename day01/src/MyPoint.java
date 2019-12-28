public class MyPoint
{
   /**
	*@Comments:           主方法
	*@return              void
    */
   public static void main(String args[])
	{
		Point stary, start;      //Point对象的一个引用，对象名是start
		Point end = new Point(10, 10);        //Point对象的一个引用，对象名是end
		stary = end;//在堆中开辟地址，实例化对象，并把地址传给start
		System.out.println("start:x="+stary.getX()+"   y="+stary.getY());     //用标准化输出流输出start的成员变量x和y
		System.out.println("end:x="+end.getX()+"   y="+end.getY());           //用标准化输出流输出end的成员变量x和y

		stary.setX(20);       //为start的成员变量x赋值20
		stary.setY(20);       //为start的成员变量y赋值20
		System.out.println("start:x="+stary.getX()+"   y="+stary.getY());     //用标准化输出流输出start的成员变量x和y
		System.out.println("end:x="+end.getX()+"   y="+end.getY());           //用标准化输出流输出end的成员变量x和y
		
		start = new Point();
		start.setX(30);
		start.setY(30);
		System.out.println("start:x="+start.getX()+"   y="+start.getY());     //用标准化输出流输出start的成员变量x和y
		System.out.println("end:x="+end.getX()+"   y="+end.getY());           //用标准化输出流输出end的成员变量x和y

	}
}
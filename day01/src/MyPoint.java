public class MyPoint
{
   /**
	*@Comments:           ������
	*@return              void
    */
   public static void main(String args[])
	{
		Point stary, start;      //Point�����һ�����ã���������start
		Point end = new Point(10, 10);        //Point�����һ�����ã���������end
		stary = end;//�ڶ��п��ٵ�ַ��ʵ�������󣬲��ѵ�ַ����start
		System.out.println("start:x="+stary.getX()+"   y="+stary.getY());     //�ñ�׼����������start�ĳ�Ա����x��y
		System.out.println("end:x="+end.getX()+"   y="+end.getY());           //�ñ�׼����������end�ĳ�Ա����x��y

		stary.setX(20);       //Ϊstart�ĳ�Ա����x��ֵ20
		stary.setY(20);       //Ϊstart�ĳ�Ա����y��ֵ20
		System.out.println("start:x="+stary.getX()+"   y="+stary.getY());     //�ñ�׼����������start�ĳ�Ա����x��y
		System.out.println("end:x="+end.getX()+"   y="+end.getY());           //�ñ�׼����������end�ĳ�Ա����x��y
		
		start = new Point();
		start.setX(30);
		start.setY(30);
		System.out.println("start:x="+start.getX()+"   y="+start.getY());     //�ñ�׼����������start�ĳ�Ա����x��y
		System.out.println("end:x="+end.getX()+"   y="+end.getY());           //�ñ�׼����������end�ĳ�Ա����x��y

	}
}
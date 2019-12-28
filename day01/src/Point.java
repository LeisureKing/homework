public class Point
{
    private double x;//定义点的x坐标
    private double y;//定义点的y坐标

    /**
     * *定义无参的构造方法
     **/
    public Point(){ }

    public Point(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    /**
     * *设定点的x坐标
     * *@param _x 从调用方法中传入的double类型的数据
     * *@return 无
     * */
    public void setX(double _x){
        this.x = _x;
    }

    /**
     * *取得点的x坐标
     * *@return double类型的数据
     * */
    public double getX(){
        return this.x;
    }

    /**
     * *设定点的y坐标
     * *@param _y 从调用方法中传入的double类型的数据
     * *@return 无
     * */
    public void setY(double _y){ this.y = _y; }

    /**
     * *取得点的y坐标
     * *@param
     * *@return double类型的数据
     * */
    public double getY(){
    return this.y;
}

}
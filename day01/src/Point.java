public class Point
{
    private double x;//������x����
    private double y;//������y����

    /**
     * *�����޲εĹ��췽��
     **/
    public Point(){ }

    public Point(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    /**
     * *�趨���x����
     * *@param _x �ӵ��÷����д����double���͵�����
     * *@return ��
     * */
    public void setX(double _x){
        this.x = _x;
    }

    /**
     * *ȡ�õ��x����
     * *@return double���͵�����
     * */
    public double getX(){
        return this.x;
    }

    /**
     * *�趨���y����
     * *@param _y �ӵ��÷����д����double���͵�����
     * *@return ��
     * */
    public void setY(double _y){ this.y = _y; }

    /**
     * *ȡ�õ��y����
     * *@param
     * *@return double���͵�����
     * */
    public double getY(){
    return this.y;
}

}
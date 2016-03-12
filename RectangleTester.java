package myPackage;
//�D�{��
public class RectangleTester
{
	
	public static void main(String[] args)
	{
		//���V�ϥΪ̰ݦn
		System.out.println("Hello, User!");
		//���Ĥ@�ӯx��
		Rectangle R1 = new Rectangle(9,8,7,6);
		//print�x�Ϊ��ʽ�
		R1.tostring();
		//���ĤG�ӯx��
		Rectangle R2 = new Rectangle(5,4,3,2);
		//print�x�Ϊ��ʽ�
		R2.tostring();
		//��X����
		System.out.println();
		//End of Output�L�X�r��
		System.out.println("End of Output");
	}
}
//�ŧi�x��class
class Rectangle
{
	double height, width, Y, X;
	//constructor
	Rectangle()
	{}
	//���Ѽƪ�constructor
	Rectangle(double x, double y, double w, double h)
	{
		this.height = getHeight(h);
		this.width = getWidth(w);
		this.Y = y;
		this.X = x;
	}
	//��X�x�Ωʽ誺method
	public void tostring()
	{
		System.out.println();
		System.out.print("java.Rectangle[x=");
		System.out.print(X);
		System.out.print(",y=");
		System.out.print(Y);
		System.out.print(",width=");
		System.out.print(width);
		System.out.print(",height=");
		System.out.print(height);
		System.out.println("]");
		System.out.print("Area=");
		System.out.println(width*height);
		System.out.print("Perimeter=");
		System.out.println((width+height)*2);
		//��X�x�Ϊ��ʽ�
	}
	//���o�e��method
	public double  getWidth(double w)
	{
		return w;
	}
	//���o����method
	public double  getHeight(double h)
	{
		return h;
	}
}
package myPackage;
//主程式
public class RectangleTester
{
	
	public static void main(String[] args)
	{
		//先向使用者問好
		System.out.println("Hello, User!");
		//做第一個矩形
		Rectangle R1 = new Rectangle(9,8,7,6);
		//print矩形的性質
		R1.tostring();
		//做第二個矩形
		Rectangle R2 = new Rectangle(5,4,3,2);
		//print矩形的性質
		R2.tostring();
		//輸出換行
		System.out.println();
		//End of Output印出字串
		System.out.println("End of Output");
	}
}
//宣告矩形class
class Rectangle
{
	double height, width, Y, X;
	//constructor
	Rectangle()
	{}
	//有參數的constructor
	Rectangle(double x, double y, double w, double h)
	{
		this.height = getHeight(h);
		this.width = getWidth(w);
		this.Y = y;
		this.X = x;
	}
	//輸出矩形性質的method
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
		//輸出矩形的性質
	}
	//取得寬的method
	public double  getWidth(double w)
	{
		return w;
	}
	//取得高的method
	public double  getHeight(double h)
	{
		return h;
	}
}
/*
 * [A]96
 * [TA's advise]
 * 1.下次請依照老師提供的properties進行程式撰寫.
 * 2.Object本身有提供一個public String toString(), 本次作業目的希望你們可以透過overridding的方式進行多載, 你所提交的作業為build new method, 此部分酌量扣2分.
 * 3.getHeight()與getWidth()是個沒有作用的method, 你的寫法是讓他收了一個double值, 但什麼都不作直接傳回去, 想想看如果是這樣的話那何必要開這個method呢? 酌量扣2分.
 * 4.以下有稍微修正你的程式碼提供給你參考, 如果有問題歡迎與我聯繫.
 * 5.OO的概念需要加強一下喔.
 * 6.關於字串如果有很多段要印出, 或許你可以考慮用StringBuffer()與他的method: append, 會使你之後maintain比較方便, 如果想知道更多歡迎來找我.
 * */

package myPackage;
//主程式
public class RectangleTester {

	public static void main(String[] args) {

		// haha, you're a funny guy for below code.
		// 先向使用者問好
		System.out.println("Hello, User!");
		// 做第一個矩形
		Rectangle R1 = new Rectangle(9, 8, 7, 6);
		// print矩形的性質

		// **toString修正(R2同)
		/*
		 * System.out.println(R1)
		 */

		R1.tostring();
		// 做第二個矩形
		Rectangle R2 = new Rectangle(5, 4, 3, 2);
		// print矩形的性質
		R2.tostring();
		// 輸出換行
		System.out.println();
		// End of Output印出字串
		System.out.println("End of Output");
	}
}

// 宣告矩形class
class Rectangle {
	double height, width, Y, X;

	// constructor
	Rectangle() {
	}

	// 有參數的constructor
	Rectangle(double x, double y, double w, double h) {
		this.height = getHeight(h);
		this.width = getWidth(w);
		this.Y = y;
		this.X = x;
	}

	
	//Overridding
	/*
	 * public String toString(){
	 * 	return "java.Rectangle[x="+X+",y="+Y+",width="+width+",height="+height+"]";
	 * }
	 * */
	
	// 輸出矩形性質的method
	public void tostring() {
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
		System.out.println(width * height);
		System.out.print("Perimeter=");
		System.out.println((width + height) * 2);
		// 輸出矩形的性質
	}

	//修正getHeight() method, getWidth()同.
		/*
		 * public double getHeight(){
		 * 	return this.h;
		 * }
		 * */
	//這樣的寫法是讓他取值, 有點像是C#中的set/get的get.
	
	// 取得寬的method
	public double getWidth(double w) {
		return w;
	}

	// 取得高的method
	public double getHeight(double h) {
		return h;
	}
}
/*
 * [A]96
 * [TA's advise]
 * 1.�U���Ш̷ӦѮv���Ѫ�properties�i��{�����g.
 * 2.Object���������Ѥ@��public String toString(), �����@�~�ت��Ʊ�A�̥i�H�z�Loverridding���覡�i��h��, �A�Ҵ��檺�@�~��build new method, �������u�q��2��.
 * 3.getHeight()�PgetWidth()�O�ӨS���@�Ϊ�method, �A���g�k�O���L���F�@��double��, �����򳣤��@�����Ǧ^�h, �Q�Q�ݦp�G�O�o�˪��ܨ��󥲭n�}�o��method�O? �u�q��2��.
 * 4.�H�U���y�L�ץ��A���{���X���ѵ��A�Ѧ�, �p�G�����D�w��P���pô.
 * 5.OO�������ݭn�[�j�@�U��.
 * 6.����r��p�G���ܦh�q�n�L�X, �γ\�A�i�H�Ҽ{��StringBuffer()�P�L��method: append, �|�ϧA����maintain�����K, �p�G�Q���D��h�w��ӧ��.
 * */

package myPackage;
//�D�{��
public class RectangleTester {

	public static void main(String[] args) {

		// haha, you're a funny guy for below code.
		// ���V�ϥΪ̰ݦn
		System.out.println("Hello, User!");
		// ���Ĥ@�ӯx��
		Rectangle R1 = new Rectangle(9, 8, 7, 6);
		// print�x�Ϊ��ʽ�

		// **toString�ץ�(R2�P)
		/*
		 * System.out.println(R1)
		 */

		R1.tostring();
		// ���ĤG�ӯx��
		Rectangle R2 = new Rectangle(5, 4, 3, 2);
		// print�x�Ϊ��ʽ�
		R2.tostring();
		// ��X����
		System.out.println();
		// End of Output�L�X�r��
		System.out.println("End of Output");
	}
}

// �ŧi�x��class
class Rectangle {
	double height, width, Y, X;

	// constructor
	Rectangle() {
	}

	// ���Ѽƪ�constructor
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
	
	// ��X�x�Ωʽ誺method
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
		// ��X�x�Ϊ��ʽ�
	}

	//�ץ�getHeight() method, getWidth()�P.
		/*
		 * public double getHeight(){
		 * 	return this.h;
		 * }
		 * */
	//�o�˪��g�k�O���L����, ���I���OC#����set/get��get.
	
	// ���o�e��method
	public double getWidth(double w) {
		return w;
	}

	// ���o����method
	public double getHeight(double h) {
		return h;
	}
}
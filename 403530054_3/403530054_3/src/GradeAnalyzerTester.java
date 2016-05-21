
/*
 * [A]87
 * [TA's Advise]
 * 1. 字串比對請使用equals, 因為字串本身在java裡面屬於一種物件, 你那樣寫的是比他們的Ram Address.
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		// 叫做GA的GradeAnalyzer
		GradeAnalyzer GA = new GradeAnalyzer();
		String input = "";

		// 這是個嚴重錯誤, 字串比對請使用equals, -5
		while (input != "Q" || input != "q") {
			input = JOptionPane.showInputDialog("請輸入成績，若需結束請輸入Q");
			if (input != "Q" || input != "q") {

				// 有使用者輸入的情況, 請務必寫例外處理, -2
				GA.addGrade(Double.parseDouble(input));
			} else if (input == "Q" || input == "q") {
				System.out.println("Hi");
				break;
			}
		}
		System.out.println("Hi");
		System.out.println(GA.tostring());

	}
}
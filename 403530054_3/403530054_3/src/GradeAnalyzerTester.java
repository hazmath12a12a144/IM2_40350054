
/*
 * [A]87
 * [TA's Advise]
 * 1. �r����Шϥ�equals, �]���r�ꥻ���bjava�̭��ݩ�@�ت���, �A���˼g���O��L�̪�Ram Address.
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		// �s��GA��GradeAnalyzer
		GradeAnalyzer GA = new GradeAnalyzer();
		String input = "";

		// �o�O���Y�����~, �r����Шϥ�equals, -5
		while (input != "Q" || input != "q") {
			input = JOptionPane.showInputDialog("�п�J���Z�A�Y�ݵ����п�JQ");
			if (input != "Q" || input != "q") {

				// ���ϥΪ̿�J�����p, �аȥ��g�ҥ~�B�z, -2
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
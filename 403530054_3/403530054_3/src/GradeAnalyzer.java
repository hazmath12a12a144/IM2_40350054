
public class GradeAnalyzer

{
	double sumofGrade = 0;
	double sumofSquareofGrade = 0;
	int howManyGrade = 0;
	// 8~9行:各級距的記數變數
	int countA1 = 0;
	int countA2 = 0;
	int countA3 = 0;
	int countB1 = 0;
	int countB2 = 0;
	int countB3 = 0;
	int countC1 = 0;
	int countC2 = 0;
	int countC3 = 0;
	int countD = 0;
	int countF = 0;

	boolean isValidGrade(double aGrade) {
		return (aGrade <= 110 && aGrade >= 0);
	}

	void addGrade(double aGrade) {
		// 建議是通過合法檢驗再去將輸入個數+1, 程序邏輯上的問題, -2
		howManyGrade++;
		if (isValidGrade(aGrade)) {
			sumofGrade += aGrade;
			// Math.pow(a,b)=>a^b, 兩個寫反了, -2.
			sumofSquareofGrade += Math.pow(2, aGrade);
			if (aGrade >= 90) {
				if (aGrade >= 98)
					countA1++;
				else if (aGrade >= 92)
					countA2++;
				else
					countA3++;
			} else if (aGrade >= 80) {
				if (aGrade >= 88)
					countB1++;
				else if (aGrade >= 82)
					countB2++;
				else
					countB3++;
			} else if (aGrade >= 70) {
				if (aGrade >= 78)
					countC1++;
				else if (aGrade >= 72)
					countC1++;
				else
					countC1++;
			} else {
				if (aGrade >= 60) // 這是D
					countD++;
				else // 這是F
					countF++;
			}
		} else {
			System.out.println("請輸入0~110之間的數字");
		}
		// 計算平均和標準差
	}

	// 這並不是overriding喔, 想想為什麼, 這次沒有要求所以就沒有扣分.
	String tostring() {
		return ("You entered " + howManyGrade
				+ "valid grades from 0 to 110.\nInvalid grades are ignored!\nThe average = " + sumofGrade / howManyGrade
				+ " with a standard deviation = "
				// SD的計算公式好奇怪, -2
				+ Math.sqrt(sumofSquareofGrade / (howManyGrade * howManyGrade) - Math.pow(sumofGrade / howManyGrade, 2))
				+ "\nThe grade distribution is:") + "A+ = \n" + countA1 + "A = \n" + countA2 + "A- = \n" + countA3
				+ "B+ = \n" + countB1 + "B = \n" + countB1 + "B- = \n" + countB1 + "C+ = \n" + countC1 + "C = \n"
				+ countC2 + "C- = \n" + countC3 + "D = \n" + countD + "F = \n" + countF;
	}

}

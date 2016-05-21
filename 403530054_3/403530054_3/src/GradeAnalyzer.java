
public class GradeAnalyzer

{
	double sumofGrade = 0;
	double sumofSquareofGrade = 0;
	int howManyGrade = 0;
	// 8~9��:�U�ŶZ���O���ܼ�
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
		// ��ĳ�O�q�L�X�k����A�h�N��J�Ӽ�+1, �{���޿�W�����D, -2
		howManyGrade++;
		if (isValidGrade(aGrade)) {
			sumofGrade += aGrade;
			// Math.pow(a,b)=>a^b, ��Ӽg�ϤF, -2.
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
				if (aGrade >= 60) // �o�OD
					countD++;
				else // �o�OF
					countF++;
			}
		} else {
			System.out.println("�п�J0~110�������Ʀr");
		}
		// �p�⥭���M�зǮt
	}

	// �o�ä��Ooverriding��, �Q�Q������, �o���S���n�D�ҥH�N�S������.
	String tostring() {
		return ("You entered " + howManyGrade
				+ "valid grades from 0 to 110.\nInvalid grades are ignored!\nThe average = " + sumofGrade / howManyGrade
				+ " with a standard deviation = "
				// SD���p�⤽���n�_��, -2
				+ Math.sqrt(sumofSquareofGrade / (howManyGrade * howManyGrade) - Math.pow(sumofGrade / howManyGrade, 2))
				+ "\nThe grade distribution is:") + "A+ = \n" + countA1 + "A = \n" + countA2 + "A- = \n" + countA3
				+ "B+ = \n" + countB1 + "B = \n" + countB1 + "B- = \n" + countB1 + "C+ = \n" + countC1 + "C = \n"
				+ countC2 + "C- = \n" + countC3 + "D = \n" + countD + "F = \n" + countF;
	}

}

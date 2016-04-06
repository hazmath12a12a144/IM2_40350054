package JavaHW;

public class Easter {

	private Easter() {
	}

	// 高斯演算法
	public static String calculateEaster(int aYear) {
		double year, month, day;
		double a, b, c, d, e;
		double k, p, q, m, n;
		year = aYear;
		a = year % 19;
		b = year % 4;
		c = year % 7;
		k = Math.floor(year / 100);
		p = Math.floor((13 + 8 * k) / 25);
		q = Math.floor(k / 4);
		m = (15 - p + k - q) % 30;
		n = (4 + k - q) % 7;
		d = (19 * a + m) % 30;
		e = (2 * b + 4 * c + 6 * d + n) % 7;
		// 判斷月分和日期
		if (d + e < 10) {
			month = 3;
			day = Math.floor(d + e + 22);
		} else {
			month = 4;
			day = Math.floor(d + e - 9);
		}
		// 高斯演算法中的兩個例外日期
		if (month == 4 && day == 26) {
			month = 4;
			day = 19;
		}
		if (month == 4 && day == 25 && d == 28 && e == 6 && a > 10) {
			month = 4;
			day = 18;
		}
		// 回傳題目要求的字串
		return ("In" + year + ", Easter Sunday is: month = " + month + " and day = " + day);
	}
}

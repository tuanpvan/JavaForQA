package javaforQA;

import java.util.ArrayList;

public class Lession06 {

	/*
	 * Tạo một class là MyNumber với các thuộc tính int[] Numbers;
	 * 
	 * Phương thức - MyNumber(int[] numbers) - Khởi tạo giá trị cho thuộc tính
	 * Numbers - GetMyNumber() - Trả ra những giá trị là số nguyên tố và không bị
	 * trùng trong mảng Numbers - GetTotal() - Trả ra tổng tất cả các giá trị số
	 * nguyên tố chẵn vừa tìm được. - GetLuckyNumber() - Tìm xem có số nguyên tố nào
	 * trong mảng Numbers có giá trị bằng tổng 02 số nt liền trước không?
	 */
	class MyNumber {
		public int[] Numbers;
		//Prime number
		private boolean IsPrime(int number) {
			boolean result = true;
			for (int i = 0; i < number; i++) {
				if (number % i == 0) {
					result = false;
					break;
				}
			}
			return result;
		}

		// khoi tao gia tri
		public MyNumber(int[] numbers) {
			this.Numbers = numbers;
		}

		// GetMyNumber - remove dup so Prime
		public ArrayList<Integer> GetMyNumber() {
			ArrayList<Integer> primeNumber = new ArrayList<Integer>();
			{
				// lap lan luot
				for (int i = 0; i < this.Numbers.length; i++) {
					boolean duppPrime = false;
					int number = this.Numbers[i];

					for (int j = 0; j < this.Numbers.length; j++) {
						int checkPrime = this.Numbers[i];
						if (number == checkPrime && i != j) {
							duppPrime = true;
							break;
						}
					}
					if (duppPrime == false) {
						primeNumber.add(number);
					}

				}
				return primeNumber;
			}
		}

		// GetTotal
		public void GetTotal(int a[], int number) {
			int sumPrime = 0;
			for (int i = 0; i < number; i++) {
				if (IsPrime(a[i]) == true) {
					sumPrime = sumPrime + a[i];
					sumPrime++;
				}
			}

		}

	}
}

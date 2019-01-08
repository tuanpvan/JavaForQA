package javaforQA;

import java.util.ArrayList;

import org.junit.Test;

/*
 * Viết class tên là MyNumber với các đạc điểm sau
 * - Thuộc tính
 * + int number - chứa số nhập vào từ constructor
 * - Phương thức
 * + MyNumber(int n) - Khởi tạo cho thuộc tính number;
 * + ArrayList Get_Sochan() - Trả ra danh sách tất cả các số chẵn nhỏ hơn number
   + ArrayList get_SoLe() - Trả ra danh sách tất cả các số lẻ nhỏ hơn nyumber
   + ArrayList get_SoTongHop() - Trả ra một danh sách gồm tổng các số chẵn lẻ ở 
   vị trí tương ứng, trong trường hợp khuyết 1 trong 2 số thì giữ nguyên số còn lại
 - Viết Test cho 03 methods này
 */
public class Lession05 {
	class myNumber {
		public int[] number;

		// khoi tao
		public myNumber(int[] n) {
			this.number = n;

		}
		// in danh sach cac so chan nho hon number
		/*
		 * public void PrintGet_SoChan() { for (int i = 0; i < number.length ; i++) {
		 * if(i % 2 == 0) { System.out.println(number[i]); } } }
		 */

		public ArrayList Get_SoChan() {
			ArrayList soChan = new ArrayList();
			for (int i = 0; i < number.length; i++) {
				if (i % 2 == 0) {
					soChan.add(number[i]);
				}
			}
			return soChan;

		}

		// in danh sach cac so le nho hon number
		/*
		 * public void Get_SoLe() { for (int j = 0; j <number.length; j++) { if (j % 2
		 * != 0) { System.out.println(number[j]); } } }
		 */
		public ArrayList Get_SoLe() {
			ArrayList soLe = new ArrayList();
			for (int j = 0; j < number.length; j++) {
				if (j % 2 != 0) {
					soLe.add(number[j]);
				}
			}
			return soLe;

		}

		// tinh tong vi tri tuong ung

		public double Get_SoTongHop() {
			int[] number;
			int soChan;
			int soLe;
			double tong = 0;
			for (int i = 0; i < number.length; i++) {
				tong = tong + number[soChan][soLe];
				return tong;
			}
		}
	}

	// Test get so chan

	@Test
	public void Test_Get_SoChan() {
		// Arrange
		int[] cacsoChan = { 1, 2, 3, 4, 5, 6, 7, 8 };
		myNumber myNum = new myNumber(cacsoChan);

		// Action
		ArrayList listchan = new ArrayList();

		for (int i = 0; i < listchan.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(listchan.get(i));
			}
		}

	}

	// Test get so le

	@Test
	public void Test_Get_SoLe() {
		// Arrange
		int[] cacsoLe = { 1, 2, 3, 4, 5, 6, 7, 8 };
		myNumber myNum = new myNumber(cacsoLe);

		// action
		ArrayList listle = new ArrayList();

		for (int j = 0; j < listle.size(); j++) {
			if (j % 2 != 0) {
				System.out.println(listle.get(j));
			}
		}
	}
}

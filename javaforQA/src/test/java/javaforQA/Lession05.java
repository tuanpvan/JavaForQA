package javaforQA;

import java.util.ArrayList;

import org.junit.Assert;
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
		//thuoc tinh 
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
			//cần lặp từ 0 đến number, mỗi lần lặp kiểm tra số tại ví trí lặp
			//nếu  chia hết cho 2 thì lưu lại 
			ArrayList soChan = new ArrayList(); //để lưu kq kiểm tra 
			for (int i = 0; i < number.length; i++) {
				if (i % 2 == 0) {
					soChan.add(number[i]);
				}
			}
			return soChan;

		}
		// Test get so chan

		@Test
		public void Test_Get_SoChan() {
			// Arrange
			int[] cacsoChan = {  0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10  };
			myNumber myNum = new myNumber(cacsoChan);

			// Action
			ArrayList listchan = myNum.Get_SoChan();

			//Assertion 
			Assert.assertEquals(5, listchan.size());
			Assert.assertEquals(2, listchan.get(2));
			Assert.assertEquals(8, listchan.get(listchan.size() - 1));

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
		// Test get so le

		@Test
		public void Test_Get_SoLe() {
			// Arrange
			int[] cacsoLe = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			myNumber myNum = new myNumber(cacsoLe);

			// action
			ArrayList listle = myNum.Get_SoLe();
			// Assertion
			Assert.assertEquals(5, listle.size());
			Assert.assertEquals(1, listle.get(0));
			Assert.assertEquals(9, listle.get(listle.size() - 1));
		}
		
		
		
		// tinh tong vi tri tuong ung
		
		public ArrayList Get_Sum() {
			//lay mang? chan~
			// lay mang? le?
			// them 0 vao mang ngan hon 
			// cong. cac phan tu tuong ung
			
			ArrayList sochan = this.Get_SoChan();
			ArrayList sole = this.Get_SoLe();
			
			//kiem tra neu so chan . size ma nho hon so le.size thi them 0 vao
			
			if (sochan.size() < sole.size()) {
				for (int i = sochan.size(); i < sole.size(); i++) {
					sochan.add(0);
					
				}
			}
			else {
				for (int i = sole.size(); i < sochan.size(); i++) {
					sole.add(0);
					
				}
			}
			
			//tinh tong
			ArrayList sum = new ArrayList();
			for (int i = 0; i < sole.size() ; i ++) {
				int tong = (int) sole.get(i) + (int) sochan.get(i);
				
				sum.add(tong);
			}
			return sum;
		}

		//Test
		
		
		
	}

	@Test
	public void Test_Sum() {
		// Arrange
		int[] cacsoLe = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		myNumber myNum = new myNumber(cacsoLe);

		// action
		ArrayList listsum = myNum.Get_Sum();
		// Assertion
		
		for (int i =0; i < listsum.size(); i++) {
			System.out.println(listsum.get(i));
		}
	}


}

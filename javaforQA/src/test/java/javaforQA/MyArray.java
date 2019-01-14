package javaforQA;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class MyArray {
	/*
	 * Viết class MyArray với các đặc điểm sau:
	 * -Properties:
	 *  + int[] Numbers - Lưu trữ một mảng các số nguyên 
	 * -Methods:
	 *  + MyArray(int[] numbers) - Khởi tạo mảng các số nguyên cho thuộc tính Numbers
	 *  + CountNumber(int x) - Đêm số lần xuất hiện phần tử x trong mảng Numbers
	 *  + RemoveDupplicateNumber() - Phương thức loại bỏ các phần tử trùng trong mảng Numbers
	 *	Viết class Test kiểm thử cho method CountNumber, RemoveDupplicateNumber
	 */
	
	//khoi tao mang, luu tru mot mang so nguyen
	public int[] Numbers;
	
	
	
	
	//method
	public MyArray(int[] numbers){
		this.Numbers = numbers;
	}
	
	//

	
	///CountNumber(int x) - Đêm số lần xuất hiện phần tử x trong mảng Numbers
	public int CountNumber(int x) {
		int count = 0;
		
		for ( int number:this.Numbers) {
			if (number==x) {
				count++;
			}
		}
		return count;

	}
	//RemoveDupplicateNumber() - Phương thức loại bỏ các phần tử trùng trong mảng Numbers
	
	public ArrayList<Integer> RemoveDupplicateNumber()
	{	
		//tao ra 1 mng luu cac phan tu khong bi trung
		ArrayList<Integer> arrMyNumber = new ArrayList<Integer>();
		// lan luot. lap. cac phan tu? trong mang
		
		for (int i = 0; i<this.Numbers.length; i++) {
			boolean isDupplicate = false;
			int number = this.Numbers[i];
			for (int j=0; j<this.Numbers.length; j ++) {
				int checkNumber = this.Numbers[j];
				if(number == checkNumber && i!=j) {
					isDupplicate = true;
					break;
				}
			}
			if (isDupplicate==false) {
				arrMyNumber.add(number);
			}
			
		}
		return arrMyNumber;
		
	}
	//Test
	@Test
	public void Check_RemoveDupplicateNumber() {
		//Arrange
		int[] Numbers = {1,2,3,4,5,6,7,5};
		MyArray myArr = new MyArray(Numbers);
		
		//action
		
		ArrayList<Integer> lstMyNumber = myArr.RemoveDupplicateNumber();
		
		//assert
		Assert.assertEquals(5,lstMyNumber.size());
	}
	

}

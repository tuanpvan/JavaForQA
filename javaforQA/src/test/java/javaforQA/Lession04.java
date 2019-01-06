package javaforQA;
/*
 * Viết class tên là MyTriangle với các đặc điểm sau
 * - Canh1, Canh2, Canh3 - Thuộc tính lưu trữ 03 cạnh của tam giác
 * - Phương thức:
 * + boolean IsTriangle() - Kiểm tra canh1, canh2, canh3 có phải là 03 cạnh 
 * của tam giác không?
 * + boolean IsIsoscelesTriangle() - Kiểm tra xem có phải là 03 cạnh của 
 * tam giác cân hay không?
 * + int GetCircuit() - Tính chu vi nếu là tam giác
 */


import org.junit.Test;

public class Lession04 {

	// kiem tra xem co phai la tam giac hay khong
	boolean IsTriangle(int canh1, int canh2, int canh3) {
		if (canh1 + canh2 > canh3 || canh1 + canh3 > canh2 || canh2 + canh3 > canh1)

			return true;
		else {
			return false;
		}

	}
	// kiem tra tam giac can

	boolean IsIsoscelesTriangle(int canh1, int canh2, int canh3) {
		if (canh1 == canh2 || canh1 == canh3 || canh2 == canh3)
			return true;
		else {
			return false;
		}
	}

	// tinh chu vi
	public boolean GetCircuit(int canh1, int canh2, int canh3) {
		int chuVi;
		if (canh1 + canh2 > canh3 || canh1 + canh3 > canh2 || canh2 + canh3 > canh1) {
			if (canh1 == canh2 || canh1 == canh3 || canh2 == canh3) {
				chuVi = canh1 + canh2 + canh3;

			} else {
				System.out.println("Khong co tam giac nao");
			}

		}
		return false;
	}


	
}

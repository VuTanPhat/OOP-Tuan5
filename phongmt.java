package phonghoc;
import java.util.Scanner;
public class phongmt extends phong{
	int maytinh;
	Scanner sc=new Scanner(System.in);
	public phongmt() {
		super();
	}
	public phongmt(int maytinh) {
		super();
		this.maytinh=maytinh;
	}
	int getMaytinh() {
		return maytinh;
	}
	void setMaytinh(int maytinh) {
		this.maytinh=maytinh;
	}
	@Override
	void nhap() {
		super.nhap();
		System.out.println("Nhap so may tinh: ");
		maytinh=sc.nextInt();
	}
	@Override
	public String tieuchuan() {
		if(getDt()/getMaytinh()>=15&&getDt()/getSobongden()<=10) {
			return "dat";
		}
		else {
			return "khong dat";
		}
	}
	@Override
	public String toString() {
		return super.toString()+"||so may tinh: "+getMaytinh();
	}
}

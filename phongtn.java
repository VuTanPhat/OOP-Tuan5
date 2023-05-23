package phonghoc;
import java.util.Scanner;
public class phongtn extends phong{
	String ttcn;
	int succhua;
	String bonrua;
	Scanner sc=new Scanner(System.in);
	public phongtn() {
		super();
	}
	public phongtn(String ttcn,int succhua,String bonrua) {
		super();
		this.ttcn=ttcn;
		this.succhua=succhua;
		this.bonrua=bonrua;
	}
	String getTtcn() {
		return ttcn;
	}
	void setTtcn(String ttcn) {
		this.ttcn=ttcn;
	}
	int getSuccchua() {
		return succhua;
	}
	void setSucchua(int succhua) {
		this.succhua=succhua;
	}
	String getBonrua() {
		return bonrua;
	}
	void setBonrua(String bonrua) {
		this.bonrua=bonrua;
	}
	@Override
	void nhap() {
		super.nhap();
		System.out.println("nhap thong tin chuyen nganh: ");
		ttcn=sc.nextLine();
		System.out.println("nhap suc chua: ");
		succhua=sc.nextInt();
		System.out.println("phong co bon rua khong(1.co/2.khong): ");
		chon=sc.nextInt();
		switch(chon) {
		case 1:
			bonrua="co";
			break;
		case 2:
			bonrua="khong";
			break;
		}
	}
	@Override
	public String tieuchuan() {
		if(chon==1&&getDt()/getSobongden()<=10) {
			return "dat";
		}
		else {
			return "khong dat";
		}
	}
	@Override
	public String toString() {
		return super.toString()+"||so bong den: "+getSobongden();
	}
}

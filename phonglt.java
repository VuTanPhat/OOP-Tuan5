package phonghoc;
import java.util.Scanner;
public class phonglt extends phong{
	String maychieu;
	Scanner sc=new Scanner(System.in);
	phonglt() {
		super();
	}
	phonglt(String maychieu) {
		super();
		this.maychieu=maychieu;
	}
	String getMaychieu() {
		return maychieu;
	}
	void setMaychieu(String maychieu) {
		this.maychieu=maychieu;
	}
	
	@Override
	void nhap() {
		super.nhap();
		System.out.println("Phong hoc co may chieu khong(1.co/2.khong):");
		chon=sc.nextInt();
		switch(chon) {
		case 1:
			maychieu="co";
			break;
		case 2:
			maychieu="khong";
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
		return super.toString()+"||maychieu: "+getMaychieu();
	}
}

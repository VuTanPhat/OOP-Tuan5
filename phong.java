package phonghoc;
import java.util.Scanner;
public class phong {
	String maphong;
	int sobongden;
	String daynha;
	float dt;
	int chon;
	public String tieuchuan() {
		return "";
	}
	public phong(String maphong,int sobongden,String daynha,float dt) {
		super();
		this.maphong=maphong;
		this.sobongden=sobongden;
		this.daynha=daynha;
		this.dt=dt;
	}
	public phong() {
		super();
	}
	String getMaphong() {
		return maphong;
	}
	void setMaphong(String maphong) {
		this.maphong=maphong;
	}
	int getSobongden() {
		return sobongden;
	}
	void setSobongden(int sobongden) {
		this.sobongden=sobongden;
	}
	String getDaynha() {
		return daynha;
	}
	void setDaynha(String daynha) {
		this.daynha=daynha;
	}
	float getDt() {
		return dt;
	}
	void setDt(float dt) {
		this.dt=dt;
	}
	
	void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ma phong: ");
		maphong=sc.nextLine();
		System.out.println("nhap so bong den: ");
		sobongden=sc.nextInt();
		System.out.println("nhap day nha: ");
		daynha=sc.nextLine();
		System.out.println("nhap dien tich: ");
		dt=sc.nextFloat();
	}
	@Override
	public String toString() {
		return "maphong: "+getMaphong()+"||sobongden: "+getSobongden()+"||daynha: "+getDaynha()+"||dientich: "+getDt()+"||tieu chuan: "+tieuchuan();
	}
}

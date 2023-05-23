package phonghoc;
import java.util.ArrayList;    
import java.util.Scanner;
public class list {
	ArrayList<phonglt>lt=new ArrayList();
	ArrayList<phongmt>mt=new ArrayList();
	ArrayList<phongtn>tn=new ArrayList();
	int plt,pmt,ptn;
	void list() {	
	}
	Scanner sc=new Scanner(System.in);
	public void them() {
	System.out.println("nhap so phong hoc li thuyet: ");
	plt=sc.nextInt();
	System.out.println("nhap so phong hoc may tinh: ");
	pmt=sc.nextInt();
	System.out.println("nhap so phong hoc thi nghiem: ");
	ptn=sc.nextInt();
	System.out.println("Nhập thông tin phong li thuyet");
	for(int i=0;i<plt;i++) {
			System.out.println("Nhập phong li thuyet lần thứ "+i);
			phonglt plt=new phonglt();
			plt.nhap();
			lt.add(plt);
			if(lt.get(i).maphong==lt.get(i-1).maphong) {
				System.out.println("da ton tai ma phong nay");
			}else {
				
			}
		}
	System.out.println("Nhập thông tin phong may tinh");
	for(int i=0;i<pmt;i++) {
			System.out.println("Nhập phong may tinh lần thứ "+i);
			phongmt pmt=new phongmt();
			pmt.nhap();
			mt.add(pmt);
		}
	System.out.println("Nhập thông tin phong thi nghiem");
	for(int i=0;i<ptn;i++) {
			System.out.println("Nhập phong thi nghiem lần thứ "+i);
			phongtn ptn=new phongtn();
			ptn.nhap();
			tn.add(ptn);
		}
	}
	public void xuat() {
		int chon;
		System.out.println("");
	}
}	

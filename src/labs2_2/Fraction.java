package labs2_2;
import java.util.Scanner;
public class Fraction {
    int tuSo;
    int mauSo;

    public Fraction() {
    }

    public int getTuSo() {
        return tuSo;
    }
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if(mauSo!=0)
            this.mauSo = mauSo;
        else
            this.mauSo = 1;
    }

    public void nhapPhanSo(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap 1 tu so:");
        setTuSo(nhap.nextInt());
        System.out.println("Nhap 1 mau so:");
        setMauSo(nhap.nextInt());
    }

    public void inPhanSo(){
        System.out.println("phan so:"+getTuSo()+"/"+getMauSo());
    }

    public void rutGon(){
        int min = Math.min(getTuSo(),getMauSo());
        int ucln =0;
        for (int i=1;i<=min;i++){
            if(getTuSo()%i==0&&getMauSo()%i==0)
                ucln =i;
        }
        setTuSo(getTuSo()/ucln);
        setMauSo(getMauSo()/ucln);
    }

    public void nghichDao(){
        if(getTuSo() !=0 ){
            int c = getTuSo();
            setTuSo(getMauSo());
            setMauSo(c);
            return;
        }
        System.out.println("khong nghich dao duoc");
    }

    public Fraction add(Fraction ft){
        int a = this.getTuSo()*ft.getMauSo()+ft.getTuSo()*this.getMauSo();
        int b = this.getMauSo()*ft.getMauSo();
        Fraction tong = new Fraction();
        tong.setTuSo(a);
        tong.setMauSo(b);
        return tong;
    }

    public Fraction sub(Fraction ft){
        int a = this.getTuSo()*ft.getMauSo()-ft.getTuSo()*this.getMauSo();
        int b = this.getMauSo()*ft.getMauSo();
        Fraction hieu = new Fraction();
        hieu.setTuSo(a);
        hieu.setMauSo(b);
        return hieu;
    }

    public Fraction mul(Fraction ft){
        int a = this.getTuSo()*ft.getTuSo();
        int b = this.getMauSo()*ft.getMauSo();
        Fraction tich = new Fraction();
        tich.setTuSo(a);
        tich.setMauSo(b);
        return tich;
    }

    public Fraction div(Fraction ft){
        int a = this.getTuSo()/ft.getTuSo();
        int b = this.getMauSo()/ft.getMauSo();
        Fraction thuong = new Fraction();
        thuong.setTuSo(a);
        thuong.setMauSo(b);
        return thuong;
    }
}

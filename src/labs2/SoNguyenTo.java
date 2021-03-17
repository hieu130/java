package labs2;

public class SoNguyenTo {public int a;

    public SoNguyenTo() {
        setA(2);
    }

    public boolean isSoNguyenTo(int x){
        if(x<2) return false;
        for(int i=2;i<=x/2;i++){
            if(x%i==0) return false;
        }
        return true;
    }

    public void timSoNguyenToTiepTheo(){
        for(int i=a+1;true;i++){
            if(isSoNguyenTo(i)) {
                setA(i);
                return;
            }
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(isSoNguyenTo(a))
            this.a = a;
        else
            System.out.println("Khong set");
    }
}

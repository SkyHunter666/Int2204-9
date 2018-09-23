public class PS {
    private int tuSo;
    private int mauSo;

    public PS() {
        this.tuSo = 1;
        this.mauSo = 1;
    }

    public PS(int tu, int mau) {
        this.tuSo = tu;
        this.mauSo = mau;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public PS congPhanSo(PS b){
        this.tuSo = this.tuSo*b.getMauSo() + this.mauSo*b.getTuSo();
        this.mauSo = this.mauSo*b.getMauSo();
        return this;
    }
    public PS truPhanSO(PS b){
        this.tuSo = this.tuSo*b.getMauSo() - this.mauSo*b.getTuSo();
        this.mauSo = this.mauSo*b.getMauSo();
        return this;
    }
    public PS nhanPhanSo(PS b){
        this.tuSo = this.tuSo*b.getTuSo();
        this.mauSo = this.mauSo*b.getMauSo();
        return this;
    }
    public PS chiaPhanSo (PS b){
        this.tuSo = this.tuSo*b.getMauSo();
        this.mauSo = this.mauSo*b.getTuSo();
        return this;
    }

    public boolean equals(PS b) {
        this.tuSo= b.getMauSo()*this.tuSo;
        b.setTuSo(b.getTuSo()*this.getMauSo());
        if (this.tuSo == b.getTuSo()){
            return true;
        } else {
            return false;
        }
    }
    public int UCLN(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b){
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    public void inPhanSo(){
        int c = UCLN(this.tuSo, this.mauSo);
        this.tuSo /= c;
        this.mauSo /= c;
        System.out.println(this.getTuSo() + "/" + this.getMauSo());
    }
    public static void main (String[] args){
        PS a = new PS(2, 6);
        PS b = new PS(12,36);
        PS c = new PS();
        c.congPhanSo(a);
        c.inPhanSo();
        c.truPhanSO(a);
        c.inPhanSo();
        c.nhanPhanSo(a);
        c.inPhanSo();
        c.chiaPhanSo(a);
        c.inPhanSo();
        if (a.equals(b)){
            System.out.println("bang nhau");
        } else {
            System.out.println("khong bang nhau");
        }
    }
}

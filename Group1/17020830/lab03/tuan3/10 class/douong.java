public class douong {
    private String name;
    private int gia;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    public void getInfodu(){
        System.out.println(this.name);
        System.out.println(this.gia);
    }
}

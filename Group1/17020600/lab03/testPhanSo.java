/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class testPhanSo {

    public static void main(String[] args) {
        PS p1 = new PS(1, 3);
        PS p2 = new PS(2, 3);

        PS tong = p1.cong2PS(p2);
        PS tru = p1.tru2PS(p2);
        PS nhan = p1.nhan2PS(p2);
        PS chia = p1.chia2PS(p2);

        tong.xuatPS();
        tru.xuatPS();
        nhan.xuatPS();
        chia.xuatPS();
        if(p1.equals(p2)){
            System.out.println("phan so 1 > phan so 2");
        }
        else
            System.out.println("phan so 1 < phan so 2");
    }
}

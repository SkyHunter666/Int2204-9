/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;

/**
 *
 * @author Tommmm^^
 */
public class CamCaoPhong extends HoaQua {
    String hanSuDung;
    public CamCaoPhong(String loai, String ngaySx , String xuatXu , int soLuong, String hanSuDung){
        super(loai, ngaySx, xuatXu, soLuong);
        this.hanSuDung = hanSuDung;
    }
    
}

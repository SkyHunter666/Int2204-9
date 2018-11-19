/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.ArrayList;



public class SortData<T extends Comparable> {

    private ArrayList<T> listData;

    public SortData() {
        listData = new ArrayList<>();
    }

    public void add(T t) {
        listData.add(t);
    }

    public T get(int i) {
        return listData.get(i);
    }

    public void sort(){
        for (int i=0;i<listData.size()-1;i++){
            for (int j=i+1;j<listData.size();j++){
                if(listData.get(i).compareTo(listData.get(j))>0){
                T temp1 = listData.get(i);
                T temp2 = listData.get(j);
                listData.set(j, temp1);
                listData.set(i, temp2);
            }
            }
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList listStudent = new ArrayList();
        try {
            FileReader fr = new FileReader("sinhvien.dat");
            BufferedReader br = new BufferedReader(fr);
            String s="";
            while((s=br.readLine())!=null){
                String[] a = s.split("\\$");
                Student st = new Student(a[0],a[1],a[2],a[3],a[4],a[5],Float.parseFloat(a[6]));
                listStudent.add(st);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        for (int i = 0; i <listStudent.size(); i++) {
            Student st =(Student)listStudent.get(i);
            st.Hienthi();
            
        }
        form4 f = new form4();
        f.setVisible(true);
        f.setData(listStudent);
    }
    
}

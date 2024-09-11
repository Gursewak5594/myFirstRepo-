/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author gurse
 */
public class TestStudent {
    public static void main(String[]args){
        Student [] s1 = new Student[5];
        for (int i=0; i<5; i++){
            s1[i]= new Student();
        }
        String [] names = {"abc","efg","ijk","lmn","opq"};
        for (int i=0; i<5; i++){
            s1[i].setNames(names[i]);
        }
        System.out.println("Names are:");
        for (int i=0; i<5; i++){
            System.out.println(s1[i].getNames());
        }
    }
}

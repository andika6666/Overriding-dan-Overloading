
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author MOKLET-1
 */
public class Overloading {
 public void segitiga(){
  int alas=5, tinggi=10;
  System.out.println("Luas segitiga 1 = "+(alas*tinggi)/2);
 }
 //Metod segitiga di overloading dengan 2 parameter (int x, int y)
 public void segitiga2(int x, int y){
  System.out.println("Luas segitiga 2 = "+(x*y)/2);
 }
 public static void main(String [] args){
  Overloading s3;
  s3 = new Overloading();
 //memanggil metod segitiga
 s3.segitiga();
 //memanggil metod segitiga2
 s3.segitiga2(15,8);
    }}
    
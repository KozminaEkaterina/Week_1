package zadanie4;

import java.util.Scanner;
public class Mobile {
    public static Scanner ob=new Scanner(System.in);
    public info info;
    public String mobile;
    public Mobile(){
        System.out.print("Введите модель телефона: ");
        setMobile(ob.next());
        info=new info();
    }
    public String getMobile(){
        return mobile;
    }
    public void setMobile(String mobile){
        this.mobile=mobile;
    }
    public class info{
        int pr,st,sq;
        public info(){
            System.out.print("Оперативнная память (Гб):");
            setPr(ob.nextInt());
            System.out.print("Встроенная память (ГБ):");
            setSt(ob.nextInt());
            System.out.print("Камера (Мп):");
            setSq(ob.nextInt());
        }
        public int getPr(){
            return pr;
        }
        public void setPr(int pr){
            this.pr=pr;
        }
        public int getSt(){
            return st;
        }
        public void setSt(int st){
            this.st=st;
        }
        public int getSq(){
            return sq;
        }
        public void setSq(int sq){
            this.sq=sq;
        }
        public void print(){
            System.out.print("Модель телефона " +getMobile()+ ". Характеристики: Оперативная память (Гб) - " +getPr()+ "; Встроенная память (Гб) - " +getSt()+ "; Камера (Мп) - " +getSq());
        }
    }
    static public void main(String[]args){
        Mobile ct=new Mobile();
        ct.info.print();
    }
}
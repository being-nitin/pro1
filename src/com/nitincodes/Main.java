package com.nitincodes;
// java program to put conditions after creating objects
class students{
    String name;

    void m1(){
        if(name==null){
            System.out.println("unknown");
        }
        else{
            System.out.println(name);
        }
    }
}
  public class Main{
    public static void main(String[] args) {
        students obj1 = new students();
        obj1.name = "Nitin";
        obj1.m1();
    }

}


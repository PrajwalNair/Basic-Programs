class Parent{
public void m1(){
System.out.println("hello");
}
}
class Child extends Parent{
public void m1(){
System.out.println("hi");
}
}
class Test{
public static void main(String[] args){
  Child C=new Child();
  Parent P=new Parent();
  Parent p1=new Child();
  C.m1(); //hi
  p1.m1();//hi
  P.m1();//hello
  
  }
  }
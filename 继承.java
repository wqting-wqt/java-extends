package 继承;
class vehicle04 {//定义父类
    String brand;
    int seats=0;
    vehicle04(){
        System.out.println("Vehicle construct");
    }
    void start(){
        System.out.println("Vehicle start");
    }
    void stop(){
        System.out.println("Vehicle stop");
    }
}
class car04 extends vehicle04 {//定义子类
    int seats;
    car04(int seats){
        this.seats=seats;
        System.out.println("Car construct");
    }
}
class bus04 extends vehicle04 {//定义子类
    bus04(){
        System.out.println("Bus construct");
    }
}

public class 继承 {
    public static void main(String[] args){
        vehicle04 V=new vehicle04();
        bus04 B=new bus04();
        car04 C=new car04(4);
        V.start();//父类调用自己的方法
        B.start();//子类调用继承的方法
        V.seats=45;
        System.out.println(V.seats);//输出父类成员变量的值
        System.out.println(C.seats);//输出子类成员变量的值
    }
}

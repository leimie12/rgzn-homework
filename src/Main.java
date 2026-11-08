import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

class Person{
    String name;
    int age;
    public Person(){
        System.out.println("Person()构造方法被调用");
    }
    public Person(String newName){
        name=newName;
        System.out.println("Person(String)构造方法被调用");
    }
    public Person(String newName, int newAge){
        this.name=newName;
        age=newAge;
        System.out.println("Student(String,int)构造方法被调用");

    }//【代码1】定义一个Person类构造方法，该方法接收一个字符串参数与一个
    //整型参数，在方法体中，把该字符串参数赋值给name属性，把整型
//参数赋值给age属性，并且显示" Student(String,int)
//构造方法被调用"
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person("张冬");//【代码2】创建Student类的一个对象p1，不传入参数
        Person p3 = new Person("李夏",28);//【代码3】创建Student类的一个对象p2，传入一个参数"张冬"
        //【代码4】创建Student类的一个对象p3，传入两个参数"李夏" 和28
    }
}
# Java
## 介面 Intrface 
* 可通過Intrface來描述一群具共通行為的情況(ex: 飛機與小鳥為不同性質的類別、飛行方式也不同，但都具會“飛”的行為，因此需要Intrface進行定義)

```java
interface 介面名稱{
   //介面方法
}
```

## 基本Java 程式語法
* 資料型態(int、String)、if...else、for loop、method

## Class 類別
* 定義物件的一種型態，沒有實體
  * 屬性
  * 方法 

## Java 三大特性
* 繼承(inherit)、封裝(encapsulate)、多型(polymorphism)
* 多型(polymorphism)

  多型 Polymorphism 是指生物學中一個生物或物種可以有不同的形式或階段。 
  
  在物件導向程式設計的概念中，利用父類別提供的方法呼叫，子類別可以有自己特有的行為。
  
  
```java
class Animal {
    void move() {
        System.out.println("move...move...");
    }
}
class Dog extends Animal {
    void move() {
        System.out.println("跑...跑...");
    }
}
class Bird extends Animal {
    void move() {
        System.out.println("飛...飛...");
    }
}
class Fish extends Animal {
    void move() {
        System.out.println("游...游...");
    }
}
```
有Animal類別，以及Dog、Bird、Fish各自繼承Animal。
那現在有4隻動物，是什麼動物不管，我就把牠們都當成動物就好。 我知道動物裡面有一個move()的方法，我讓每隻動物都使用這個move()的方法。
```java
class Test {
    public static void main(String[] args) {

        Animal a =new Animal();
        Animal b =new Dog();
        Animal c =new Bird();
        Animal d =new Fish();

        a.move();
        b.move();
        c.move();
        d.move();

    }// end of main(String[])
}// end of class Test
```
從上面的例子可以看出，我們只要管他是不是動物就好，不用管他的本質是什麼 ，就可以對他進行處理
```java
 void moveAnimal(Animal ani){
     ani.move();
 }
```
## Java 關鍵字
* public、private、static、final

## 常用的集合(Collections)
* List、Set、Map

## 例外處理
* Exception、try-catch、throws

## Spring Boot 框架


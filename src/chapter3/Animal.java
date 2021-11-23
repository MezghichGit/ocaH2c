package chapter3;

public class Animal extends Object{
 int age;
 
 @Override
 public boolean equals(Object obj) {
	 Animal temp = (Animal) obj;
     return (this.age == temp.age);
 }
}

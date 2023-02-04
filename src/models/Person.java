package models;

public class Person{
    private String name;
    private int age;
    //todo : 생성자 - 클래스 이름이 같은 이름의 생성자가 있고 오버로드의 생성자가 있다.
    // 모댈클래스 - 위의 Person 처럼 하나의 객체를 클래스처럼 만드는것 메인 메서드에서 사용 가능하다.

    public Person() {

    }

    public Person(String name, int age) {
        this.name =name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //todo 메서드가 많아지게 된다면 클래스도 많들어야 되고 클래스가 많아지면 패키지로 나눠야되는 경우가 생긴다.
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

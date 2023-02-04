import javax.xml.transform.Source;
import java.sql.SQLOutput;

import models.Character;
import models.Hero;
import models.Magician;
import models.Person;

public class Main {
    //todo : 위의 main과 아래 main은 다르다. 그래서 아래 main의 메모라는 위의 메모리와 다른 곳에 할당되며
    // 이것은 static 이 쓰여 있으면 구분이 된다고 할 수 있다.
    //todo : 메서드를 하나씩 추가 할 수 있따.
    public static void main(String[] args) {

        System.out.println(add(50,10));
        System.out.println(add(30,10,30));

        System.out.println(add(1,2,3,4,5));

        Person person = new Person();
        Person person2 = new Person("홍길동",10);

        System.out.println(person);
        System.out.println(person2);

//todo 상속의 메서드도 사용할 수 있다.
        Hero hero =new Hero("슈퍼맨");
        Hero hero2 = new Hero("배트맨");
        Hero.attack (hero2);

        Character character = new Hero ("슈퍼맨2");
        Magician magician = new Magician();
        Character magician2 = new Magician();
        ICharacter magician3 = new Magician();
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static int add(int x,int y,int z) {
        return x + y + z;
    }
    //todo:java에서 모든 매서드를 더해주는 식을 쓸 수도 있다. 아래 ... 은 숫자를 지정하지 않는 여러개의 숫자를 더할 수 있는 것이다.
    // numbers 는 값이 들어 올수도 있고 안들어올 수 도 있지만 배열로써 들어가게 된다. 배열을 통해서 하면 for 문을 통해서 하나씩 꺼낼수 있다.
    // numbers 의 개수 만큼 합개를 구하게 된다. 아래 식처럼 쓰면 위의 식처럼 하나하나 지정을 안해줘도 된다.
    public static int add(int ... numbers) {
        int sum =0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + i;
        }
        return sum;
    }
}


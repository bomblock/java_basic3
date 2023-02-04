package models;
//todo : 새로 클래스를 만들어주는데 전에 가지고 있던 값을 그대로 가지고 온다면 상속을 사용한다.
//todo 중간에 extends 를 쓰고 Person 을 써주면 기존에 Person 값을 사용가능하다.
public class Hero extends Character {
    //todo 생성자를 만들어 준다. suoer person의 생성자로 호출한다.
    public  Hero(String name) {
        setName(name);
    }
    private  boolean isFlying;

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }
    @Override
    public void attack(Hero hero) {
        System.out.println(hero.getName()+"은" + hero.getName()+ " 과 싸울을 했다.");
    }
}

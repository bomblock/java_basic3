package models;
//todo 모든 클래스가 메서드 값을 가지게 하려면 추상클래스를 적어준다. 클래스 앞에 abstract 룰 붙여주면 추상클래스 이며 아래
//todo 메서드에도 붙여주면 추상 메서드 이다. 전제조건은 내용이 없어야 하며 내용이 들어갈시 추상메서드가 아니다.



public abstract class Character extends Person {
    public abstract void attack(Hero hero);
}


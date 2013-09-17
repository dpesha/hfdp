package com.dipesh.hfdp.strategy;

public abstract class Duck {
		
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys");
	}
	
	public abstract void display();
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	
}

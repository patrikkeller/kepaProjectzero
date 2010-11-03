package ch.patrik.JMockOne;

public class Hello {
private IGreetingTime gt;

public void setGreetingTime(IGreetingTime gt){
	this.gt=gt;
}
public String sayHello(String name){
	String greeting = gt.getGreeting();
	return greeting+", "+name;
}

}

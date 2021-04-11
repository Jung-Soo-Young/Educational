package sec06.ch06;

public class InstanceExam2 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = d1;
		
		d1.name = "»Ç»ß";
		d2.name = "µ¹¼è";
		
		d1.bark();
		d2.bark();
	}
}

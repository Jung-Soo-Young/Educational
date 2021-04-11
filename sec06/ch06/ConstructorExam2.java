package sec06.ch06;

public class ConstructorExam2 {
	public static void main(String[] args) {
		Tv2 tv = new Tv2();
		tv.displayState();
		//일렉트로 50inch 100channel 50Volume
	}
}

class Tv2 {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	Tv2() {
		this("일렉트로", 50, 100, 50);
	}
	
	Tv2(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
		
	}
	
	// 기본 생성자
	// 생성자 vs 메소드
	// 이름은 클래스명이랑 같다.
	// 리턴타입이 없다.
	
	// 생성자는 객체 생성할 때만 사용할 수 있다.
	
	// 기본 생성자는 컴파일러가 생성자가 하나도 없을시 넣어준다.
	
	void volumeUp() {
		currentVolume++;
	}
	
	void displayVolume() {
		System.out.println("현재 볼륨 : " + currentVolume);
	}
	
	void displayState() {
		System.out.printf("%s %dinch %dchannel %dvolume\n", brand, inch, maxChannel, maxVolume);
	}
}

package sec06.ch06;

public class ConstructorExam2 {
	public static void main(String[] args) {
		Tv2 tv = new Tv2();
		tv.displayState();
		//�Ϸ�Ʈ�� 50inch 100channel 50Volume
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
		this("�Ϸ�Ʈ��", 50, 100, 50);
	}
	
	Tv2(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
		
	}
	
	// �⺻ ������
	// ������ vs �޼ҵ�
	// �̸��� Ŭ�������̶� ����.
	// ����Ÿ���� ����.
	
	// �����ڴ� ��ü ������ ���� ����� �� �ִ�.
	
	// �⺻ �����ڴ� �����Ϸ��� �����ڰ� �ϳ��� ������ �־��ش�.
	
	void volumeUp() {
		currentVolume++;
	}
	
	void displayVolume() {
		System.out.println("���� ���� : " + currentVolume);
	}
	
	void displayState() {
		System.out.printf("%s %dinch %dchannel %dvolume\n", brand, inch, maxChannel, maxVolume);
	}
}

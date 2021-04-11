package sec06.ch06;

public class ConstructorExam {
	// ������
	// ��ü���� ���� ��� �����ڸ� �̿��Ѵ�.
	// �����ڴ� ��ü�� ������� �� ������ ȣ���� �ؾ��Ѵ�.
	public static void main(String[] args) {
		Tv tv1 = new Tv(); 
		
		tv1.brand = "Samsung";
		tv1.inch = 100;
		tv1.maxChannel = 100;
		tv1.maxVolume = 100;
		tv1.displayState();
		//Saumsung 100inch 100channel 100volume
		
		Tv tv2 = new Tv("LG", 200, 150, 200);
		tv2.displayState();
		//LG 200inch 150channel 200volume
	}
}

class Tv {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	Tv() {
		
	}
	
	Tv(String brand, int inch, int maxChannel, int maxVolume) {
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


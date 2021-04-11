package Test;

public class Test17 {
	public static void main(String[] args) {
		Tv tv = new Tv();
		
		tv.brand = "Samsung";
		tv.inch = 150;
		tv.maxChannel = 100;
		tv.maxVolume = 50;
		tv.displayState();
		
		Tv tv2 = new Tv("LG", 150, 150, 70);
		tv2.displayState();
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
	
	void volumeUp() {
		currentVolume++;
	}
	
	void displayVolume() {
		System.out.println("ÇöÀç º¼·ýÀº : " + currentVolume);
	}
	
	void displayState() {
		System.out.printf("Brand : %s Inch : %d maxChannel : %d maxVolume : %d\n", brand, inch, maxChannel, maxVolume);
	}
	
}

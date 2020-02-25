
public class Television {

	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	
	private boolean powerOn = false;
	private int channel = 2;
	private int volume = 20;
	
	/**
	 * Television constructor
	 * @param brand - the television brand
	 * @param size - the size of the television screen
	 */
	public Television(String brand, int size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
	}
	
	public void setChannel(int station) {
		channel = station;
	}
	
	public void power() {
		powerOn = !powerOn;
	}
	
	public void increaseVolume() {
		volume++;
	}
	
	public void decreaseVolume() {
		if (volume > 0)
			volume--;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
}

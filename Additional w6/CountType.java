public class CountType {

	private int count;
	public CountType(int initialcount) {
		this.count=initialCount;
	}
 
	public void setCount(int newCount) {
		this.count=newCount;
	}

	public void increaseOne() {
		this.count+=1;
	}

	public void decreaseOne() {
		if ((this.count-=1)<0) {
			this.count-=1;
		}
	}

	public int getCount() {
		return this.count;
	}
    
	public void outputCount() {
		System.out.println(this.count);
	}
}
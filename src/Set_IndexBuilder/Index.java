package Set_IndexBuilder;

public class Index implements Comparable<Index> {
	private char ch;
	private int count;
	
	public Index(char ch, int count){
		this.ch = ch;
		this.count = count;
	}
	
	public void setCh(char ch) {
		this.ch = ch;
	}
	
	public char getCh() {
		return ch;
	}
	
	public void setCount(int count){
		this.count = count;
	}
	
	public int getCount(){
		return count;
	}
	
	@Override
	public int compareTo(Index i) {
		if ((int) ch < (int)i.getCh()) {
			return -1;
		} 
		else if ((int) ch == (int) i.getCh()) {
			return 0;
		} 
		else {
			return 1;
		}
	}

}

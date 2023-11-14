package genric;

public class pair<T,S> {
	private T first;
	private S second;
	public pair() {}
	pair(T first,S second){
		this.first=first;
		this.second=second;
	}
	
	void setFirst(T first) {
		this.first=first;
	}
	
	void setSecond(S second) {
		this.second=second;
	}
	
	T  getFirst() {
		return first;
	}
	
	S getSecond() {
		return second;
	}

}

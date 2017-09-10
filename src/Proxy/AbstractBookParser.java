package Proxy;

public abstract class AbstractBookParser {

	private String sBookName = null;

	public String getsBookName() {
		return sBookName;
	}

	public void setsBookName(String sBookName) {
		this.sBookName = sBookName;
	}

	public AbstractBookParser(String sBookName) {
		super();
		this.sBookName = sBookName;
	}
	
	public abstract int getNumOfVowels();
	public abstract int getNumOfPages();
}
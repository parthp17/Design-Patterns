package Proxy;

public class ProxyBookParser extends AbstractBookParser{

	private BookParser bookParser = null;
	public ProxyBookParser(String sBookName) {
		super(sBookName);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getNumOfVowels() {
		if(bookParser == null)
		{
			synchronized(this)
			{
				if(bookParser == null)
				{
					bookParser = new BookParser(this.getsBookName());
				}
			}
		}
		return bookParser.getNumOfVowels();
	}
	@Override
	public int getNumOfPages() {
		if(bookParser == null)
		{
			synchronized(this)
			{
				if(bookParser == null)
				{
					bookParser = new BookParser(this.getsBookName());
				}
			}
		}
		return bookParser.getNumOfPages();
	}
	
	

	
}

package Adapter;

public class SampleService {

	private IProvider provider;

	public SampleService(IProvider provider) {
		super();
		this.provider = provider;
	}
	
	public String getResource(String sUrl)
	{
		return this.provider.getResourceString(sUrl);
	}
	
}

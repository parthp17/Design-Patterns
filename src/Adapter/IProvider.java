package Adapter;

import java.net.MalformedURLException;
import java.net.URL;

public interface IProvider {

	public String getResourceString(String url);
}


class RESTProvider implements IProvider{

	private RESTEndpoint restEndPoint = new RESTEndpoint();
	
	@Override
	public String getResourceString(String sUrl) {
		
		URL uUrl;
		try {
			uUrl = new URL(sUrl);
			return this.restEndPoint.getRESTResource(uUrl.getHost(), uUrl.getPort(), uUrl.getPath(), uUrl.getQuery());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
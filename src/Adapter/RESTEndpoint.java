package Adapter;

public class RESTEndpoint {

	public String getRESTResource(String host, int port, String uri, String query) {
		if(host != null && !host.isEmpty() && port == 80 && uri.contains(".html")) return "200";
		else return "404";
	}

}

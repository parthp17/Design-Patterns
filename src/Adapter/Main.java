package Adapter;

public class Main {

	
	public static void main(String[] args) {
		
		SampleService restService = new SampleService(new RESTProvider());
		System.out.println(restService.getResource("http://example.com:80/docs/books/tutorial"
                + "/index.html?name=networking#DOWNLOADING"));
		
		System.out.println(restService.getResource("http://google.com"));
		
	}
}

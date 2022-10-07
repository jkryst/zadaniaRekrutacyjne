package zadanie3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.client.RestTemplate;


public class KanyeRest {
	private RestTemplate restTemplate;
	private String url = "https://api.kanye.rest/";
	public List<String> kanyeQuotes = new ArrayList<>();
	
	
	public KanyeRest(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public String getQuote() {
		
		KanyeQuote thequote = restTemplate.getForObject(url, KanyeQuote.class);
		String quote = thequote.getQuote();
		
		if(kanyeQuotes.size()==122) {
			return "Sorry, there aren't any new quotes";
		} else if(kanyeQuotes.contains(quote)) {
			return getQuote();
		} else {
			kanyeQuotes.add(quote);
			return "'"+quote+"'";
		}

	}

}

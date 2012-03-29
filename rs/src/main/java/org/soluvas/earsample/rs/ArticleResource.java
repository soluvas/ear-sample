package org.soluvas.earsample.rs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.soluvas.earsample.data.Article;

@Path("article")
public class ArticleResource {

	@GET @Produces(MediaType.APPLICATION_JSON)
	public List<Article> getIndex() {
		ArrayList<Article> articles = new ArrayList<Article>();
		articles.add(new Article("Launching AksiMata", "AksiMata : Ada apa di sana?",
				"Webapp yang keren dan oke punya.", "Hendy Irawan"));
		articles.add(new Article("SatukanCinta oye", "SatukanCinta : Dapatkan yang lu mau",
				"Makin bagus dan selalu mantab gan.", "Cinta Sejati"));
		return articles;
	}
}

package com.gfttraining;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TMDBClientTest {

	TMDBClient client;
	
	@BeforeEach
	public void initializeClient() {
		client = new TMDBClient();
	}


	@Test
	public void getMovie_isId550_Test() {
		Movie dbMovie = client.getMovie("550");
		
		assertThat(dbMovie.getId(), equalTo(getExampleMovie().getId()));
	}

	@Test
	public void getAllGenres_isFirstElementGenre_Test() {
		GenreList genres = client.getAllGenres();

		assertThat(genres.getClass().toString(), equalTo("class com.gfttraining.GenreList"));
	}
	
	
	private Movie getExampleMovie() {
		return new Movie(550, "en", "Fight Club", "A ticking-time-bomb "
				+ "insomniac and a slippery soap salesman channel primal male "
				+ "aggression into a shocking new form of therapy. Their concept "
				+ "catches on, with underground \"fight clubs\" forming in every town,"
				+ " until an eccentric gets in the way and ignites an out-of-control "
				+ "spiral toward oblivion.", 90.105, "1999-10-15", 
				"Fight Club", false, 8.431, 24709);
	}
}

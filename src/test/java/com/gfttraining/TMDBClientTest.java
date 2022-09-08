package com.gfttraining;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.equalTo;

import com.gfttraining.entities.Movie;
import com.gfttraining.wrappers.GenreList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TMDBClientTest {

	TMDBClient client;
	
	@BeforeEach
	public void initializeClient() {
		client = new TMDBClient();
	}

	
	
	private Movie getExampleMovie() {
		return new Movie(false, "/rr7E0NoGKxvbkb89eR1GwfoYjpA.jpg", 550, "en", "Fight Club", "A ticking-time-bomb "
				+ "insomniac and a slippery soap salesman channel primal male "
				+ "aggression into a shocking new form of therapy. Their concept "
				+ "catches on, with underground \"fight clubs\" forming in every town,"
				+ " until an eccentric gets in the way and ignites an out-of-control "
				+ "spiral toward oblivion.", 90.105, "/pB8BM7pdSp6B6Ih7QZ4DrQ3PmJK.jpg", "1999-10-15",
				"Fight Club", false, 8.431, 24709);
	}
}

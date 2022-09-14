package com.gfttraining;


import com.gfttraining.entities.Movie;
import com.gfttraining.services.MovieService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;


public class MovieControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Mock
	MovieService movieService;


	@BeforeEach
	public void initializeClient() {
		when(movieService.getById(anyInt(), any(UserDetails.class))).thenReturn(getExampleMovieWithoutUserInfo());
		when(movieService.getById(550, any(UserDetails.class))).thenReturn(getExampleMovieWithUserInfo());
	}



	@Test
	public void getMovieByIdNotInUserDatabase_Test(){


	}

	@Test
	public void getMovieById500InUserDatabase_Test(){

	}

	
	private Movie getExampleMovieWithoutUserInfo() {
		return new Movie(false, "/rr7E0NoGKxvbkb89eR1GwfoYjpA.jpg", 550, "en",
				"Fight Club", "A ticking-time-bomb "
				+ "insomniac and a slippery soap salesman channel primal male "
				+ "aggression into a shocking new form of therapy. Their concept "
				+ "catches on, with underground \"fight clubs\" forming in every town,"
				+ " until an eccentric gets in the way and ignites an out-of-control "
				+ "spiral toward oblivion.", 90.105, "/pB8BM7pdSp6B6Ih7QZ4DrQ3PmJK.jpg",
				"1999-10-15", "Fight Club", false, 8.431, 24709);
	}

	private Movie getExampleMovieWithUserInfo() {
		Movie exampleMovie = setUserInputData(getExampleMovieWithoutUserInfo());

		return exampleMovie;
	}

	private Movie setUserInputData(Movie movie){
		movie.setFavorite(true);
		movie.setPersonal_rating(9);
		movie.setNotes("Good movie");

		return movie;
	}
}

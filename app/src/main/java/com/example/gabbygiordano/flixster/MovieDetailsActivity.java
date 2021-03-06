package com.example.gabbygiordano.flixster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.gabbygiordano.flixster.models.MovieData;

public class MovieDetailsActivity extends AppCompatActivity {

    //the movie to display
    MovieData movie;

    //the view objects
    TextView tvTitle;
    TextView tvOverview;
    RatingBar rbVoteAverage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        //resolve the view objects
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvOverview = (TextView) findViewById(R.id.tvOverview);
        rbVoteAverage = (RatingBar) findViewById(R.id.rbVoteAverage);

//        Bundle bundle = getIntent().getParcelableExtra(MovieData.class.getSimpleName());
//        Parcelable parcelable = bundle.getParcelable(MovieData.class.getSimpleName());
//        movie = Parcels.unwrap(parcelable);

        //unwrap the movie passed in via intent, using its simple name as a key
        //movie = (MovieData) Parcels.unwrap(getIntent().getParcelableExtra(MovieData.class.getSimpleName()));
//        Log.d("MovieDetailsActivity", String.format("Showing details for '%s'", movie.getTitle()));

        //set the title and overview
//        tvTitle.setText(movie.getTitle());
//        tvOverview.setText(movie.getOverview());
//
//        //vote average is 0..10, convert to 0..5 by diving by 2
//        float voteAverage = movie.getVoteAverage().floatValue();
//        rbVoteAverage.setRating(voteAverage = voteAverage > 0 ? voteAverage / 2.0f : voteAverage);


    }
}

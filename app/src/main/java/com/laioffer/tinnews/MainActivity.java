package com.laioffer.tinnews;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
               //get the nav_view object
               BottomNavigationView navView = findViewById(R.id.nav_view);
               NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                            .findFragmentById(R.id.nav_host_fragment);
               navController = navHostFragment.getNavController();
               NavigationUI.setupWithNavController(navView, navController);
           //   NewsApi api = RetrofitClient.newInstance(this).create(NewsApi.class);

        //    NavigationUI.setupActionBarWithNavController(this, navController);
       /* NewsApi api = RetrofitClient.newInstance().create(NewsApi.class);
           api.getTopHeadlines("US").enqueue(new Callback<NewsResponse>() {
               //enqueue start another thread when done call back,
       @Override
       public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                          if (response.isSuccessful()) { //success
                                   Log.d("getTopHeadlines", response.body().toString());
                               } else { //404
                                   Log.d("getTopHeadlines", response.toString());
                               }
                       }
       @Override
      public void onFailure(Call<NewsResponse> call, Throwable t) {
                          Log.d("getTopHeadlines", t.toString());
                      }
   }); */

    }

   @Override
   public boolean onSupportNavigateUp() {
               return navController.navigateUp();
           }
}

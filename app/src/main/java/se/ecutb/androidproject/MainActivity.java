package se.ecutb.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myRecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes = new ArrayList<>();
        recipes.add(new Recipes("Cat", "Cats", "Boiled cat", "Boil for 10 hours", R.drawable.cat));

        myRecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);
        myAdapter = new RecyclerViewAdapter(this, recipes);
        myRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        myRecyclerView.setAdapter(myAdapter);
    }
}
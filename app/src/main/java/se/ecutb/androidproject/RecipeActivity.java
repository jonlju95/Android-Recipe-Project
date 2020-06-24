package se.ecutb.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    private TextView mRecipeName;
    private TextView mRecipeIngredient;
    private TextView mRecipeInstruction;
    private TextView mRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        mRecipeName = (TextView)findViewById(R.id.text_recipe);
        mRecipeIngredient = (TextView)findViewById(R.id.ingredient);
        mRecipeInstruction = (TextView)findViewById(R.id.instruction);
        mRecipe = (TextView)findViewById(R.id.recipe);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("RecipeName");
        String Ingredients = intent.getExtras().getString("RecipeIngredient");
        String Instruction = intent.getExtras().getString("RecipeInstruction");
        String Recipe = intent.getExtras().getString("Recipe");

        mRecipeName.setText(Title);
        mRecipeIngredient.setText(Ingredients);
        mRecipeInstruction.setText(Instruction);
        mRecipe.setText(Recipe);
    }
}
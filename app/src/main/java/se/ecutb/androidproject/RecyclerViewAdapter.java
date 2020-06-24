package se.ecutb.androidproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {
    private Context mContext;
    private List<Recipes> recipes;

    public RecyclerViewAdapter(Context mContext, List<Recipes> recipes) {
        this.mContext = mContext;
        this.recipes = recipes;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_recipe, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, final int position) {
        holder.recipeName.setText(recipes.get(position).getRecipeName());
        holder.img_recipe.setImageResource(recipes.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, RecipeActivity.class);
                intent.putExtra("Name", recipes.get(position).getRecipeName());
                intent.putExtra("Ingredients", recipes.get(position).getRecipeIngredient());
                intent.putExtra("Instruction", recipes.get(position).getRecipeInstruction());
                intent.putExtra("Recipe", recipes.get(position).getRecipe());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView recipeName;
        CardView cardView;
        ImageView img_recipe;
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            recipeName = (TextView)itemView.findViewById(R.id.recipe_name);
            img_recipe = (ImageView)itemView.findViewById(R.id.recipe_img);
            cardView = (CardView)itemView.findViewById(R.id.cardView_id);
        }
    }
}

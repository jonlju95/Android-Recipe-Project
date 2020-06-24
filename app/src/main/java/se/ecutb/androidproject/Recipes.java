package se.ecutb.androidproject;

public class Recipes {
    private String RecipeName;
    private String RecipeIngredient;
    private String RecipeInstruction;
    private String Recipe;
    private int Thumbnail;

    public Recipes(String recipeName, String recipeIngredient, String recipeInstruction, String recipe, int thumbnail) {
        RecipeName = recipeName;
        RecipeIngredient = recipeIngredient;
        RecipeInstruction = recipeInstruction;
        Recipe = recipe;
        Thumbnail = thumbnail;
    }

    public String getRecipeName() {
        return RecipeName;
    }

    public void setRecipeName(String recipeName) {
        RecipeName = recipeName;
    }

    public String getRecipeIngredient() {
        return RecipeIngredient;
    }

    public void setRecipeIngredient(String recipeIngredient) {
        RecipeIngredient = recipeIngredient;
    }

    public String getRecipeInstruction() {
        return RecipeInstruction;
    }

    public void setRecipeInstruction(String recipeInstruction) {
        RecipeInstruction = recipeInstruction;
    }

    public String getRecipe() {
        return Recipe;
    }

    public void setRecipe(String recipe) {
        Recipe = recipe;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
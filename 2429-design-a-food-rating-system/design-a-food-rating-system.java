class FoodRatings {
    // Maps food name to its current rating
    HashMap<String, Integer> foodRating = new HashMap<>();
    
    // Maps food name to its cuisine type
    HashMap<String, String> foodCuisine = new HashMap<>();
    
    // Complex nested structure to efficiently find highest rated food by cuisine
    // Outer HashMap: cuisine -> TreeMap of ratings for that cuisine
    // TreeMap: rating -> TreeSet of foods with that rating
    // TreeMap keeps ratings sorted (ascending order)
    // TreeSet keeps food names sorted alphabetically for tie-breaking
    HashMap<String, TreeMap<Integer, TreeSet<String>>> cuisineRatingMap = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        // Get the size of input arrays (all arrays have same length)
        int size = foods.length;
        
        // Process each food item
        for(int i = 0; i < size; i++) {
            // Extract current food's information
            String food = foods[i];
            String cuisine = cuisines[i];
            Integer rating = ratings[i];
            
            // Store basic mappings
            foodCuisine.put(food, cuisine);    // food -> cuisine mapping
            foodRating.put(food, rating);      // food -> rating mapping
            
            // Get or create the rating structure for this cuisine
            TreeMap<Integer, TreeSet<String>> cuisineRating;
            if(cuisineRatingMap.containsKey(cuisine)) {
                // Cuisine already exists, get its rating map
                cuisineRating = cuisineRatingMap.get(cuisine);
            } else {
                // New cuisine, create fresh rating map
                cuisineRating = new TreeMap<>();
            }
            
            // Get or create the food set for this specific rating
            TreeSet<String> foodSet;
            if(cuisineRating.containsKey(rating)) {
                // Rating already exists for this cuisine, get the food set
                foodSet = cuisineRating.get(rating);
            } else {
                // New rating for this cuisine, create fresh food set
                foodSet = new TreeSet<>();
            }
            
            // Add the current food to the appropriate set
            foodSet.add(food);
            
            // Update the rating map with the food set
            cuisineRating.put(rating, foodSet);
            
            // Update the main cuisine map with the rating structure
            cuisineRatingMap.put(cuisine, cuisineRating);
        }
    }

    public void changeRating(String food, int newRating) {
        // Get the food's current rating before changing it
        int prevFoodRating = foodRating.get(food);
        
        // Get the cuisine this food belongs to
        String cuisine = foodCuisine.get(food);
        
        // Get the rating structure for this cuisine
        TreeMap<Integer, TreeSet<String>> cuisineRating = cuisineRatingMap.get(cuisine);
        
        // Get the set of foods that currently have the old rating
        TreeSet<String> prevFoodSet = cuisineRating.get(prevFoodRating);
        
        // Remove this food from the old rating set
        prevFoodSet.remove(food);
        
        // Update the food's rating in our main mapping
        foodRating.put(food, newRating);
        
        // If no foods left with the old rating, remove that rating entry entirely
        if(prevFoodSet.isEmpty()) {
            cuisineRating.remove(prevFoodRating);
        }
        
        // Now add the food to the new rating set
        TreeSet<String> newFoodSet;
        if(cuisineRating.containsKey(newRating)){
            // New rating already exists, get the existing food set
            newFoodSet = cuisineRating.get(newRating);
        } else {
            // New rating doesn't exist, create a fresh food set
            newFoodSet = new TreeSet<>();
        }
        
        // Add the food to the new rating set
        newFoodSet.add(food);
        
        // Update the rating map with the new food set
        cuisineRating.put(newRating, newFoodSet);
    }

    public String highestRated(String cuisine) {
        // Get the rating structure for the requested cuisine
        TreeMap<Integer, TreeSet<String>> cuisineRating = cuisineRatingMap.get(cuisine);
        
        // Get the highest rating (TreeMap.lastKey() returns the maximum key)
        Integer rating = cuisineRating.lastKey();
        
        // Get all foods with the highest rating
        TreeSet<String> foods = cuisineRating.get(rating);
        
        // Get the lexicographically first food name (TreeSet.getFirst() returns smallest element)
        // This handles tie-breaking when multiple foods have the same highest rating
        String food = foods.getFirst();
        
        // Debug print (should probably be removed in production)
        System.out.println(food);
        
        // Return the highest rated food (lexicographically first if tied)
        return food;
    }
}
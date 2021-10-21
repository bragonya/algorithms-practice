package main.algorithms

import java.util.*
// Problem: https://leetcode.com/discuss/interview-question/1504849/Google-Onsite
class Recipies {

    data class Recipe(val name: String, val rawIngredients: List<String>, val intermediateIngredients: List<String>)


    fun solution(listOfRecipies: List<Recipe>, ingredients: List<String>): Array<String> {
        if(ingredients.isEmpty()) return emptyArray()
        val setOfIngredients = ingredients.toSet()
        val mapOfRecipies = listOfRecipies.associateBy { it.name }
        val visitedNodes = mutableMapOf<String, Boolean>() // Intermediate ingredient vs hasRawIngredients?
        val output = mutableListOf<String>()

        fun innerTracking(recipe: String): Boolean {
            // Check if this is a visited node
            if(visitedNodes[recipe] == true) return true
            val associatedRecipe = mapOfRecipies[recipe]!!

            // First verify raw ingredients
            for (raw in associatedRecipe.rawIngredients) {
                if(!setOfIngredients.contains(raw)){
                    visitedNodes[recipe] = false
                    return false
                }
            }

            // Secondly verify intermediate ingredients
            for (intermediate in associatedRecipe.intermediateIngredients){
                if(!innerTracking(intermediate)) {
                    visitedNodes[recipe] = false
                    return false
                }
            }
            visitedNodes[recipe] = true
            return true
        }

        for (recipe in listOfRecipies) {
            if (innerTracking(recipe.name))
                output.add(recipe.name)
        }
        return output.toTypedArray()
    }
}
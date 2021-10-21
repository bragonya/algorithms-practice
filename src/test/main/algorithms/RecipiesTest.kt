package main.algorithms

import org.junit.Test

import org.junit.Assert.*

class RecipiesTest {

    @Test
    fun solution() {

        assertArrayEquals(
            arrayOf(
                "BREAD",
                "HaM"
            ),
            Recipies().solution(
                listOf(
                    Recipies.Recipe(
                        "BREAD",
                        listOf("Flour", "Yield"),
                        emptyList()
                    ),
                    Recipies.Recipe(
                        "HaM",
                        listOf("Ham", "Cheese"),
                        listOf("BREAD")
                    ),
                    Recipies.Recipe(
                        "CAPRISSE",
                        listOf("Mozarella", "Tomatoes"),
                        emptyList()
                    )
                ),
                listOf(
                    "Flour", "Yield", "Cheese", "Ham"
                )
            )
        )
    }

    @Test
    fun testAllRawIngredients() {

        assertArrayEquals(
            arrayOf(
                "BREAD",
                "HaM",
                "CAPRISSE"
            ),
            Recipies().solution(
                listOf(
                    Recipies.Recipe(
                        "BREAD",
                        listOf("Flour", "Yield"),
                        emptyList()
                    ),
                    Recipies.Recipe(
                        "HaM",
                        listOf("Ham", "Cheese"),
                        listOf("BREAD")
                    ),
                    Recipies.Recipe(
                        "CAPRISSE",
                        listOf("Mozarella", "Tomatoes"),
                        emptyList()
                    )
                ),
                listOf(
                    "Flour", "Yield", "Cheese", "Ham", "Tomatoes", "Mozarella"
                )
            )
        )
    }



    @Test
    fun testYoucantdoAnyRecipe() {

        assertArrayEquals(
            arrayOf(),
            Recipies().solution(
                listOf(
                    Recipies.Recipe(
                        "BREAD",
                        listOf("Flour", "Yield"),
                        emptyList()
                    ),
                    Recipies.Recipe(
                        "HaM",
                        listOf("Ham", "Cheese"),
                        listOf("BREAD")
                    ),
                    Recipies.Recipe(
                        "Caprisse",
                        listOf("Mozarella", "Tomatoes"),
                        emptyList()
                    )
                ),
                listOf(
                    "Flour", "Cheese", "Ham"
                )
            )
        )
    }

    @Test
    fun testWihtoutHaM() {

        assertArrayEquals(
            arrayOf(
                "BREAD"
            ),
            Recipies().solution(
                listOf(
                    Recipies.Recipe(
                        "BREAD",
                        listOf("Flour", "Yield"),
                        emptyList()
                    ),
                    Recipies.Recipe(
                        "HaM",
                        listOf("Ham", "Cheese"),
                        listOf("BREAD")
                    ),
                    Recipies.Recipe(
                        "CAPRISSE",
                        listOf("Mozarella", "Tomatoes"),
                        emptyList()
                    )
                ),
                listOf(
                    "Flour", "Yield", "Ham"
                )
            )
        )
    }


    @Test
    fun testThreeLevel() {

        assertArrayEquals(
            arrayOf(
                "PotatoesWithHaMAndCaprisse",
                "BREAD",
                "HaM",
                "CAPRISSE"
            ),
            Recipies().solution(
                listOf(
                    Recipies.Recipe(
                        "PotatoesWithHaMAndCaprisse",
                        listOf("Potatoes"),
                        listOf("HaM", "CAPRISSE")
                    ),
                    Recipies.Recipe(
                        "BREAD",
                        listOf("Flour", "Yield"),
                        emptyList()
                    ),
                    Recipies.Recipe(
                        "HaM",
                        listOf("Ham", "Cheese"),
                        listOf("BREAD")
                    ),
                    Recipies.Recipe(
                        "CAPRISSE",
                        listOf("Mozarella", "Tomatoes"),
                        emptyList()
                    )
                ),
                listOf(
                    "Flour", "Yield", "Cheese", "Ham", "Tomatoes", "Mozarella", "Potatoes"
                )
            )
        )
    }

    @Test
    fun testThreeLevelWithoutYield() {

        assertArrayEquals(
            arrayOf(
                "CAPRISSE"
            ),
            Recipies().solution(
                listOf(
                    Recipies.Recipe(
                        "PotatoesWithHaMAndCaprisse",
                        listOf("Potatoes"),
                        listOf("HaM", "CAPRISSE")
                    ),
                    Recipies.Recipe(
                        "BREAD",
                        listOf("Flour", "Yield"),
                        emptyList()
                    ),
                    Recipies.Recipe(
                        "HaM",
                        listOf("Ham", "Cheese"),
                        listOf("BREAD")
                    ),
                    Recipies.Recipe(
                        "CAPRISSE",
                        listOf("Mozarella", "Tomatoes"),
                        emptyList()
                    )
                ),
                listOf(
                    "Flour", "Cheese", "Ham", "Tomatoes", "Mozarella", "Potatoes"
                )
            )
        )
    }
}
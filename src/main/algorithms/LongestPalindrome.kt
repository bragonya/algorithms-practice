package main.algorithms

// problem: https://leetcode.com/problems/longest-palindromic-substring/
class LongestPalindrome {

    // region solution 1
    fun findLongestPalindrome(s: String): String{
        val wordSize = s.length
        for (window in wordSize downTo 1){
            var j = 0
            while (j + window < wordSize){
                val currentSubString = s.substring(j, j + window + 1)
                if (isPalindrome(currentSubString)) return currentSubString
                j++
            }

        }

        return s.first().toString()
    }

    private fun isPalindrome(word: String): Boolean {

        var inf = 0
        var sup = word.length -1
        while(inf < sup){
            if(word[inf] != word[sup]) return false
            inf++
            sup--
        }

        return true
    }

    // endregion

    // region solution 2
    fun longestPalindromeSolution2(s: String): String{
        val wordSize = s.length
        var maxPalindrome:String = s.firstOrNull()?.toString() ?: ""
        for (i in 0 until wordSize){
            var j = 1
            while (s.getOrNull(i - j) != null && s.getOrNull(i + j) != null
                && s.getOrNull(i - j) == s.getOrNull(i + j)
            ){
                val currentPalindrome = s.substring(i - j, i + j +1)
                maxPalindrome = if (currentPalindrome.length > maxPalindrome.length) currentPalindrome else maxPalindrome
                j++
            }


            if(s.getOrNull(i) != null && s.getOrNull(i+1) != null && s.getOrNull(i) == s.getOrNull(i+1)){
                var k = 1
                val sup = i+1
                val inf = i
                val tempMiddlePalindrome = s.substring(inf, sup + 1)
                maxPalindrome = if (tempMiddlePalindrome.length > maxPalindrome.length) tempMiddlePalindrome else maxPalindrome
                while (s.getOrNull(inf - k) != null && s.getOrNull(sup + k) != null
                    && s.getOrNull(inf - k) == s.getOrNull(sup + k)
                ){
                    val currentPalindrome = s.substring(inf - k, sup + k + 1)
                    maxPalindrome = if (currentPalindrome.length > maxPalindrome.length) currentPalindrome else maxPalindrome
                    k++
                }
            }

        }

        return maxPalindrome
    }
    // endregion
}
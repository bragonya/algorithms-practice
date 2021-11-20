package main.algorithms

import java.lang.StringBuilder

class DecimalToBinary {

    fun decimalToBinary(n: Int): String {
        val output = StringBuilder()

        var num = n
        while(num > 0){
            if(num % 2 != 0){
                output.insert(0,"1")
                num = (num - 1)/2
            }else{
                output.insert(0,"0")
                num = (num)/2
            }
        }
        return output.toString()
    }
}
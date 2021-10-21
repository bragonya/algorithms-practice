package main.andelachallenge

class CoursesPrerequisites {


  /*  Software Design
    Computer Networks
    Computer Architecture
    Data Structures
    Algorithms
    Foundations of Computer Science
    Operating Systems*/


    fun solution(courses: Array<Array<String>>): Array<String> {

        val output = mutableListOf<String>()
        val map = mutableMapOf<String, String>()
        for(i in courses.indices){
            map[courses[i][1]] = courses[i][0]
        }

        val preRequisites:List<String> = courses.map { pre_course ->

            pre_course[0]
        }

        val postRequisites:List<String> = courses.map { pre_course ->

            pre_course[1]
        }

        var finalNode: String? = null
        for (course in postRequisites){
            if (!preRequisites.contains(course)){
                finalNode = course
                break
            }
        }

        var currentNode: String? = finalNode

        while (currentNode != null) {
            output.add(currentNode)
            currentNode = map.getOrDefault(currentNode, null)
        }


        return output.reversed().toTypedArray()

    }

    fun solutionTopologicalSort(courses: Array<Array<String>>): Array<String> {

        val stack = mutableListOf<String>()
        val nextNodes = mutableMapOf<String, String>()
        val visitedNodes = mutableSetOf<String>()
        for(i in courses.indices){
            nextNodes[courses[i][1]] = courses[i][0]
        }

        fun innerTopologicalSort(course: String){
            if (visitedNodes.contains(course)) return

            visitedNodes.add(course)
            val nextCourse = nextNodes[course]
            if(nextCourse == null) {
                stack.add(course)
            }
            else{
                innerTopologicalSort(nextCourse)
                stack.add(course)
            }

        }
        for (course in courses) {
            innerTopologicalSort(course[1])
        }

        return stack.toTypedArray()

    }


}
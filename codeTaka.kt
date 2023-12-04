// https://school.programmers.co.kr/learn/courses/30/lessons/120807

class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        if (num1 == num2) {
            answer = 1
        } else {
            answer = -1
        }
        return answer
    }
}
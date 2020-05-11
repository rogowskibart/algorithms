class ArrayFunctions() {

    fun findSmallestElement(array: Array<Int>): Int {
        var smallestElement = array[0]
        for (element in array) {
            if (element < smallestElement) {
                smallestElement = element
            }
        }
        return smallestElement
    }

    fun findSecondSmallestElement(array: Array<Int>): Int {
        var smallestElementIndex = 0
        var secondSmallestElement: Int

        for (i in array.indices) {
            if (array[i] < array[smallestElementIndex]) {
                smallestElementIndex = i
            }
        }

        if (smallestElementIndex == (array.size - 1)) {
            secondSmallestElement = array[smallestElementIndex - 1]
        } else {
            secondSmallestElement = array[smallestElementIndex + 1]
        }

        for (i in array.indices) {
            if (i == smallestElementIndex) {
                continue
            } else if (array[i] < secondSmallestElement) {
                secondSmallestElement = array[i]
            }
        }

        return secondSmallestElement
    }
}
package sortingalgorithms

import java.util.*
import kotlin.collections.ArrayList
import kotlin.system.measureNanoTime


class SortingAlgorithms {

    fun standardSortArrayList(arrayList: ArrayList<Int>, time: (Long) -> Unit ): ArrayList<Int> {
        val newArrayList = arrayListOf<Int>()
        newArrayList.addAll(arrayList)
        val executionTime = measureNanoTime{
            newArrayList.sort()
        }
        time.invoke(executionTime)

        return newArrayList
    }

    fun standardSortLinkedList(arrayList: ArrayList<Int>, time: (Long) -> Unit ): LinkedList<Int> {
        val newLinkedList = LinkedList<Int>()
        newLinkedList.addAll(arrayList)
        val executionTime = measureNanoTime{
            newLinkedList.sort()
        }
        time.invoke(executionTime)

        return newLinkedList
    }

    fun standardSortIntArray(arrayList: ArrayList<Int>, time: (Long) -> Unit ): IntArray {
        val newIntArray = IntArray(arrayList.size)
        for (i in 0 until arrayList.size){
            newIntArray[i] = arrayList[i]
        }

        val executionTime = measureNanoTime{
            newIntArray.sort()
        }
        time.invoke(executionTime)

        return newIntArray
    }



    fun bubbleSortArrayList(arrayList: ArrayList<Int>, time: (Long) -> Unit ): ArrayList<Int> {

        val newArrayList = arrayListOf<Int>()
        newArrayList.addAll(arrayList)

        fun sort(){
            do {
                var repeat = false
                for (i in 1 until newArrayList.size) {
                    val indexRightNumber = i
                    val indexLeftNumber  = i - 1
                    if (newArrayList[indexLeftNumber] > newArrayList[indexRightNumber]) {
                        newArrayList.swap(indexLeftNumber, indexRightNumber)
                        repeat = true
                    }
                }
            } while (repeat)
        }

        val executionTime = measureNanoTime{
            sort()
        }
        time.invoke(executionTime)

        return newArrayList

    }

    fun bubbleSortLinkedList(arrayList: ArrayList<Int>, time: (Long) -> Unit ): LinkedList<Int> {

        val newLinkedList = LinkedList<Int>()
        newLinkedList.addAll(arrayList)
        fun sort(){
            do {
                var repeat = false
                for (i in 1 until newLinkedList.size) {
                    val indexRightNumber = i
                    val indexLeftNumber  = i - 1
                    if (newLinkedList[indexLeftNumber] > newLinkedList[indexRightNumber]) {
                        newLinkedList.swap(indexLeftNumber, indexRightNumber)
                        repeat = true
                    }
                }
            } while (repeat)
        }

        val executionTime = measureNanoTime{
            sort()
        }
        time.invoke(executionTime)

        return newLinkedList

    }

    fun bubbleSortIntArray(arrayList: ArrayList<Int>, time: (Long) -> Unit ): IntArray {

        val newIntArray = IntArray(arrayList.size)
        for (i in 0 until arrayList.size){
            newIntArray[i] = arrayList[i]
        }

        fun sort(){
            do {
                var repeat = false
                for (i in 1 until newIntArray.size) {
                    val indexRightNumber = i
                    val indexLeftNumber  = i - 1
                    if (newIntArray[indexLeftNumber] > newIntArray[indexRightNumber]) {
                        newIntArray.swap(indexLeftNumber, indexRightNumber)
                        repeat = true
                    }
                }
            } while (repeat)
        }

        val executionTime = measureNanoTime{
            sort()
        }
        time.invoke(executionTime)

        return newIntArray

    }



    fun shakerSortArrayList(arrayList: ArrayList<Int>, time: (Long) -> Unit ): ArrayList<Int> {
        val newArrayList = arrayListOf<Int>()
        newArrayList.addAll(arrayList)
        fun sort(){
            do {
                var repeat = false
                for (i in 1 until newArrayList.size) {
                    val indexRightNumber = i
                    val indexLeftNumber  = i - 1
                    if (newArrayList[indexLeftNumber] > newArrayList[indexRightNumber]) {
                        newArrayList.swap(indexLeftNumber, indexRightNumber)
                        repeat = true
                    }
                }
                if (!repeat) break
                repeat = false
                for (i in newArrayList.size - 3 downTo 0) {
                    val indexRightNumber = i + 1
                    val indexLeftNumber  = i
                    if (newArrayList[indexLeftNumber] > newArrayList[indexRightNumber]) {
                        newArrayList.swap(indexLeftNumber, indexRightNumber)
                        repeat = true
                    }
                }
            } while (repeat)
        }

        val executionTime = measureNanoTime{
            sort()
        }
        time.invoke(executionTime)

        return newArrayList
    }

    fun shakerSortLinkedList(arrayList: ArrayList<Int>, time: (Long) -> Unit ): LinkedList<Int> {
        val newLinkedList = LinkedList<Int>()
        newLinkedList.addAll(arrayList)

        fun sort(){
            do {
                var repeat = false
                for (i in 1 until newLinkedList.size) {
                    val indexRightNumber = i
                    val indexLeftNumber  = i - 1
                    if (newLinkedList[indexLeftNumber] > newLinkedList[indexRightNumber]) {
                        newLinkedList.swap(indexLeftNumber, indexRightNumber)
                        repeat = true
                    }
                }
                if (!repeat) break
                repeat = false
                for (i in newLinkedList.size - 3 downTo 0) {
                    val indexRightNumber = i + 1
                    val indexLeftNumber  = i
                    if (newLinkedList[indexLeftNumber] > newLinkedList[indexRightNumber]) {
                        newLinkedList.swap(indexLeftNumber, indexRightNumber)
                        repeat = true
                    }
                }
            } while (repeat)
        }

        val executionTime = measureNanoTime{
            sort()
        }
        time.invoke(executionTime)

        return newLinkedList
    }

    fun shakerSortIntArray(arrayList: ArrayList<Int>, time: (Long) -> Unit ): IntArray {
        val newIntArray = IntArray(arrayList.size)
        for (i in 0 until arrayList.size){
            newIntArray[i] = arrayList[i]
        }

        fun sort(){
            do {
                var repeat = false
                for (i in 1 until newIntArray.size) {
                    val indexRightNumber = i
                    val indexLeftNumber  = i - 1
                    if (newIntArray[indexLeftNumber] > newIntArray[indexRightNumber]) {
                        newIntArray.swap(indexLeftNumber, indexRightNumber)
                        repeat = true
                    }
                }
                if (!repeat) break
                repeat = false
                for (i in newIntArray.size - 3 downTo 0) {
                    val indexRightNumber = i + 1
                    val indexLeftNumber  = i
                    if (newIntArray[indexLeftNumber] > newIntArray[indexRightNumber]) {
                        newIntArray.swap(indexLeftNumber, indexRightNumber)
                        repeat = true
                    }
                }
            } while (repeat)
        }

        val executionTime = measureNanoTime{
            sort()
        }
        time.invoke(executionTime)

        return newIntArray
    }



    fun heapSortArrayList(arrayList: ArrayList<Int>, time: (Long) -> Unit ): ArrayList<Int> {
        val newArrayList = arrayListOf<Int>()
        newArrayList.addAll(arrayList)
        var countSortedNumbers = 0 // кол-во отсортированных чисел с конца
        val levelsWithNumbers = arrayListOf<ArrayList<Int>>()

        // создание уровней чисел, каждый массив это уровень на котором находятся числа
        // в данном случае в уровень, а то-есть в массив, будут помещаться индексы чисел
        // сами числа находятся в основном массиве newArrayList
        fun createLevels(){
            levelsWithNumbers.add(arrayListOf()) // создаем первый уровень чисел
            // первый уровень это вершина кучи - с одним числом

            var currentLevel = 1 // текущий уровень чисел
            var currentHeadNumber = 1 // количество чисел (индексов чисел) которые нужно поместить в текущий уровень

            for (i in 0 until newArrayList.size){ // проход по всему массиву

                if (currentHeadNumber <= 0){ // сначала проверка, если необходимое количество чисел(индексов чисел) помещены в текущий уровень
                    currentLevel++ // то устанавливается новый уровень
                    currentHeadNumber = 1 // устанавливается базовое значение
                    for (i in 2..currentLevel) currentHeadNumber *= 2 // рассчитывается количество чисел на новом уровне
                    levelsWithNumbers.add(arrayListOf()) // создается новый уровень (массив для хранения индексов)
                }

                if (currentHeadNumber > 0){ // если числа(индекс числа) не заполнены в текущем уровне(массив)
                    levelsWithNumbers[currentLevel - 1].add(i) // в текущий уровень(массив) добавляем число(индекс числа)
                    currentHeadNumber-- // уменьшаем количество чисел которые необходимо добавить в текущий уровень(массив)
                }

            }
        }
        // сортировка маленькой кучи (главного числа и двух дочерних)
        fun sortSmallHeap(indexHeadNumber: Int){
            val indexLeftChildrenNumber = indexHeadNumber * 2 + 1 // рассчитываем индекс в массиве левого дочернего числа
            val indexRightChildrenNumber = indexHeadNumber * 2 + 2 // рассчитываем индекс в массиве правого дочернего числа
            // узнаем, существует ли данное число в массиве и можно ли его сортировать или оно уже окончательно отсортировано
            val actualIndexLeft = indexLeftChildrenNumber <= (newArrayList.size - 1) - countSortedNumbers
            val actualIndexRight = indexRightChildrenNumber <= (newArrayList.size - 1) - countSortedNumbers

            // в случае если оба числа необходимо обработать
            fun allActual(){
                if (newArrayList[indexLeftChildrenNumber] > newArrayList[indexHeadNumber] && newArrayList[indexLeftChildrenNumber] >= newArrayList[indexRightChildrenNumber]){
                    newArrayList.swap(indexLeftChildrenNumber, indexHeadNumber)
                    sortSmallHeap(indexLeftChildrenNumber)
                }
                if (indexRightChildrenNumber <= (newArrayList.size - 1) - countSortedNumbers){
                    if (newArrayList[indexRightChildrenNumber] > newArrayList[indexHeadNumber] && newArrayList[indexRightChildrenNumber] >= newArrayList[indexLeftChildrenNumber]){
                        newArrayList.swap(indexRightChildrenNumber, indexHeadNumber)
                        sortSmallHeap(indexRightChildrenNumber)
                    }
                }
            }

            // в случае если правое дочернее число не существует или уже окончательно отсортировано
            fun onlyLeftActual(){
                if (newArrayList[indexLeftChildrenNumber] > newArrayList[indexHeadNumber]){
                    newArrayList.swap(indexLeftChildrenNumber, indexHeadNumber)
                    sortSmallHeap(indexLeftChildrenNumber)
                }
            }

            when {
                !actualIndexLeft && !actualIndexRight -> return
                actualIndexLeft && actualIndexRight -> allActual()
                actualIndexLeft && !actualIndexRight -> onlyLeftActual()
            }

        }
        // первая сортировка всей кучи (всего массива) - 1 этап
        fun sortMainHeap(){
            // проход по уровням начиная с предпоследнего и вверх
            // -1 пропускаем чтобы не выйти за пределы массива и еще -1 пропускаем самый нижний уровень
            for (i in levelsWithNumbers.size - 2 downTo 0){ // в i получаем индекс предпоследнего уровня чисел

                for (j in levelsWithNumbers[i].size - 1 downTo 0){ // проход по всем числам данного уровня начиная с конца
                    sortSmallHeap(levelsWithNumbers[i][j])
                }
            }
        }
        // вторая сортировка всей кучи (всего массива) - 2 этап
        fun sortFinish(){
            while (countSortedNumbers < newArrayList.size){ // повторяем пока количество отсортированных чисел не будет равняться количеству чисел в массиве
                // меняем местами первое число с последним (самое большое число в конец), а так же увеличиваем кол-во окончательно отсортированных чисел
                newArrayList.swap(0, (newArrayList.size - 1) - countSortedNumbers++)
                sortSmallHeap(0) // запускаем цепочку сортировки с самого верха
            }
        }

        fun sort(){

            createLevels()// разбить по уровням

            sortMainHeap()// первая сортировка всей кучи (всего массива) - 1 этап

            sortFinish()// вторая сортировка всей кучи (всего массива) - 2 этап
        }

        val executionTime = measureNanoTime{
            sort()
        }
        time.invoke(executionTime)

        return newArrayList
    }

    fun heapSortLinkedList(arrayList: ArrayList<Int>, time: (Long) -> Unit ): LinkedList<Int> {
        val newLinkedList = LinkedList<Int>()
        newLinkedList.addAll(arrayList)
        var countSortedNumbers = 0 // кол-во отсортированных чисел с конца
        val levelsWithNumbers = arrayListOf<ArrayList<Int>>()

        // создание уровней чисел, каждый массив это уровень на котором находятся числа
        // в данном случае в уровень, а то-есть в массив, будут помещаться индексы чисел
        // сами числа находятся в основном массиве newArrayList
        fun createLevels(){
            levelsWithNumbers.add(arrayListOf()) // создаем первый уровень чисел
            // первый уровень это вершина кучи - с одним числом

            var currentLevel = 1 // текущий уровень чисел
            var currentHeadNumber = 1 // количество чисел (индексов чисел) которые нужно поместить в текущий уровень

            for (i in 0 until newLinkedList.size){ // проход по всему массиву

                if (currentHeadNumber <= 0){ // сначала проверка, если необходимое количество чисел(индексов чисел) помещены в текущий уровень
                    currentLevel++ // то устанавливается новый уровень
                    currentHeadNumber = 1 // устанавливается базовое значение
                    for (i in 2..currentLevel) currentHeadNumber *= 2 // рассчитывается количество чисел на новом уровне
                    levelsWithNumbers.add(arrayListOf()) // создается новый уровень (массив для хранения индексов)
                }

                if (currentHeadNumber > 0){ // если числа(индекс числа) не заполнены в текущем уровне(массив)
                    levelsWithNumbers[currentLevel - 1].add(i) // в текущий уровень(массив) добавляем число(индекс числа)
                    currentHeadNumber-- // уменьшаем количество чисел которые необходимо добавить в текущий уровень(массив)
                }

            }
        }
        // сортировка маленькой кучи (главного числа и двух дочерних)
        fun sortSmallHeap(indexHeadNumber: Int){
            val indexLeftChildrenNumber = indexHeadNumber * 2 + 1 // рассчитываем индекс в массиве левого дочернего числа
            val indexRightChildrenNumber = indexHeadNumber * 2 + 2 // рассчитываем индекс в массиве правого дочернего числа
            // узнаем, существует ли данное число в массиве и можно ли его сортировать или оно уже окончательно отсортировано
            val actualIndexLeft = indexLeftChildrenNumber <= (newLinkedList.size - 1) - countSortedNumbers
            val actualIndexRight = indexRightChildrenNumber <= (newLinkedList.size - 1) - countSortedNumbers

            // в случае если оба числа необходимо обработать
            fun allActual(){
                if (newLinkedList[indexLeftChildrenNumber] > newLinkedList[indexHeadNumber] && newLinkedList[indexLeftChildrenNumber] >= newLinkedList[indexRightChildrenNumber]){
                    newLinkedList.swap(indexLeftChildrenNumber, indexHeadNumber)
                    sortSmallHeap(indexLeftChildrenNumber)
                }
                if (indexRightChildrenNumber <= (newLinkedList.size - 1) - countSortedNumbers){
                    if (newLinkedList[indexRightChildrenNumber] > newLinkedList[indexHeadNumber] && newLinkedList[indexRightChildrenNumber] >= newLinkedList[indexLeftChildrenNumber]){
                        newLinkedList.swap(indexRightChildrenNumber, indexHeadNumber)
                        sortSmallHeap(indexRightChildrenNumber)
                    }
                }
            }

            // в случае если правое дочернее число не существует или уже окончательно отсортировано
            fun onlyLeftActual(){
                if (newLinkedList[indexLeftChildrenNumber] > newLinkedList[indexHeadNumber]){
                    newLinkedList.swap(indexLeftChildrenNumber, indexHeadNumber)
                    sortSmallHeap(indexLeftChildrenNumber)
                }
            }

            when {
                !actualIndexLeft && !actualIndexRight -> return
                actualIndexLeft && actualIndexRight -> allActual()
                actualIndexLeft && !actualIndexRight -> onlyLeftActual()
            }

        }
        // первая сортировка всей кучи (всего массива) - 1 этап
        fun sortMainHeap(){
            // проход по уровням начиная с предпоследнего и вверх
            // -1 пропускаем чтобы не выйти за пределы массива и еще -1 пропускаем самый нижний уровень
            for (i in levelsWithNumbers.size - 2 downTo 0){ // в i получаем индекс предпоследнего уровня чисел

                for (j in levelsWithNumbers[i].size - 1 downTo 0){ // проход по всем числам данного уровня начиная с конца
                    sortSmallHeap(levelsWithNumbers[i][j])
                }
            }
        }
        // вторая сортировка всей кучи (всего массива) - 2 этап
        fun sortFinish(){
            while (countSortedNumbers < newLinkedList.size){ // повторяем пока количество отсортированных чисел не будет равняться количеству чисел в массиве
                // меняем местами первое число с последним (самое большое число в конец), а так же увеличиваем кол-во окончательно отсортированных чисел
                newLinkedList.swap(0, (newLinkedList.size - 1) - countSortedNumbers++)
                sortSmallHeap(0) // запускаем цепочку сортировки с самого верха
            }
        }

        fun sort(){

            createLevels()// разбить по уровням

            sortMainHeap()// первая сортировка всей кучи (всего массива) - 1 этап

            sortFinish()// вторая сортировка всей кучи (всего массива) - 2 этап
        }

        val executionTime = measureNanoTime{
            sort()
        }
        time.invoke(executionTime)

        return newLinkedList
    }

    fun heapSortIntArray(arrayList: ArrayList<Int>, time: (Long) -> Unit ): IntArray {
        val newIntArray = IntArray(arrayList.size)
        for (i in 0 until arrayList.size){
            newIntArray[i] = arrayList[i]
        }
        var countSortedNumbers = 0 // кол-во отсортированных чисел с конца
        val levelsWithNumbers = arrayListOf<ArrayList<Int>>()

        // создание уровней чисел, каждый массив это уровень на котором находятся числа
        // в данном случае в уровень, а то-есть в массив, будут помещаться индексы чисел
        // сами числа находятся в основном массиве newArrayList
        fun createLevels(){
            levelsWithNumbers.add(arrayListOf()) // создаем первый уровень чисел
            // первый уровень это вершина кучи - с одним числом

            var currentLevel = 1 // текущий уровень чисел
            var currentHeadNumber = 1 // количество чисел (индексов чисел) которые нужно поместить в текущий уровень

            for (i in 0 until newIntArray.size){ // проход по всему массиву

                if (currentHeadNumber <= 0){ // сначала проверка, если необходимое количество чисел(индексов чисел) помещены в текущий уровень
                    currentLevel++ // то устанавливается новый уровень
                    currentHeadNumber = 1 // устанавливается базовое значение
                    for (i in 2..currentLevel) currentHeadNumber *= 2 // рассчитывается количество чисел на новом уровне
                    levelsWithNumbers.add(arrayListOf()) // создается новый уровень (массив для хранения индексов)
                }

                if (currentHeadNumber > 0){ // если числа(индекс числа) не заполнены в текущем уровне(массив)
                    levelsWithNumbers[currentLevel - 1].add(i) // в текущий уровень(массив) добавляем число(индекс числа)
                    currentHeadNumber-- // уменьшаем количество чисел которые необходимо добавить в текущий уровень(массив)
                }

            }
        }
        // сортировка маленькой кучи (главного числа и двух дочерних)
        fun sortSmallHeap(indexHeadNumber: Int){
            val indexLeftChildrenNumber = indexHeadNumber * 2 + 1 // рассчитываем индекс в массиве левого дочернего числа
            val indexRightChildrenNumber = indexHeadNumber * 2 + 2 // рассчитываем индекс в массиве правого дочернего числа
            // узнаем, существует ли данное число в массиве и можно ли его сортировать или оно уже окончательно отсортировано
            val actualIndexLeft = indexLeftChildrenNumber <= (newIntArray.size - 1) - countSortedNumbers
            val actualIndexRight = indexRightChildrenNumber <= (newIntArray.size - 1) - countSortedNumbers

            // в случае если оба числа необходимо обработать
            fun allActual(){
                if (newIntArray[indexLeftChildrenNumber] > newIntArray[indexHeadNumber] && newIntArray[indexLeftChildrenNumber] >= newIntArray[indexRightChildrenNumber]){
                    newIntArray.swap(indexLeftChildrenNumber, indexHeadNumber)
                    sortSmallHeap(indexLeftChildrenNumber)
                }
                if (indexRightChildrenNumber <= (newIntArray.size - 1) - countSortedNumbers){
                    if (newIntArray[indexRightChildrenNumber] > newIntArray[indexHeadNumber] && newIntArray[indexRightChildrenNumber] >= newIntArray[indexLeftChildrenNumber]){
                        newIntArray.swap(indexRightChildrenNumber, indexHeadNumber)
                        sortSmallHeap(indexRightChildrenNumber)
                    }
                }
            }

            // в случае если правое дочернее число не существует или уже окончательно отсортировано
            fun onlyLeftActual(){
                if (newIntArray[indexLeftChildrenNumber] > newIntArray[indexHeadNumber]){
                    newIntArray.swap(indexLeftChildrenNumber, indexHeadNumber)
                    sortSmallHeap(indexLeftChildrenNumber)
                }
            }

            when {
                !actualIndexLeft && !actualIndexRight -> return
                actualIndexLeft && actualIndexRight -> allActual()
                actualIndexLeft && !actualIndexRight -> onlyLeftActual()
            }

        }
        // первая сортировка всей кучи (всего массива) - 1 этап
        fun sortMainHeap(){
            // проход по уровням начиная с предпоследнего и вверх
            // -1 пропускаем чтобы не выйти за пределы массива и еще -1 пропускаем самый нижний уровень
            for (i in levelsWithNumbers.size - 2 downTo 0){ // в i получаем индекс предпоследнего уровня чисел

                for (j in levelsWithNumbers[i].size - 1 downTo 0){ // проход по всем числам данного уровня начиная с конца
                    sortSmallHeap(levelsWithNumbers[i][j])
                }
            }
        }
        // вторая сортировка всей кучи (всего массива) - 2 этап
        fun sortFinish(){
            while (countSortedNumbers < newIntArray.size){ // повторяем пока количество отсортированных чисел не будет равняться количеству чисел в массиве
                // меняем местами первое число с последним (самое большое число в конец), а так же увеличиваем кол-во окончательно отсортированных чисел
                newIntArray.swap(0, (newIntArray.size - 1) - countSortedNumbers++)
                sortSmallHeap(0) // запускаем цепочку сортировки с самого верха
            }
        }

        fun sort(){

            createLevels()// разбить по уровням

            sortMainHeap()// первая сортировка всей кучи (всего массива) - 1 этап

            sortFinish()// вторая сортировка всей кучи (всего массива) - 2 этап
        }

        val executionTime = measureNanoTime{
            sort()
        }
        time.invoke(executionTime)

        return newIntArray
    }


    fun quickSortArrayList(arrayList: ArrayList<Int>, time: (Long) -> Unit ): ArrayList<Int> {
        val newArrayList = arrayListOf<Int>()
        newArrayList.addAll(arrayList)

        fun partition(array: ArrayList<Int>, l: Int, r: Int): Int {
            var left = l
            var right = r
            val pivot = array[(left + right)/2] // Опорная точка
            while (left <= right) {
                while (array[left] < pivot) left++ // Находим элементы слева которые должны быть справа

                while (array[right] > pivot) right-- // Находим элементы справа которые должны быть слева

                // Меняем местами
                if (left <= right) {
                    array.swap(left,right)
                    left++
                    right--
                }
            }
            return left
        }
        fun quickSort(newArrayList: ArrayList<Int>, left: Int, right: Int) {
            val index = partition (newArrayList, left, right)
            if(left < index-1) { // Сортировка левой половины
                quickSort(newArrayList, left, index-1)
            }
            if(index < right) { // Сортировка правой половины
                quickSort(newArrayList,index, right)
            }
        }

        fun sort(){
            quickSort(newArrayList, 0, newArrayList.size - 1)
        }

        val executionTime = measureNanoTime{
            sort()
        }

        time.invoke(executionTime)

        return newArrayList
    }

    fun quickSortLinkedList(arrayList: ArrayList<Int>, time: (Long) -> Unit ): LinkedList<Int> {
        val newLinkedList = LinkedList<Int>()
        newLinkedList.addAll(arrayList)

        fun partition(linkedList: LinkedList<Int>, l: Int, r: Int): Int {
            var left = l
            var right = r
            val pivot = linkedList[(left + right)/2] // Опорная точка
            while (left <= right) {
                while (linkedList[left] < pivot) left++ // Находим элементы слева которые должны быть справа

                while (linkedList[right] > pivot) right-- // Находим элементы справа которые должны быть слева

                // Меняем местами
                if (left <= right) {
                    linkedList.swap(left,right)
                    left++
                    right--
                }
            }
            return left
        }
        fun quickSort(linkedList: LinkedList<Int>, left: Int, right: Int) {
            val index = partition (linkedList, left, right)
            if(left < index-1) { // Сортировка левой половины
                quickSort(linkedList, left, index-1)
            }
            if(index < right) { // Сортировка правой половины
                quickSort(linkedList,index, right)
            }
        }

        fun sort(){
            quickSort(newLinkedList, 0, newLinkedList.size - 1)
        }

        val executionTime = measureNanoTime{
            sort()
        }

        time.invoke(executionTime)

        return newLinkedList
    }

    fun quickSortIntArray(arrayList: ArrayList<Int>, time: (Long) -> Unit ): IntArray {
        val newIntArray = IntArray(arrayList.size)
        for (i in 0 until arrayList.size){
            newIntArray[i] = arrayList[i]
        }

        fun partition(intArray: IntArray, l: Int, r: Int): Int {
            var left = l
            var right = r
            val pivot = intArray[(left + right)/2] // Опорная точка
            while (left <= right) {
                while (intArray[left] < pivot) left++ // Находим элементы слева которые должны быть справа

                while (intArray[right] > pivot) right-- // Находим элементы справа которые должны быть слева

                // Меняем местами
                if (left <= right) {
                    intArray.swap(left,right)
                    left++
                    right--
                }
            }
            return left
        }
        fun quickSort(intArray: IntArray, left: Int, right: Int) {
            val index = partition (intArray, left, right)
            if(left < index-1) { // Сортировка левой половины
                quickSort(intArray, left, index-1)
            }
            if(index < right) { // Сортировка правой половины
                quickSort(intArray,index, right)
            }
        }

        fun sort(){
            quickSort(newIntArray, 0, newIntArray.size - 1)
        }

        val executionTime = measureNanoTime{
            sort()
        }

        time.invoke(executionTime)

        return newIntArray
    }

}
package com.shatokhin.sortingalgorithms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import sortingalgorithms.SortingAlgorithms
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private val tvResultSortingExecutionTime: TextView by lazy { findViewById(R.id.tvResultSortingExecutionTime) }
    private val btnSort: Button by lazy { findViewById(R.id.btnSort) }
    private val tvArray: TextView by lazy { findViewById(R.id.tvArray) }
    private val edSizeArray: EditText by lazy { findViewById(R.id.edSizeArray) }
    private val btnGenerate: Button by lazy { findViewById(R.id.btnGenerate) }
    private val rgAlgorithms: RadioGroup by lazy { findViewById(R.id.rgAlgorithms) }
    private val rgDataStructure: RadioGroup by lazy { findViewById(R.id.rgDataStructure) }

    private var array = arrayListOf<Int>()
    private val sortingAlgorithms = SortingAlgorithms()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGenerate.setOnClickListener {
            generate()
        }

        btnSort.setOnClickListener {
            sort()
        }

        rgAlgorithms.setOnCheckedChangeListener { _, _ ->
            sort()
        }

        rgDataStructure.setOnCheckedChangeListener {  _, _ ->
            sort()
        }
    }

    private fun addNumbers(size: Int){
        for (i in 1..size){
            val randomNumber = (1..999).random()
            array.add(randomNumber)
        }
    }

    private fun createNewArray(size: Int){
        array.clear()
        addNumbers(size)
    }

    private fun getBeginningOfTheArray(array: ArrayList<Int>, count: Int): String {
        val result = StringBuffer()
        result.append("[ ")
        for (i in 1..count){
            result.append(array[i])
            result.append(", ")
        }
        result.append(".... ]")
        return result.toString()
    }

    private fun getSizeNewArray(): Int {
        if (edSizeArray.text.isEmpty()) return 0
        return edSizeArray.text.toString().toInt()
    }

    private fun generate(){
        if (isAValidRange()) {
            val sizeNewArray = getSizeNewArray()
            createNewArray(sizeNewArray)
            tvArray.text = getBeginningOfTheArray(array, 5)
        }
        else {
            Toast.makeText(this, "Enter from 10 to 10 000", Toast.LENGTH_LONG).show()
        }
    }

    private fun isAValidRange(): Boolean {
        val size = getSizeNewArray()
        return size in 10..10000
    }

    private fun sort(){
        if (array.isNotEmpty()){
            when(rgDataStructure.checkedRadioButtonId){
                R.id.btnArrayList -> sortArrayList(rgAlgorithms.checkedRadioButtonId)
                R.id.btnLinkedList -> sortLinkedList(rgAlgorithms.checkedRadioButtonId)
                R.id.btnIntArray -> sortIntArray(rgAlgorithms.checkedRadioButtonId)
            }
        }
        else Toast.makeText(this, "Array is empty. Press button generate", Toast.LENGTH_LONG).show()
    }

    private fun sortArrayList(idButtonAlgorithm: Int){
        when(idButtonAlgorithm){
            R.id.btnStandardAlgorithm -> sortingAlgorithms.standardSortArrayList(array) { time -> setExecutionTime(time) }
            R.id.btnBubbleAlgorithm -> sortingAlgorithms.bubbleSortArrayList(array) { time -> setExecutionTime(time) }
            R.id.btnShakerAlgorithm -> sortingAlgorithms.shakerSortArrayList(array) { time -> setExecutionTime(time) }
            R.id.btnHeapAlgorithm -> sortingAlgorithms.heapSortArrayList(array) { time -> setExecutionTime(time) }
            R.id.btnQuickAlgorithm -> sortingAlgorithms.quickSortArrayList(array) { time -> setExecutionTime(time) }
        }
    }

    private fun sortLinkedList(idButtonAlgorithm: Int){
        when(idButtonAlgorithm){
            R.id.btnStandardAlgorithm -> sortingAlgorithms.standardSortLinkedList(array) { time -> setExecutionTime(time) }
            R.id.btnBubbleAlgorithm -> sortingAlgorithms.bubbleSortLinkedList(array) { time -> setExecutionTime(time) }
            R.id.btnShakerAlgorithm -> sortingAlgorithms.shakerSortLinkedList(array) { time -> setExecutionTime(time) }
            R.id.btnHeapAlgorithm -> sortingAlgorithms.heapSortLinkedList(array) { time -> setExecutionTime(time) }
            R.id.btnQuickAlgorithm -> sortingAlgorithms.quickSortLinkedList(array) { time -> setExecutionTime(time) }
        }
    }

    private fun sortIntArray(idButtonAlgorithm: Int){
        when(idButtonAlgorithm){
            R.id.btnStandardAlgorithm -> sortingAlgorithms.standardSortIntArray(array) { time -> setExecutionTime(time) }
            R.id.btnBubbleAlgorithm -> sortingAlgorithms.bubbleSortIntArray(array) { time -> setExecutionTime(time) }
            R.id.btnShakerAlgorithm -> sortingAlgorithms.shakerSortIntArray(array) { time -> setExecutionTime(time) }
            R.id.btnHeapAlgorithm -> sortingAlgorithms.heapSortIntArray(array) { time -> setExecutionTime(time) }
            R.id.btnQuickAlgorithm -> sortingAlgorithms.quickSortIntArray(array) { time -> setExecutionTime(time) }
        }
    }

    private fun setExecutionTime(time: Long){
        tvResultSortingExecutionTime.text = time.toString()
    }
}
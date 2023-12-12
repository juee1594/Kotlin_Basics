fun main(){

    //exercise
    val arrayListJ = ArrayList<Double>()
    arrayListJ.add(2.5)
    arrayListJ.add(2.5)
    arrayListJ.add(5.5)
    arrayListJ.add(9.00)
    arrayListJ.add(10.9)
    var additionResult = 0.0
    for (i in arrayListJ){
        additionResult += i
    }
    var average = additionResult / arrayListJ.size
    println("Average is $average")


    //simple arraylist
    val arrayList = ArrayList<String>()
    arrayList.add("Juee")
    arrayList.add("Roshan")
    arrayList.add("Naik")
    println("---Print ArrayList---")
    for(i in arrayList){
        println(i)
    }

    //arraylist using collections
    val arrayListS: ArrayList<String> = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf<String>()
    list.add("Roshan")
    list.add("Prabhakar")
    list.add("Naik")
    arrayListS.addAll(list)
    println()
    println("---Print ArrayListS---")

    val itr = arrayListS.iterator()
    while (itr.hasNext()){
        println(itr.next())
    }
    println("Size of ArraylistS = "+arrayListS.size)
}
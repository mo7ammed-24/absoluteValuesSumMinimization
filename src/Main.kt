fun main() {
    println(absoluteValuesSumMinimization(mutableListOf(2, 4, 7)))
}

fun absoluteValuesSumMinimization(a: MutableList<Int>): Int {
    var resultList=mutableListOf<Int>()
    for(i in 0 until a.size){
        var sumelements=0

        for(j in 0 until a.size){
            sumelements+=kotlin.math.abs(a[j]-a[i])
        }
        resultList.add(sumelements)
    }
    var min=resultList[0]
    for(i in 0 until resultList.size)
        if(resultList[i]<min)
            min=resultList[i]

    var similarMinResult=mutableListOf<Int>()
    for(i in 0 until resultList.size)
        if(resultList[i]==min)
            similarMinResult.add(i)

    var minElement=a[similarMinResult[0]]
    for(i in 0 until similarMinResult.size)
        if(a[similarMinResult[i]]<minElement)
            minElement=a[similarMinResult[i]]

    return minElement
}

open class  mzazi{

    var dad="He is watching football"
    var mum="She likes cooking"
}

class  girls: mzazi(){
    fun cooking(){
        println(mum)
    }

}

class  boy:mzazi(){
    fun  football(){
        println(dad)
    }

}

fun main(args: Array<String>) {
    val obj1=girls()
    obj1.cooking()
    val obj2=boy()
    obj2.football()


}
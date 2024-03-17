class add{
    //data member
    var number=15
    //member function
    fun addition():Int{
        return number+number
    }
}

fun main(args: Array<String>) {
    //instance of myaddition

    val myaddition =add()
    println(myaddition.addition())
}
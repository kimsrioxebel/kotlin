fun main(args: Array<String>) {
    var myarr= arrayOf("clara","claire",true,78,67,98f,'e')
    myarr[0]="claire"
    println("My name is ${myarr[0]}")

    var myintarr= arrayOf<Int>(12,56,52,0,3,-1)
    println(myintarr.sorted())

    var myfloats= arrayOf(23.44444,56.9999999,90.9999)
    println(myfloats.sorted())

    var mystream= arrayOf("Clawis","clara",true,89,67)
    println("My name is ${mystream[0]}")


    Array()

}
fun Array (){
    println("This is my array")
}
//fun main(args: Array<String>) {
//    Array()
//}



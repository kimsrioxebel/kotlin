class  safaristudents(val jina :String,val miaka :Int, val jinsia:String){


}
class eMobilislabs(val labname:String,val lecturername:String,val gender:String)

fun main(args: Array<String>) {
    val  myobj=safaristudents("clara", 12,"female")
    println("My name is ${myobj.jina} am ${myobj.miaka}years old and am a ${myobj.jinsia}")
    val myoobj=eMobilislabs("safari","Erick","male")
    println("My lab is ${myoobj.labname} and am taught by ${myoobj.lecturername} and he is a ${myoobj.gender}")
}
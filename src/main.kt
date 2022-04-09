fun main(){
    oddnumbers()
    var x=arrayOfname(arrayOf("Lydia","Judith","Handel","Leocadia"))
      println(x)
      service(6)
    service(4)
    service(15)
    service(17)
    number()



}
fun oddnumbers(){
    for (number in 1..100){
        if(number% 2!=0) {
          println(number)
        }
    }
}

fun arrayOfname(names:Array<String>):Int{
    var number=0
    for (name in names){
        if(name.length>5) {
             number++
        }
    }

    return number
}

fun service(age:Int){
    if(age<6){
       println("milk")

      }
      else if(age<15 && age>6){
             println("fanta orange")
         }
       else{
          println("cocacola")
       }
}




fun number(){
    for(numbers in 1..100) {
        if (numbers % 3 == 0 && numbers % 5 == 0) {

        } else if (numbers % 3 == 0) {
            println("fizz")
        } else if (numbers % 5 == 0) {
            println("buzz")
        } else {
            println(numbers)
        }

    }
}
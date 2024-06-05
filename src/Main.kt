import kotlin.math.pow

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    /*println("Введите число в десятичной системе:")
    var input = readln().toInt()
    val stringArray: ArrayList<String> = arrayListOf("")

    while (input > 0){
        stringArray.add((input % 2).toString())
        input /= 2
    }
    print("Число в двоичной системе = " )
    for (i in stringArray.reversed().joinToString("")){
        print(i)
    }
    println("\n-----------------------------------------------------")

//2
    println("Введите число в двоичной системе:")
    val input1 = readln()
    val binaryNumber = input1.toCharArray()
    var count = 0
    var number = 0
    for (i in binaryNumber.size-1 downTo 0){
        number += binaryNumber[i].digitToInt() * 2.0.pow(count).toInt()
        count++
    }
    println("Число $input1 в десятичной системе равно $number")
    println("---------------------------------------------------------")*/
//3
    val pal = Palindrom()
    val text = Text(pal)
    val result = text.isPalindrom("азаза")
    if (result) println("Текст является палиндромом")
    else println("Текст не является палиндромом")
}

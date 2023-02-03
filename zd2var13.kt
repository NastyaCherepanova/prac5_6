fun main()
{
    println("Введите первое число")
    val a = readLine()!!.toDouble();
    println("Введите второе число")
    val b = readLine()!!.toInt();

    when
    {
        a>9 && a<100 -> println("Число является двухзначным")
        else -> println("число не является двухзначным")
    }

    when
    {
        b>0 && b<10 -> println("Число является однозначным")
        else -> println("Число не является однозначным")
    }
}
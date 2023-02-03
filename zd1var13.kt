fun main()
{
    println("Введите x")
    var x: Double =0.0
    x = readLine()!!.toDouble();

    when
    {
         (x<=5) -> print(x*x+15*x);
        (5<x) && (x<=8) -> print(x-25);
        (x>8) -> print((x+3)/10);
    }
}
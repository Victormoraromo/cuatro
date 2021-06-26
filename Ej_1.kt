package s4


fun main()
{
    //val enemy = Goomba("Un enemigo",2)
    val enemy = Goomba()

    enemy.collision("Enemy") //al ser otro enemigo con el que se colisiona, se debe cambiar de dirección
    enemy.collision("Weapon") //al colisionar con un arma o poder, el enemigo debe morir

    val enemy2 = Koopa()

    enemy2.collision("Enemy") //al ser otro enemigo con el que se colisiona, se debe cambiar de dirección
    enemy2.collision("Weapon") //al colisionar con un arma o poder, el enemigo debe morir



}
 /*
fun main()
{
    print("Introduce a: ")
    val a = readLine()
    print("Introduce b: ")
    val b = readLine()

    suma(a,b)



}


fun suma(a:Float,b:Float):Float{
    return a+b
}

 */
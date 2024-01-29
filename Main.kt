fun main() {
    var o : ObjecteGeometric = ObjecteGeometric(2, 3)
    o.setColor("Blau")
    println(o.toString())
    var c : Cercle = Cercle(2, 3, 3.0)
    println(c.toString())
    var r : Rectangle = Rectangle(0, 1, 3.0, 6.0)
    println(r.toString())
    var t : Triangle = Triangle(8, 5, 2.0, 4.0)
    println(t.toString())
    var q : Quadrat = Quadrat(1, 9, 2.0, 2.0)
    println(q.toString())

}

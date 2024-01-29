class Quadrat : Rectangle {
    constructor(x : Int, y : Int, base : Double, alçada: Double) : super(x, y, base, alçada) {
        this.base = base
        this.alçada = alçada
    }

    override fun perimetre() : Double {
        return 4*base
    }

    override fun area() : Double {
        return base*base
    }

    override fun toString() : String {
        return "Aquest Quadrat $color está a (${this.x}, ${this.y})" +
                ", té el costat de $base" +
                " amb un perímetre de ${perimetre().toInt()} i un àrea de ${area().toInt()}"
    }

}
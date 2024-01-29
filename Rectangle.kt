open class Rectangle : ObjecteGeometric {
    @JvmField protected var base : Double
    @JvmField protected var alçada : Double
    init {
        base = 1.0
        alçada = 2.0
    }
    constructor(x : Int, y : Int, base : Double, alçada: Double) : super(x, y) {
        this.base = base
        this.alçada = alçada
    }

    open fun perimetre() : Double {
        return 2*(base+alçada)
    }

    open fun area() : Double {
        return base*alçada
    }

    override fun toString() : String {
        return "Aquest Rectangle $color está a (${this.x}, ${this.y})" +
                ", té una base de $base, una alçada de $alçada" +
                " amb un perímetre de ${perimetre().toInt()} i un àrea de ${area().toInt()}"
    }

}
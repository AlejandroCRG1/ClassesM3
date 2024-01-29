import kotlin.math.PI

class Cercle : ObjecteGeometric {
    protected var radi : Double

    constructor(x : Int, y : Int, radi : Double) : super(x, y) {
        this.radi = radi
    }

    fun perimetre() : Double {
        return 2* PI *radi
    }

    fun area() : Double {
        return PI *radi*radi
    }

    override fun toString() : String {
        return "Aquest Cercle $color está a (${this.x}, ${this.y}), té un radi de $radi" +
                ", amb un perímetre de ${perimetre().toInt()} i un àrea de ${area().toInt()}"
    }

}
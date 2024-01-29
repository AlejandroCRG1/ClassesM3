open class ObjecteGeometric {
    @JvmField protected var x : Int
    @JvmField protected var y : Int
    @JvmField protected var color : String
    init {
        x = 0
        y = 0
        color = ""
    }
    constructor(x : Int, y : Int) {
        this.x = x
        this.y = y
    }

    fun getX() : Int {
        return x
    }

    fun getY() : Int {
        return y
    }

    fun getColor() : String {
        return color
    }

    fun setX(x : Int) {
        this.x = x
    }

    fun setY(y : Int) {
        this.y = y
    }

    fun setColor(color : String) {
        this.color = color
    }

    override fun toString(): String {
        return "Aquest objecte geomètric està ubicat a ($x, $y) i té el color $color"
    }
}

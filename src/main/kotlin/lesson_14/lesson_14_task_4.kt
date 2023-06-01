package lesson_14
/*В компьютерной игре существуют планеты. У некоторых из них есть спутники.
Планеты и спутники могут быть обитаемыми, могут иметь атмосферу, воду, могут быть пригодными для высадки.
Создай родительский класс, описывающий небесные тела, и подклассы, описывающие планеты и спутники.
Затем создай планету с двумя спутниками и выведи в консоль имя планеты и имена всех спутников.*/
fun main() {
    val phobos = Satellite("Фобос", false, false, false, false)
    val deimos = Satellite("Деймос", false, false, false, false)
    val mars = Planet("Марс", false, false, false, true, listOf(phobos, deimos))
    println(mars)
}

abstract class CelestialBody(
    val name: String,
    val isInhabited: Boolean,
    val hasAtmosphere: Boolean,
    val hasWater: Boolean,
    val isSuitableForLanding: Boolean,
) {
    override fun toString(): String {
        return name
    }
}

class Planet(
    name: String,
    isInhabited: Boolean,
    hasAtmosphere: Boolean,
    hasWater: Boolean,
    isSuitableForLanding: Boolean,
    val satellites: List<Satellite>,
) : CelestialBody(name, isInhabited, hasAtmosphere, hasWater, isSuitableForLanding) {
    override fun toString(): String {
        return """
            Небесное тело:
            название: $name
            обитаема: $isInhabited
            имеет атмосферу: $hasAtmosphere
            имеет воду: $hasWater
            пригодна для высадки: $isSuitableForLanding
            Спутники: $satellites
        """.trimIndent()
    }
}

class Satellite(
    name: String,
    isInhabited: Boolean,
    hasAtmosphere: Boolean,
    hasWater: Boolean,
    isSuitableForLanding: Boolean,
) : CelestialBody(name, isInhabited, hasAtmosphere, hasWater, isSuitableForLanding)
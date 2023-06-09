package lesson_19
/*В симуляторе аквариума есть 4 вида рыб.
Гуппи (guppy), скалярия (angelfish), золотая рыбка (Goldfish), петушок (Siamese fighting fish).
Напиши enum класс, перечисляющий этих рыб.
Сообщи пользователю, каких рыб он может добавить в свой аквариум, распечатав список в консоль.*/
fun main() {
    for (i in Fish.values()) println(i.getFishName())
}

enum class Fish {
    GUPPY {
        override fun getFishName(): String {
            return "guppy"
        }
    },
    ANGELFISH {
        override fun getFishName(): String {
            return "angelfish"
        }
    },
    GOLDFISH {
        override fun getFishName(): String {
            return "Goldfish"
        }
    },
    SIAMESE_FIGHTING_FISH {
        override fun getFishName(): String {
            return "Siamese fighting fish"
        }
    };

    abstract fun getFishName() : String
}
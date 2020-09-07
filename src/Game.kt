fun main() {
    var healthPoints: Int =100
    val playerName: String="Madrigal"
    var isBlessed = true;

    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()

    when(healthPoints){
        100-> println("$playerName is in excellent condition!")
        in 90..99 -> println("$playerName has a few scratches.")
        in 75..89 -> if (isBlessed)
        { println("$playerName has some minor wounds but is healing quite quickly!")}
        else { println("$playerName has some minor wounds.")  }
        in 15..74 ->println("$playerName looks pretty hurt.")
        else->{ println("$playerName is in awful condition!")    }

    }
    println("$playerName $healthPoints")

    when(karma){
        in 0..5 ->println("red")
        in 6..10 ->println("orange")
        in 11..15 ->println("purple")
        in 16..20 ->println("green")
    }
}
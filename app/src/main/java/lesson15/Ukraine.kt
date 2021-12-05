package lesson15

class Ukraine(nameTransport: String):LandTransport()

{
    var visa: Boolean=false
    val nameCountry:String="Ukraine"
    var people:Int=234000
    override var nameTransport="car"

    fun priseUkraine(nameTransport: String):Int{
        val result=Ukraine(nameTransport)
        var sum:Int = 0
        if (result.visa==true) sum=sum+200
        if ((nameTransport).equals("bus")) sum=sum+150
        if((nameTransport).equals("car"))sum=sum+190
        if((nameTransport).equals("train"))sum=sum+110
        return sum
    }


}
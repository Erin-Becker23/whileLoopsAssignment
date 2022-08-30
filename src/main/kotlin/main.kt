fun main() {

    var input = 0

    do{
        println("1) Minecraft")
        println("2) Roblox")
        println("3) Fornite")
        println("4) Mario Kart")
        println("5) Terraria")
        println("6) Omori")
        println("7) Among Us")
        println("8) exit")


        println("please pick your favorite game: ")
        input = readln()!!.toInt()
        if (input > 8){
            println("that is not one of the choices :)")
        }
        else {
            println ("you chose option $input")
        }
        println("-------------------")
    }while(input !=8)

    }

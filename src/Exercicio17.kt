class Exercicio17 {

    companion object{

        var proxID = 0

        fun gerarID() : Int {
            proxID++
            return  proxID
        }
    }
}
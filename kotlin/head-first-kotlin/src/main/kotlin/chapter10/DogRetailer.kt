package chapter10

class DogRetailer : Retailer<Dog> {
    override fun sell(): Dog {
        println("Sell dog")
        return Dog("")
    }
}
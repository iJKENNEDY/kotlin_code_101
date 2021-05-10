package oop


class Shark: FishAction, FishColor {
    override val color: String="grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor= GoldColor): FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor{


}
def displayInventory(item: Array[String], quantity: Array[Int]) = {
    print("Inventory\n")
    for(i <- 0 to item.length-1) {
        print(item(i) + " - ")
        print(quantity(i))
        print("\n")
    }
}

def restockItem(item: Array[String], quantity: Array[Int], newQuantity: Int) = {
    var flag = false

    for(i <- 0 to item.length-1) {
        if(item(i) == "Sugar") {
            flag = true
            var index = i
            quantity(i) += newQuantity 
        }
    }

    if(flag == false) {
        print("Item not found")
    }

    print("\n\nRestock Updated Inventory\n")
    for(i <- 0 to item.length-1) {
        print(item(i) + " - ")
        print(quantity(i))
        print("\n")
    }

}

def sellItem(item: Array[String], quantity: Array[Int], sellQuantity: Int) = {
    var flag = false

    for(i <- 0 to item.length-1) {
        if(item(i) == "Dhal") {
            flag = true
            var index = i 
                if(quantity(i) < sellQuantity) {
                    print("Quantity is not enough");
                } else {
                    quantity(i) -= sellQuantity
                }
        }
    }

    if(flag == false) {
        print("Item not found")
    }

    print("\n\nSell Updated Inventory\n")
    for(i <- 0 to item.length-1) {
        print(item(i) + " - ")
        print(quantity(i))
        print("\n")
    }
}

def main(args: Array[String]) = {
    var item = Array("Book","Rice","Dhal","Sugar")
    var quantity = Array(20,50,25,25)

    displayInventory(item, quantity)

    restockItem(item, quantity, 10) 

    sellItem(item, quantity, 3)   
}

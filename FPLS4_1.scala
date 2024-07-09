def displayInventory(item: Array[String], quantity: Array[Int]) = {
    print("Inventory\n")
    for(i <- 0 to item.length-1) {
        print(item(i) + " - ")
        print(quantity(i))
        print("\n")
    }
}

def restockItem(item: Array[String], quantity: Array[Int], newquantity: Int) = {
    var flag = false

    for(i <- 0 to item.length-1) {
        if(item(i) == "Sugar") {
            flag = true
            var index = i
            quantity(i) += newquantity 
        }
    }

    if(flag == false) {
        print("Item not found")
    }

    print("\n\nUpdated Inventory\n")
    for(i <- 0 to item.length-1) {
        print(item(i) + " - ")
        print(quantity(i))
        print("\n")
    }

}

def sellItem(item: Array[String], quantity: Array[String]) = {
    var flag = false

    for(i <- 0 to item.length-1) {
        if(item(i) == "Sugar") {
            flag = true
            var index = i
            quantity(i) += newquantity 
        }
    }

    if(flag == false) {
        print("Item not found")
    }

    print("\n\nUpdated Inventory\n")
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
}
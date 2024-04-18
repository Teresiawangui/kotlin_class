fun main() {
    val friends = listOf("Fridah", "terry", "mary", "tom")
    println(friends.contains("mary"))


    val nums = listOf(-1, 78, -45, 87, 32, 0, 7, -97)
    /*Apredicate is like a seive == the condition*/
    val negativeNums = nums.filter { num -> num < 0 }
    println(negativeNums)

    val names = listOf("ben", "ken", "ten", "pen", "pen", "pen", "ken")
    val realNames = names.filter { name -> name != "ten" && name != "pen" }
    println(realNames)

    val contact1 = Contact("Brian", "0765654356", "brian@gmail.com", "male")
    val contact2 = Contact("Penina", "0789898989", "penina@gmail.com", "female")
    val contact3 = Contact("Auma", "012345345678", "nyambufrtd", "female")
    val contact4 = Contact("Tito", "012345345678", "nyambufrtd", "male")

    val myContacts = listOf(contact1, contact2, contact3, contact4)
    val femaleContacts = myContacts.filter { contact -> contact.gender == "female" }
    val shortContacts = myContacts.filter { contact -> contact.name.length == 4 }
    println(femaleContacts)


    //you are sorting a list of words into two lists.
    //One list is to contain words beginning with a vowel while another
    //is to hold words beginning with a consonant.
    //Write a function to achieve this
    println(femaleContacts)


    val words = listOf("apple", "banana", "orange", "pear", "kiwi", "grape")

    val vowelList = words.filter {
        it.startsWith("a") || it.startsWith("e")
                || it.startsWith("i") || it.startsWith("o") || it.startsWith("u")
    }
    val consonantList = words.filter {
        !it.startsWith("a") && !it.startsWith("e")
                && !it.startsWith("i") && !it.startsWith("o") && !it.startsWith("u")
    }

    println("Words starting with a vowel: $vowelList")
    println("Words starting with a consonant: $consonantList")

    val strings = listOf("apple", "banana", "cherry", "date", "strawberry")
    val x = getString(strings)
    println(x)

    val heights = listOf(2.3,9.2,5.67,8.9)
    val (total, average) =heights

    //println("Total Height: $total meters")
    println("$average meters")


        val cart = listOf(
            Product("Apple", "groceries", 15.5, 2),
            Product("Toothpaste", "hygiene", 30.0, 1),
            Product("T-shirt", "general", 100.0, 1),
            Product("Microwave", "appliances", 50.0, 1),
            Product("Banana", "groceries", 10.0, 3)
        )
     calculateCategoryTotals(cart)


    sentence("Barbie bakes brown bagels and buns")



    }



   // println(friends.sortedBy { f->f.lowercase() })



  /* var snacks = listOf("crips","biscuits","chocolate","donut")
    snacks = snacks.reversed()
    println(snacks)
    val contact1=Contact("mary","0765654356","marywambui")
    val contact2 = Contact("Doney","0789898989","doniytire")
    val contact3 =Contact("nyambu","012345345678","nyambufrtd")
    val myContacts = listOf(contact1,contact2,contact3)
    println(myContacts)
    myContacts.forEachIndexed{ idx, i ->
        if (idx % 2 !=0) {

        }
    }

   /* var myContacts = listOf(contact1,contact2,contact3)
    myContacts.forEachIndexed(index, contact -> {
        if(index % 2!=0){
            println(contact.name.upperccase())}
        }
    else{
        println(contact.name)
    }*/
    val sortedContacts = myContacts.sortedBy {contact-> contact.name }
    println(sortedContacts)
    snacks= snacks.sorted()
    println(snacks)
    println(snacks)
    val androidVersions = mutableListOf("cupcake","donut","eclair","froyo","gingerbread",)
    androidVersions.add("honeycomb")
    androidVersions.add("icecream sandwich")
    androidVersions.add("jellybean")
    androidVersions.add("kitkat")
    androidVersions.add("lollipop")
    androidVersions.addAll(listOf("marshmallow","nougat","oreo","pie"))
    androidVersions.add(2,"cake")
    androidVersions.remove("froyo")
    androidVersions.removeAt(2)
    println(androidVersions)
    println(androidVersions[2])
    println(sum(mutableListOf(34,2,45,56,78,)))



   //add(1, 2, 3, 4, 5)

    //createList("apple")
   // createList("dog","girl")

}
/*fun createLIst(a:String,b:String,c:String):List<String>{
   return
}*/

/*fun createList(vararg strs:String):MutableList<String>{
    val result = mutableListOf<String>()
    strs.forEach { {str-> result.add(strs)} }
    println(result)
    return */

//write a function that takes in a mutable list of 5 integers and return the sum of all the elements in odd indices

fun add(numbers:MutableList<Int>){
    println( numbers[1] + numbers[3])

}
//write a function that takes in a mutable list of integers and return the sum of all the elements in odd indices
fun sum(statistic:MutableList<Int>):Int {
    var sum= 0
    statistic.forEachIndexed{ idx, i ->
        if (idx % 2 !=0) {
            sum+=i
        }
    }
    return sum
}
data class Contact(
    var name:String,
    var phoneNumber:String,
    var email:String)
//print out the names of all your contacts .If the index is odd,print the name in uppercase
//input the list of contacts
        //loop through the list
        //find the contact in odd index and convert the names to uppercase
//output the name in uppercase*/

//given a list of contacts like above, write a function that would sort the
//list by either name, phone number or email depending on which is specified in the parameters
    //fun sortContact(contacts: List<Contact>, sortBy: String):List<Contact> {*/
data class Contact(
    var name:String,
    var phoneNumber:String,
    var email:String,
    var gender:String)

fun getString(strings:List<String>):List<String>{
        return strings.filterIndexed { index, _ -> index % 2 == 0 }
    }

fun calculateHeight(heights: List<Double>):Double {
    var totalHeight = 0.0

    for (h in heights) {
        totalHeight += h
    }

    val averageHeight = totalHeight / heights.size

    return averageHeight
}



data class Product(var name:String, var category:String, var price:Double, var quantity:Int)

fun calculateCategoryTotals(products: List<Product>) {
    var groceriesTotal = 0.0
    var hygieneTotal = 0.0
    var generalTotal = 0.0
    var appliancesTotal = 0.0

    for (product in products) {
        when (product.category) {
            "groceries" -> groceriesTotal += product.price * product.quantity
            "hygiene" -> hygieneTotal += product.price * product.quantity
            "general" -> generalTotal += product.price * product.quantity
            "appliances" -> appliancesTotal += product.price * product.quantity
        }

    }
    println(groceriesTotal)
    println(hygieneTotal)
    println(generalTotal)
    println(appliancesTotal)


}
fun sentence(text:String){

    println(text.lowercase().replace("b",""))}
























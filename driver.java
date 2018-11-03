public class driver{
  public static void main(String[] args){
/*
      NONULLARRAYLIST
*/
    // TESTING CONSTRUCTORS AND NULL CASES
    System.out.println("First thing's first: No Nulls!");

    NoNullArrayList<String> fruity = new NoNullArrayList<String>(20);
    fruity.add("apples");
    fruity.add("bananas");
    fruity.add("watermelon");
    fruity.add("mangoes");
    System.out.println("Your fruits are: \n" + fruity.toString());

    NoNullArrayList<String> veggie = new NoNullArrayList<String>(20);
    veggie.add("cucumbers");
    veggie.add("carrots");
    veggie.add("spinach");
    veggie.add("bok choy");
    //veggie.add(null); //UNCOMMENT TO TEST NULL CASES THIS SHOULD THROW BACK
    System.out.println("Your veggies are: \n" + veggie.toString() + "\n");

    // TESTING SETTING
    System.out.println("But now, can we eat different fruits? AND vegetables???");
    fruity.set(2, "dragonfruit");
    fruity.set(3, "strawberries");
    System.out.println("Our new fruits should be: \n[apples, bananas, dragonfruit, strawberries]");
    System.out.println("Your fruits are: \n" + fruity.toString());

    veggie.set(0, "kale");
    //veggie.set(5, "tomatoes"); //UNCOMMENT TO TEST INDEX OUT OF BOUNDS EXCEPTION
    //veggie.set(3, null); //UNCOMMENT TO TEST NULL CASES THIS SHOULD BE THROWN BACK
    System.out.println("Our new veggies should be: \n[kale, carrots, spinach, bok choy]");
    System.out.println("Your veggies are: \n" + veggie.toString() + "\n");

    // TESTING ADDING
    System.out.println("We're still hungry though!");
    fruity.add("honeydew");
    fruity.add("grapes");
    fruity.add("durian");
    fruity.add(0, "blueberries");
    fruity.add(3, "oranges");
    System.out.println("Our long list of fruits should be: \n[blueberries, apples, bananas, oranges, dragonfruit, strawberries, honeydew, grapes, durian]");
    System.out.println("Your fruits are: \n" + fruity.toString());

    veggie.add("pumpkin");
    veggie.add("squash");
    veggie.add(2, "lettuce");
    veggie.add(3, "eggplant");
    //veggie.add(null); //UNCOMMENT TO TEST NULL CASES THIS SHOULD BE THROWN BACK
    System.out.println("Our long list of veggies should be: \n[kale, carrots, lettuce, eggplant, spinach, bok choy, pumpkin, squash]");
    System.out.println("Your veggies are: \n" + veggie.toString() + "\n");
  }
}

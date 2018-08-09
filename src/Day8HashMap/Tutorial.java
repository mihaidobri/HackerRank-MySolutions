package Day8HashMap;

import java.util.HashMap;
import java.util.Map;

public class Tutorial {
    public static void main(String[] args) {

        Map<String,String> romEngDictionary = new HashMap<String, String>();

        romEngDictionary.put("Monday","Luni");
        romEngDictionary.put("Tuesday","Marti");
        romEngDictionary.put("Wenesday","Miercuri");
        romEngDictionary.put("Thursday","Joi");
        romEngDictionary.put("Friday","Vineri");
        romEngDictionary.put("Saturday","Sambata");
        romEngDictionary.put("Sunday","Duminica");

        //Retrieve things from our dictionary
        System.out.println(romEngDictionary.get("Monday"));
        System.out.println(romEngDictionary.get("Tuesday"));
        System.out.println(romEngDictionary.get("Wenesday"));

        //Print out all the keys
        System.out.println(romEngDictionary.keySet());

        //Print out all the values        - The order displayes might be random
        System.out.println(romEngDictionary.values());

        //Print out size
        System.out.println("The size of our dictionary is "+romEngDictionary.size());

        System.out.println();

        //Shopping list
        Map<String,Boolean> shoppingList = new HashMap<String, Boolean>();
        //Put some stuff in dictionary
        shoppingList.put("Ham",true);
        shoppingList.put("Bean",Boolean.TRUE);
        shoppingList.put("Avogado",Boolean.TRUE);
        shoppingList.put("Eggs",false);
        shoppingList.put("Sugar",false);

        //Retrieve items
        System.out.println(shoppingList.get("Ham"));
        shoppingList.get("Sugar");

        //Key-value Pairs Print out
        System.out.println(shoppingList.toString());
        shoppingList.clear();  //is pointing to another reference
        System.out.println(shoppingList.toString());

        //Check if the dictionary is empty
        shoppingList.isEmpty();

        //Remove thinhs from dictionary
        shoppingList.remove("Eggs");

        //Replace values for a certain key
        shoppingList.replace("Sugar",true);

    }

}

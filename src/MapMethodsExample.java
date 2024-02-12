import java.util.HashMap;
import java.util.Map;

public class MapMethodsExample {
  public static void main(String[] args) {
    // Creating a HashMap
    Map<String, Integer> hashMap = new HashMap<>();

    // Adding key-value pairs to the HashMap
    hashMap.put("Alice", 25);
    hashMap.put("Bob", 30);
    hashMap.put("Charlie", 22);

    // Displaying the HashMap
    System.out.println("HashMap: " + hashMap); // HashMap: {Alice=25, Bob=30, Charlie=22}

    // Getting the value for a specific key
    String keyToGet = "Bob";
    int age = hashMap.get(keyToGet);
    System.out.println(keyToGet + "'s age: " + age); // Bob's age: 30

    // Checking if a key is present
    String keyToCheck = "David";
    boolean isKeyPresent = hashMap.containsKey(keyToCheck);
    System.out.println(
        keyToCheck
            + " present in the HashMap: "
            + isKeyPresent); // David present in the HashMap: false

    // Removing a key-value pair
    String keyToRemove = "Alice";
    hashMap.remove(keyToRemove);
    System.out.println(
        keyToRemove
            + " removed. Updated HashMap: "
            + hashMap); // Alice removed. Updated HashMap: {Bob=30, Charlie=22}

    // Iterating through the key-value pairs
    System.out.println("Iterating through HashMap:");
    for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    // Iterating through HashMap:
    // Bob: 30
    // Charlie: 22

    // Displaying the size of the HashMap
    System.out.println("Size of HashMap: " + hashMap.size()); // Size of HashMap: 3

    // Checking if the HashMap is empty
    System.out.println("Is HashMap empty? " + hashMap.isEmpty()); // Is HashMap empty? false

    // Replacing the value for a specific key
    String keyToReplace = "Bob";
    int newAge = 35;
    hashMap.replace(keyToReplace, newAge);
    System.out.println(
        "Updated age for "
            + keyToReplace
            + ": "
            + hashMap.get(keyToReplace)); // Updated age for Bob: 35

    // Clearing all key-value pairs from the HashMap
    hashMap.clear();
    System.out.println("HashMap after clearing: " + hashMap); // HashMap after clearing: {}

    // Creating a new HashMap
    Map<String, String> stringMap = new HashMap<>();
    stringMap.put("One", "First");
    stringMap.put("Two", "Second");
    stringMap.put("Three", "Third");

    // Getting a value or a default value if the key is not present
    String value = stringMap.getOrDefault("Four", "Default");
    System.out.println("Value for key 'Four': " + value); // Value for key 'Four': Default
    // Getting all keys or values as a collection
    System.out.println("Keys: " + hashMap.keySet()); // Keys: [Alice, Bob, Charlie]
    System.out.println("Values: " + hashMap.values()); // Values: [25, 30, 22]

    // Merging values for a key using merge method
    String keyToMerge = "Bob";
    int additionalAge = 5;
    hashMap.merge(keyToMerge, additionalAge, Integer::sum);
    System.out.println(
        "Merged age for " + keyToMerge + ": " + hashMap.get(keyToMerge)); // Merged age for Bob: 35

    // Checking if a value is present in the HashMap
    int ageToCheck = 30;
    boolean isValuePresent = hashMap.containsValue(ageToCheck);
    System.out.println(
        "Is age 30 present in the HashMap? "
            + isValuePresent); // Is age 30 present in the HashMap? true

    // Iterating through keys or values using forEach
    System.out.println("Iterating through keys:");
    hashMap.keySet().forEach(key -> System.out.println(key + ": " + hashMap.get(key)));
    // Iterating through keys:
    // Alice: 25
    // Bob: 35
    // Charlie: 22

    // Removing a key only if it is associated with a specific value
    String keyToRemoveWithValue = "Charlie";
    int valueToRemove = 22;
    boolean removed = hashMap.remove(keyToRemoveWithValue, valueToRemove);
    System.out.println(
        "Is "
            + keyToRemoveWithValue
            + " with value "
            + valueToRemove
            + " removed? "
            + removed); // Is Charlie with value 22 removed? true
  }
}

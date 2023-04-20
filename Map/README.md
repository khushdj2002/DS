# Map

## A map contains values on the basis of key i.e key and value pair.

## The Map interface of the java collection framework provides the functionality if the map DS.

## each key and value os known as an entry.

![Alt text](https://static.javatpoint.com/images/core/java-map-hierarchy.png)

## A AMp doesn't allow duplicate keys, but you can have duplicate values.
## HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow null key or value.

# Class

## Class	Description
## HashMap	HashMap is the implementation of Map, but it doesn't maintain any order.
## LinkedHashMap	LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
## TreeMap	TreeMap is the implementation of Map and SortedMap. It maintains ascending order.


# Map interface

## Method	Description
## V put(Object key, Object value)	It is used to insert an entry in the map.
## void putAll(Map map)	It is used to insert the specified map in the map.
## V putIfAbsent(K key, V value)	It inserts the specified value with the specified key in the map only if it is not already specified.
## V remove(Object key)	It is used to delete an entry for the specified key.
## boolean remove(Object key, Object value)	It removes the specified values with the associated specified keys from the map.
## Set keySet()	It returns the Set view containing all the keys.
## Set<Map.Entry<K,V>> entrySet()	It returns the Set view containing all the keys and values.
## void clear()	It is used to reset the map.
## V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)	It is used to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).
## V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)	It is used to compute its value using the given mapping function, if the specified key is not already associated with a value (or is mapped to null), and enters it into this map unless null.
## V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)	It is used to compute a new mapping given the key and its current mapped value if the value for the specified key is present and non-null.
## boolean containsValue(Object value)	This method returns true if some value equal to the value exists within the map, else return false.
## boolean containsKey(Object key)	This method returns true if some key equal to the key exists within the map, else return false.
## boolean equals(Object o)	It is used to compare the specified Object with the Map.
## void forEach(BiConsumer<? super K,? super V> action)	It performs the given action for each entry in the map until all entries have been processed or the action throws an exception.
## V get(Object key)	This method returns the object that contains the value associated with the key.
## V getOrDefault(Object key, V defaultValue)	It returns the value to which the specified key is mapped, or defaultValue if the map contains no mapping for the key.
## int hashCode()	It returns the hash code value for the Map
## boolean isEmpty()	This method returns true if the map is empty; returns false if it contains at least one key.
## V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)	If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.
## V replace(K key, V value)	It replaces the specified value for a specified key.
## boolean replace(K key, V oldValue, V newValue)	It replaces the old value with the new value for a specified key.
## void replaceAll(BiFunction<? super K,? super V,? extends V> function)	It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
## Collection values()	It returns a collection view of the values contained in the map.
## int size()	This method returns the number of entries in the map.

# Map.Entry Interface

## Method	Description
## K getKey()	It is used to obtain a key.
## V getValue()	It is used to obtain value.
## int hashCode()	It is used to obtain hashCode.
## V setValue(V value)	It is used to replace the value corresponding to this entry with the specified value.
## boolean equals(Object o)	It is used to compare the specified object with the other existing objects.
## static <K extends Comparable<? super K>,V> Comparator<Map.Entry<K,V>> comparingByKey()	It returns a comparator that compare the objects in natural order on key.
## static <K,V> Comparator<Map.Entry<K,V>> comparingByKey(Comparator<? super K> cmp)	It returns a comparator that compare the objects by key using the given Comparator.
## static <K,V extends Comparable<? super V>> Comparator<Map.Entry<K,V>> comparingByValue()	It returns a comparator that compare the objects in natural order on value.
## static <K,V> Comparator<Map.Entry<K,V>> comparingByValue(Comparator<? super V> cmp)	It returns a comparator that compare the objects by value using the given Comparator.

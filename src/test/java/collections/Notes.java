package collections;

public class Notes {
	/*
Java Collection framework is a set of classes and interfaces that implement commonly reusable collection data structures.
Collection framework allows us to manipulate and store group of objects. Because in collection framework we cannot use primitive data types, we can use only objects.
Even if we try to add primitive value, compile stores it as an object.
list1.add(8);  ----> list1.add(Integer.valueOf(8))
Collection interfaces and classes are present in java.util package

List:
We cannot create an object of List as it is an interface. But we can create a reference of List.
// List<Integer> list1 = new List<Integer>(); 				--> Invalid
// List<Integer> list1 = new ArrayList<Integer>(); 			--> valid
// ArrayList<Integer> list1 = new ArrayList<Integer>(); 	--> valid
Internally Array List, Linked List and vector classes will implement List interface.


ArrayList:
ArrayList is used to store group of objects/data.
In array size was fixed and similar type of data had to be saved[int, string]. We can overcome the disadvantage of array using ArrayList.
ArrayList is dynamic array[ArrayList internally uses an array - it can grow and shrink automatically]
ArrayList uses index to store elements
ArrayList allows duplicate elements
ArrayList maintains insertion order
By default Array list size is 16. It will increase size by 50%

add()	 						- is used to add elements
add(index, element) 			- is used to add data at a particular index
addAll(Collection c) 			- is used to add the data of one array list to another array list 
addAll(index, Collection c)		- is used to add another list at a particular index
removeAll(Collection c) 		- is used to remove matching data present in list2 from list1
remove(index)					- is used to remove data based on index
retainAll(Collection c)         - is used to retain the data that matches with list2 in list1
size()							- gives size of array list / no:of elements present in array list
get(index)						- returns data present at a particular index
contains(element)				- returns boolean value based on if the element is present/not in array list
containsAll(Collection c)		- if all the data is present in list1, then it returns true
clear()                         - clears all the data
isEmpty()						- checks if list is empty and returns boolean value


LinkedList:
LinkedList allows to store duplicate elements
LinkedList maintains insertion order
LinkedList can grow and shrink automatically
ArrayList methods are applicable to LinkedList also.

Differences between the Array List and Linked List
Difference is in the architecture - the way the elements are stored
ArrayList - uses a dynamic array
		  - stores data based on index
		  - adding elements in between is time consuming
		  - better for storing and accessing data
		  - can acts as List only - because it implements only List
		  
		  
Linked List - uses double Linked list - uses nodes
			- adding elements in between is easier
			- better for manipulating data
			- can acts as Queue and List because it implements both list and queue
			

Vector:
Vector is a legacy class. Very old class.
Vector is thread safe [means when multiple threads tries to access resources data corruption will not happen]
Vector allows to store duplicate elements
Vector maintains insertion order.
In Java 1.2 Array list and Linked list were introduced.

Iterator, List Iterator, Enumerator

Iterator:
Purpose of iterator is to iterate collection of data.
Iterator has 3 method:
hasNext(): will check whether there is any data in Collection framework or not
next(): will return data and move the pointer to next element
remove(): will remove the data
Iterator works for Array List, Linked List, Vectors and Set classes. 
List Iterator:
Similar to iterators, we have something called List iterator.
It has some additional methods - previous() and hasPrevious()
You should always call hasPrevious() after calling hasNext(). First your pointer should go to the last element in the list and then only it can come backwards.
Even if you use hasPrevious() before calling hasNext(), it will not print anything for hasPrevious().

Enumerations: can be used only for Vectors.
hasMoreElements()
nextElement()

Map:
Map is a interface(which has only unimplemented methods). There should be some class which implements this interface and has implementation.
Classes are HashMap

HashMap:
Data is stored in the form of Key value pair. 
Keys are always unique. Values can be duplicate.
Map allows us to store one null key, multiple null values.
Insertion order is not maintained
Default initial capacity is 16 and load factor is 0.75. When the hash map reaches its limit, it increases its size by 12.

put(key, value) - to store a value in a map
get(key) 		- to get the value from map
map.keySet()	- to get SET of all keys



HashMap:

	 */

}

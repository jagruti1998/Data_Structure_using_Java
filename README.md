# Data_Structure_using_Java
My notes on Data Structures and implementation using Java.

Data structures describe, how to store the data in memory so that the computer can perform operations on data efficiently.

**Topics**

Brief description or introduction to the topics.

**1.ARRAY-**

The most important factor is it uses contiguous memory allocation of data where a block of memory is reserved for a data structure.
It is an infinite collection of homogeneous(similar type) elements.

- [array creation](src/arrays/array_creation.java)
- [array insertion](src/arrays/array_insertion.java)
- [array deletion](src/arrays/array_deletion.java)
- [2-D array](src/arrays/two_D_array.java)

**Advantages**
- Allow contiguous memory allocation
- Can store multiple data of the same type using a single variable
- Access time T(n)=o(1)

**Disadvantages**
- Insertion Time Complexity T(n)=o(n)
- Deletion Time Complexity T(n)=o(n)
- The size of the array should be known in advance
- Wastage of memory if data is not stored as per the size of an array declared

**Applications**
- Searching
- Sorting
- Matrix Operations
- Can Implement stack, queue, tree graph


**2.LINKEDLIST-**

The elements are not stored at contiguous memory allocation. Instead, the data is stored in chunks. LinkedList overcomes the limitation of an array by providing a more flexible and dynamic data structure.

- [Singly Linked List](src/linkedlist/Single_LL.java)
- [Singly_Insertion](src/linkedlist/SinglyLL_insertion.java)
- [Singly_Deletion](src/linkedlist/SinglyLL_deletion.java)
- [Circular Linked List](src/linkedlist/Circular_LL.java)
- [Circular Insertion](src/linkedlist/CircularLL_insertion.java)
- [Circular Deletion](src/linkedlist/CircularLL_deletion.java)

**Advantages over Array**
- No need to initialize the number of elements to be stored
- Non-contiguous memory allocation

**Disadvantages**
- Access Time Complexity is more than the array
- More memory space is required


**3.STACK-**

It is an ordered list in which the addition of new elements and deletion of already existing elements is done from only one end known as the top of the stack. 
It is called Last In First Out (LIFO)

- [Stack using array](src/stack/stack_Array.java)
- [Stack using linkedlist](src/stack/stack_LinkedList.java)

  
**4.QUEUE-**

It is a homogeneous collection of elements in which new elements are added at one end called the rear, and the existing element is deleted from the other end called the front. 
It is called First In First Out (FIFO)

- [Queue using array](src/queue/queue_array.java)
- [Queue using linkedlist](src/queue/queue_LinkedList.java)
- [Circular Queue](src/queue/Circular_queue_array.java)


**5.TREE-**

A tree is a non-linear data structure in which items or data are stored at different levels.
The data is not stored in a sequential manner.

- [Tree creation](src/tree/tree_creation.java)
- [Tree traversal](src/tree/tree_traversal.java)




**Searching Algorithms-**

Searching algorithms in DSA are methods used to find a specific item or value in a collection of data, such as an array or a list. It's like searching for a particular book in a library.

There are two common types of searching algorithms:

**1. Linear Search:** In linear search, you start from the beginning of the data and check each item one by one until you find the target item. It's like going through each book on the library shelf until you find the one you want.

**2. Binary Search:** Binary search is more efficient but requires the data to be sorted. It works by repeatedly dividing the data in half and comparing the target value with the middle element. Based on the comparison, it narrows down the search to the left or right half and continues the process until it finds the target item. It's like opening the library book at the middle page, checking if your desired book comes before or after, and repeating the process until you find it.

- [Linear Search](src/searching/linear_search.java)
- [Binary search](src/searching/binary_search.java)

  

Each topic is organized in its respective folder. Click on the links above to learn more about each topic.

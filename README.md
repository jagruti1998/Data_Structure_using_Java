# Data_Structure_using_Java
My notes on Data Structures.....

Data structures describe, how to store the data in memory so that the computer can perform operations on data efficiently.

**Topics**

Brief description or introduction to the topic.

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

**2.STACK-**

It is an ordered list in which the addition of new elements and deletion of already existing elements is done from only one end known as the top of the stack. 
It is called Last In First Out (LIFO)

- [Stack using array](src/stack/stack_Array.java)
- [Stack using linkedlist](src/stack/stack_LinkedList.java)

  
**2.QUEUE-**

It is a homogeneous collection of elements in which new elements are added at one end called the rear, and the existing element is deleted from the other end called the front. 
It is called First In First Out (FIFO)

- [Queue using array](src/queue/queue_array.java)
- [Queue using linkedlist](src/queue/queue_LinkedList.java)
- [Circular Queue](src/queue/Circular_queue_array.java)

Each topic is organized in its respective folder. Click on the links above to learn more about each topic.

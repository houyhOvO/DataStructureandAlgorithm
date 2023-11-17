# Linked List

## Definition

In computer science, a [linked list](https://en.wikipedia.org/wiki/Linked_list) is a linear collection of data elements whose order is not given by their physical placement in memory. Instead, each element points to the next. It is a data structure consisting of a collection of nodes which together represent a sequence. In its most basic form, each node contains data, and a reference (in other words, a ​link​) to the next node in the sequence.

## Basic Concepts and Nomenclature

### Singly Linked List

Singly linked lists contain nodes which have a 'value' field as well as 'next' field, which points to the next node in line of nodes. That means each element only knows what its next element is.
![singly_linked_list](../../asset/singly_linked_list.png)

### Doubly Linked List

In a doubly linked list, each node contains, besides the next-node link, a second link field pointing to the previous node in the sequence. That means each element knows what its next element and previous element are.
![doubly_linked_list](../../asset/doubly_linked_list.png)

### Circular Linked List

In the last node of a linked list, the link field often contains a null reference, a special value is used to indicate the lack of further nodes. A less common convention is to make it point to the first node of the list; in that case, the list is said to be circularly linked.
![circular_linked_list](../../asset/circular_linked_list.png)










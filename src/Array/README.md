# Array

## Definition

In computer science, an [array](https://en.wikipedia.org/wiki/Array_(data_structure)) is a data structure consisting of a collection of elements(values or variables), of same memory size, each identified by at least one *array index* or *key*.

## Description

Since the elements in an array is stored continuously，we can get the address of an element by its index. Given the start address $BaseAddress$, we can get the address of the element whose index is $i$ by the formula $BaseAddress+i*size$($size$ is bytes occupied by each element. For $int$, size is $4$, while $size$ is $8$ for $double$). For example, `byte[] array = {1, 2, 3, 4, 5}`, if the start address of the array is 0x7138f94c8, the address of `3` is 0x7138f94c8 + 2 * 1 = 0x7138f94ca.

### Space Occupied

In Java, the structure of an array is

* an 8-byte markword, in which store the hashcode and something else.
* a 4-byte class pointer, which points to the type of the object.
* a 4-byte to store the size of the array
* elements of the array and alignment bytes.

For example,

```Java
int[] array = {1, 2, 3, 4, 5};
```

the size of array is `8 + 4 + 4 + 5 * 4 + 4(alignment)`

## Two-dimensional Array

For example,

```Java
int[][] array = {
    {1, 2, 3, 4, 5},
    {11, 12, 13, 14, 15},
    {21, 22, 23, 24, 25},
}
```

![Memory layout of a two-dimensional array](../asset/memory_layout_of_two_dimensional_array.jpeg)








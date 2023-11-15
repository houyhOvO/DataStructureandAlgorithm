# Binary Search

## Description

Binary search is a search algorithm that finds the position of a target value within a **sorted** array.
If found, return the index. Otherwise, return -1.

## Steps

Given a **sorted** array $A$ with $n$ elements such that       $A_0<=A_1<=A_2<=...<=A_{n-1}$ and a value to be check $target$.

1. Let $i=0, j=n-1$
2. If $i>j$, end, not found
3. Let $m=\lfloor\frac{i+j}{2}\rfloor$
4. If $target \lt A_m$, let $j=m-1$, jump to step2
5. If $A_m \lt target$, let $i=m+1$, jump to step2
6. If $A_m=target$, end, found


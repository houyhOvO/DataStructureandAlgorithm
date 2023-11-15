# Binary Search

## Description

Binary search is a search algorithm that finds the position of a target value within a **sorted** array.
If found, return the index. Otherwise, return -1.

## Steps

Given a **sorted** array $A$ with $n$ elements such that       $A_0 \le A_1 \le A_2 \le ... \le A_{n-1}$ and a value to be check $target$.

1. Let $i=0, j=n-1$
2. If $i>j$, end, not found
3. Let $m=\lfloor\frac{i+j}{2}\rfloor$
4. If $target \lt A_m$, let $j=m-1$, jump to step2
5. If $A_m \lt target$, let $i=m+1$, jump to step2
6. If $A_m=target$, end, found

## Q&A

1. Why the condition of `while` loop of the basic edition is `i <= j`, not `i < j`?
   
   If the condition were `i < j`, when i = j, the method would return -1. That means the method does not check the value whose index is i(or j).
2. Is there anything wrong with `(i + j) / 2`?
   
   Actually, the formula is not correct. We know that in Java, the max value of an int variable is $2^{31}-1$. In case `i + j` is greater than the max value, the hightest bit of the result is 1, which is regraded as a sign bit. Then, the result become a negative number. We can use shift operation `>>>`to fix the problem.
3. Why are the judgment conditions always `<`?
   
   Because the array is sorted in ascending order. It is easier to understand using `<`


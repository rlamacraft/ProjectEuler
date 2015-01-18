__author__ = 'Robert'

import math


# Calculates sum of integer divisors of a given integer, n
def d(n):
    if n == 1:
        return 1
    total = 1
    root_n = int(math.ceil(math.sqrt(n)))
    for eachNum in range(2, root_n):
        if n % eachNum == 0:  # if it divides 'cleanly'
            total += eachNum
            total += n / eachNum
    if root_n * root_n == n:
        total += root_n

    return total


# Finds if a given integer, n, is amicable
def is_amicable(a):
    b = d(a)
    if (d(b) == a) & (b != a):
        return True
    return False


answer = 0
studied_range = 10000

for i in range(1, studied_range):
    if is_amicable(i):
        answer += i

print answer

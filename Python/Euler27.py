__author__ = 'Robert'

import math


# identifies if the given integer, n, is prime
def is_prime(n):
    each_num = 2
    while each_num < math.floor(math.sqrt(n)+1):
        if n % each_num == 0:
            return False
        each_num += 1
    return True


# calculates the value of y for the equation y = n**2 + a*n + b
def f(c, d, n):
    return n**2 + c*n + d


# finds the number of primes, for every x starting from 0
def num_of_primes(c, d):
    n = 0
    while True:
        tmp = f(c, d, n)
        if not is_prime(math.fabs(tmp)):
            break
        n += 1
    return n


highest_value = 0
answer = 0
for a in range(-1000, 1000):
    for b in range(-1000, 1000):
        tmp = num_of_primes(a, b)
        if tmp > highest_value:
            highest_value = tmp
            answer = a * b
print(answer)
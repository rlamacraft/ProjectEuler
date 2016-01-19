import math
import timeit

__author__ = 'Robert'


def proper_divisor(n):
    ret = [1]
    sqrt_n = math.sqrt(n)
    for j in range(2, int(math.ceil(sqrt_n))):
        if n % j == 0:
            ret.append(j)
            ret.append(n/j)
    if (math.floor(sqrt_n) == sqrt_n) & (n != 1):
        ret.append(int(sqrt_n))
    return ret


def is_abundant(n):
    return abundants[n]


def calc_abundant(n):
    if sum(proper_divisor(n)) > n:
        return True
    return False


def is_sum_of_abundant(n):
    for i in range(1, (n/2)+1):
        if (is_abundant(i)) & (is_abundant(n-i)):
            return True
    return False


def all_abundants(n):
    ret = []
    for i in range(0, n):
        if calc_abundant(i):
            ret.append(True)
        else:
            ret.append(False)
    return ret


start = timeit.default_timer()
MAX_VALUE = 28123
abundants = all_abundants(MAX_VALUE)
total = 0
for eachNum in range(1, MAX_VALUE):
    if not is_sum_of_abundant(eachNum):
        total += eachNum
    print ".",
    if eachNum % 100 == 0:
        print "."
print ""
print total
stop = timeit.default_timer()
print stop - start
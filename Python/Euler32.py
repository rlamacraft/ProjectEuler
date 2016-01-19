import functools
import math


# true if a string contains all of the digits 1-9, else false
def is_pandigital(string, num):
    if len(string) != (num - 1):
        return False
    for i in range(1, num):
        if str(i) not in string:
            return False
    return True


# given two ranges x and y, multiples all values in [0, x] by all values in range [0, y]
# outputs string: "x,y,answer"
def all_products_in_range(x, y):
    out = set()
    for i in range(1, x):
        for j in range(1, y):
            calculation_as_string = str(i) + str(j) + str(i * j)
            if is_pandigital(calculation_as_string, 10):
                print(calculation_as_string)
                out.add(i*j)
    print(out)
    print(sum(out))
    return out


def each_range():
    return all_products_in_range(9, 9999) | all_products_in_range(99, 999)


print(sum(each_range()))

# NOT 20882533307, 10313920261, 13433748175
# NOT 21417510, 10640695, 10595467, 471532


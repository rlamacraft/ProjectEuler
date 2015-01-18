__author__ = 'Robert'


def factorial(n):
    output = n

    if n == 0:
        return 1

    for dec in range(n-1, 1, -1):
        output *= dec

    return output


def row_of_pascal_triangle(n):
    output = []
    n_factorial = factorial(n)

    for r in range(0, n+1):
        r_factorial = factorial(r)
        n_minus_r_factorial = factorial(n - r)
        output.append(n_factorial / (r_factorial * n_minus_r_factorial))

    return output


def generate_row(prevRow):
    output = []

    for eachNum in range(0, len(prevRow) - 1):
        output.append(prevRow[eachNum] + prevRow[eachNum + 1])

    print(output)
    return output

prevRow = row_of_pascal_triangle(20)

for eachRow in range(20, 0, -1):
    prevRow = generate_row(prevRow)
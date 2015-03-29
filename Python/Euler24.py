__author__ = 'Robert'

import math

values = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
# values = [0, 1, 2]
num_of_values = 10  # 3
iterations = 0
# max_iterations = math.factorial(10)
max_iterations = 10**10
MILLION = 10**6
FOUR = 4
counter = 0


# increments the values in the array values
def update_values(input_values):
    input_values[num_of_values-1] += 1
    for eachNum in range(num_of_values-1, 1, -1):
        if input_values[eachNum] == num_of_values:
            input_values[eachNum] = 0
            input_values[eachNum-1] += 1
        else:
            break
    if input_values[1] == num_of_values:
        input_values[1] = 0
        input_values[0] += 1
    return input_values


# checks that every digit from 0-9 is in the array values
def all_unique(values):
    checklist = [False, False, False, False, False, False, False, False, False, False]

    # for each number from 1-9, if its in the value array check it off the checklist
    for eachNum in values:
        if checklist[eachNum]:
            return False
        checklist[eachNum] = True

    # check every digit is in the checklist
    # for eachBool in checklist:
    #     if not eachBool:
    #         return False

    return True


while iterations < max_iterations:

    if all_unique(values):
        # print(str(counter) + ": " + str(values))
        counter += 1
        if counter == MILLION:
            print("!!" + str(values))
            break
        if counter % 1000 == 0:
            print(str(int(counter / 1000)) + "/1000")
            print(str(counter) + ": " + str(values))


    values = update_values(values)
    iterations += 1

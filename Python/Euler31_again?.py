from math import floor

# finds all permutations with this coin
def checkCoin(currentState, coin):
    out = []
    for eachState in currentState:
        # print("range: (0, " + str(int(floor(200 / coin)) + 1) + ")")
        for eachIteration in range(0, int(floor(200 / coin)) + 1):
            if eachState + (eachIteration * coin) <= 200:
                out.append(eachState + (eachIteration * coin))
    return(out)


def lessThanTwo():
    currentState = [0]
    coins = [200, 100, 50, 20, 10, 5, 2, 1]
    for eachCoin in coins:
        currentState = checkCoin(currentState, eachCoin)
    return(currentState)


def equalsTwo():
    lessThanTwoValues = lessThanTwo()
    print(lessThanTwoValues)
    count = 0
    for eachNum in lessThanTwoValues:
        if eachNum == 200:
            count += 1
    return(count)


print(equalsTwo())

def f(w):
    return 4*(w**2) - (6*w) + 6
total = 0
eachNum = 3
while eachNum < 1002:
    total += f(eachNum)
    eachNum += 2
print(total+1)
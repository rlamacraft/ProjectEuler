def factorialResult():
    answer = 1
    for i in range(2,100):
        answer = answer*i
    return answer

def sumOfDigits(input):
    total = 0
    for i in range(0,len(input)):
        total = total + ord(input[i])-48
    return total

sFactorial = str(factorialResult())
print(sFactorial)
print(sumOfDigits(sFactorial))

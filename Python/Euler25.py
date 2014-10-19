def nextDigit(a,b):
    return a+b

def Loop():
    fib1 = 1
    fib2 = 1
    fibi = 0
    counter = 1
    while(len(str(fibi))<1000):
        fibi = nextDigit(fib1,fib2)
        fib1 = fib2
        fib2 = fibi
        counter = counter + 1
    counter = counter + 1
    print(counter)

Loop()

#not 4780

def nextValue(n):
    if(n % 2 == 0):
        return n/2
    else:
        return 3*n + 1

def nextCall(n):
    counter = 1
    while(n!=1):
        counter = counter + 1
        n = nextValue(n)
    return(counter)

def PnextCall(n):
    counter = 1
    while(n!=1):
        counter = counter + 1
        n = nextValue(n)
        print(n)
    print(counter)

max_counter = 0
max_index = 0
for i in range(1,1000000):
    var_nextCall = nextCall(i)
    #print(str(i) + ":" + str(var_nextCall))
    if(var_nextCall>max_counter):
        max_counter=var_nextCall
        max_index=i
print(str(max_index))

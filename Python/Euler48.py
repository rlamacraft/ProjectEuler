counter = 0
for i in range(1,1001):
    counter = counter + (i**i)
    if(i==1000):
        print("!!!")
    if(i==0):
        print("???")

for i in range(10):
    print(str(counter)[len(str(counter))-i-1])

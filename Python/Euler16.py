number = str(2**1000)
total = 0
for i in range(0,len(number)):
    total = total + (ord(number[i])-48)
print(total)

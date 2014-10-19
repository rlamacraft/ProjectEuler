names = []
Snames = []
total = 0

#import names from file
input = ""
with open("names.txt") as file:
    for line in file:
        input = line
    file.close()

#find total number of names
numOfNames = 0
for i in range(len(input)):
    if(input[i]==','):
        numOfNames = numOfNames + 1
numOfNames = numOfNames + 1

#fills unsorted array
for i in range(numOfNames):
    names.append(input.split('","')[i])
names[0] = names[0].split('"')[1]
names[numOfNames-1] = names[numOfNames-1].split('"')[0]

#sorts array using selection sort
for i in range(numOfNames):
    min = names[0]
    for j in range(1,len(names)):
        if(names[j] < min):
            min = names[j]
    Snames.append(min)
    names.remove(min)

for i in range(numOfNames):
    letterTotal = 0
    for j in range(len(Snames[i])):
        letterTotal = letterTotal + (ord(Snames[i][j])-64)
    total = total + (letterTotal * (i+1))

print("total = "+str(total))

for i in range(numOfNames):
    if(Snames[i]=="COLIN"):
        print("colin is at"+str(i))
        letterTotal = 0
        for j in range(len(Snames[i])):
            letterTotal = letterTotal + (ord(Snames[i][j])-64)
        print("COLIN's letterTotal is: "+str(letterTotal))

        

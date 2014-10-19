def triNumber(input):
    return((input/2)*(input+1))

def wordValue(input):
    total = 0
    for i in range(len(input)):
        total = total + ord(input[i])-64
    return total

input = []
with open("words.txt") as file:
    for line in file:
        for i in range (0,len(line.split(","))):
            input.append(line.split(",")[i])
    file.close()

total = 0
for i in range(0,len(input)):
    input[i] = input[i].split('"')[1]
    value = wordValue(input[i])
    for j in range(30):
        if(value==triNumber(j)):
            total = total + 1
            
print(total)

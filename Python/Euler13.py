from array import *
import math

input = [""]
counter = 0
values = array('B')
carry = 0
output = ""

#import data from file into array of strings
with open("testFile.txt") as file:
    for line in file:
        input.append(line.split("\n")[0])
    file.close()
print("finished import")

print(len(input[1]))
for digitIndex in range(0,len(input[1])):
    total = 0
    for valueIndex in range(1,len(input)):
        total = total + int(input[valueIndex][len(input[1])-digitIndex-1])
        #print(input[valueIndex][len(input[1])-digitIndex-1])
    total = total + carry
    carry = math.floor(total / 10)
    output = str(total % 10) + output

output = str(math.floor(total/10)) + output
print(output)


#2762981389,3737623039,5533737623

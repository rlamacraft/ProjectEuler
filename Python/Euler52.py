notFound = True
counter = 0
while(notFound):
    counter = counter + 1
    thisExample = True

    digits = []
    #gets digits into array
    for i in range(len(str(counter))):
        digits.append(str(counter)[i])

    for i in range(2,7):
        multipleString = str(counter * i)
        if(len(digits)==len(multipleString)): #if same length
            for j in range(len(digits)):
                mapping = False
                for k in range(len(multipleString)):
                    if(digits[j]==multipleString[k]):
                        mapping = True
                if(mapping==False):
                    thisExample=False
        else:
            thisExample=False
    if(thisExample==False):
        notFound=True
    else:
        notFound=False
print(counter)
                            
    
#142857

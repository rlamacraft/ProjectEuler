list = []
for a in range(2,101):
    for b in range(2,101):
        result = a**b
        exists = False
        for i in range(0,len(list)):
            if(list[i]==result):
                exists=True
        if(exists==False):
            list.append(result)
print(len(list))

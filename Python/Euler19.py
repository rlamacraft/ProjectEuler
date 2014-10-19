year = 0 #i.e. 1901
month = 0 #i.e. January
day = 0 #i.e. the 1st of the month
leap = False
dayName = 1 #i.e. a Tuesday
counter = 0

while(year<100):
    day = day + 1
    if(month==0 or month==2 or month==4 or month==6 or month==7 or month==9 or month==11):
        if(day>30):
            day = 0
            month = month+1
    if(month==3 or month==5 or month==8 or month==10):
        if(day>29):
            day = 0
            month = month+1
    if(month==1 and leap==False):
        if(day>27):
            day = 0
            month = month + 1
    if(month==1 and leap==True):
        if(day>28):
            day = 0
            month = month + 1
    if(month>11):
        month = 0
        year = year + 1

    dayName = dayName + 1
    if(dayName > 6):
        dayName = 0

    if(month==0 and day==0):
        if(year % 4==0):
            leap=True
        else:
            leap=False

    if(day==0 and dayName==6):
        counter = counter + 1
        print(str(counter)+":"+str(day+1)+"/"+str(month+1)+"/"+str(year+1901))

print(str(day+1)+"/"+str(month+1)+"/"+str(year+1901))
print(counter)

#173, 170

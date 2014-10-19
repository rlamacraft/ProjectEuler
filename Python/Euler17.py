#units functions

def _1():
    return 3

def _2():
    return 3

def _3():
    return 5

def _4():
    return 4

def _5():
    return 4

def _6():
    return 3

def _7():
    return 5

def _8():
    return 5

def _9():
    return 4

def _0():
    return 0

units = {1:_1,
         2:_2,
         3:_3,
         4:_4,
         5:_5,
         6:_6,
         7:_7,
         8:_8,
         9:_9,
         0:_0}

#teens

def _10():
    return 3 #ten

def _11():
    return 6 #eleven

def _12():
    return 6 #twelve

def _13():
    return 8 #thirteen

def _14():
    return 8 #fourteen

def _15():
    return 7 #fifteen

def _16():
    return 7 #sixteen

def _17():
    return 9 #seventeen

def _18():
    return 8 #eighteen

def _19():
    return 8 #nineteen

teens = {1:_11,
         2:_12,
         3:_13,
         4:_14,
         5:_15,
         6:_16,
         7:_17,
         8:_18,
         9:_19,
         0:_10}

#tens

def __2():
    return 6 #twenty

def __3():
    return 6 #thirty

def __4():
    return 5 #forty

def __5():
    return 5 #fifty

def __6():
    return 5 #sixty

def __7():
    return 7 #seventy

def __8():
    return 6 #eighty

def __9():
    return 6 #ninety

tens =  {2:__2,
         3:__3,
         4:__4,
         5:__5,
         6:__6,
         7:__7,
         8:__8,
         9:__9}

def calc(value):
    if(value < 10):
        return(units[value]())
    if(value < 20 and value > 9):
        return(teens[ord(str(value)[1])-48]())
    if(value > 19 and value < 100):
        return(tens[ord(str(value)[0])-48]() + units[ord(str(value)[1])-48]())
    if(value > 99):
        result = units[ord(str(value)[0])-48]() + 10
        if(ord(str(value)[1])-48==1): #hundred and teens
            result = result + teens[ord(str(value)[2])-48]()
        if(ord(str(value)[1])-48>1): #hundred and tens
            result = result + tens[ord(str(value)[1])-48]()
        if(ord(str(value)[1])-48>1 or ord(str(value)[1])-48<1):
            result = result + units[ord(str(value)[2])-48]() #hundred and? and units
        if(value % 100 == 0):
            result = result - 3
        return(result)

total = 0
for i in range (1,1000):
    tmp = calc(i)
    total = total + tmp
    #print(tmp)
total = total + 11 #one thousand
#total = total - 27 #'and' for 100,200,300...900
print(total)

#not 21551, 21451, 21100


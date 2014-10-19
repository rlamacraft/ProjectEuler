coins = [20,10,5,2,1]

def Lconfigs(input):
    if(input>=20):
        print("20p")
        Lconfigs(input-20)
    elif(input>=10):
        print("10p")
        Lconfigs(input-10)
    elif(input>=5):
        print("5p")
        Lconfigs(input-5)
    elif(input>=2):
        print("2p")
        Lconfigs(input-2)
    elif(input>=1):
        print("1p")
        Lconfigs(input-1)
    elif(input==0):
        print("done")

def Aconfigs(input):
    for i in range(0,len(coins)):
        if(input>=coins[i]):
            print(coins[i])
            Aconfigs(input-coins[i])
        elif(input==0):
            print("done")

#Lconfigs(50)
Aconfigs(50)

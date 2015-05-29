def numOfSolutions(p):
    count = 0
    visited = []
    for a in range(1,p):
      b = ((p**2)-(2*a*p))/((2*p)-(2*a))
      c = p-a-b
      if round(b)==b and round(c)==c and b>0 and c>0 and (b not in visited) and (c not in visited):
          print(str(a)+", "+str(b)+", "+str(c))
          visited.append(a)
          count += 1
    return count

def answer():
    max = 0
    max_p = 0
    for p in range(1,1001):
        count = numOfSolutions(p)
        if count > max:
            max = count
            max_p = p
    print(max)
    print(max_p)

if __name__ == "__main__":
    answer()

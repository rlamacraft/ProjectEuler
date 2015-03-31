NUM_OF_DIGITS = 5
MAX = 10**10

def digits_total_to_num(n):
  str_value = str(n)
  total = 0
  for eachChar in str_value:
    total += int(eachChar)**NUM_OF_DIGITS
  if total == n:
    return total
  return 0

total = 0
for eachNum in range(2, MAX):
    tmp = digits_total_to_num(eachNum)
    if tmp > 0:
        total += tmp
        print(total)
print(total)

# NOT 248860

# the upper limit is not 10**NUM_OF_DIGITS

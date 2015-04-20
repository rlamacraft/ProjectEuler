--int and list converters
int_to_list 0 l = l
int_to_list n l = int_to_list (n `div` 10) ((n `mod` 10):l)

list_to_int n [] = n
list_to_int n l = list_to_int ((n*10) + head l) (tail l)

-- checks primality of given int
is_prime 1 = False
is_prime x = not $ any divisible $ takeWhile notTooBig [2..] where
    divisible y = x `mod`y == 0
    notTooBig y = y*y <= x

-- reverse a given int
reverse_int x = list_to_int 0 (reverse (int_to_list x []))

-- checks the primality of ints taking from either end
r_to_l_prime 0 = True
r_to_l_prime x = if is_prime x then r_to_l_prime (x `div` 10) else False

l_to_r_prime 0 = True
l_to_r_prime x = if is_prime x then l_to_r_prime (reverse_int (reverse_int(x) `div` 10)) else False

answer 11 total _ = total
answer counter total eachNum = if (r_to_l_prime eachNum && l_to_r_prime eachNum)
  then answer (counter+1) (eachNum + total) (eachNum + 1)
  else answer (counter) (total) (eachNum + 1)

--int and list converters
int_to_list 0 l = l
int_to_list n l = int_to_list (n `div` 10) ((n `mod` 10):l)

list_to_int n [] = n
list_to_int n l = list_to_int ((n*10) + head l) (tail l)


-- checks if a given number is prime
-- is_prime n n = True
-- is_prime n i = if (n `mod` i) == 0 then False else is_prime n (i+1)
--
-- is_prime_wrap n = is_prime n 2
is_prime x = not $ any divisible $ takeWhile notTooBig [2..] where
     divisible y = x `mod`y == 0
     notTooBig y = y*y <= x


--each circular permutation
circ_perm i 0 = True
circ_perm l i = if is_prime (list_to_int 0 l) then
 circ_perm ((tail l)++[(head l)]) (i-1)
 else False

circ_perm_wrap l = circ_perm l (length l)


answer 1 counter = counter
answer n counter = if circ_perm_wrap (int_to_list n []) then answer (n-1) (counter + 1) else answer (n-1) counter

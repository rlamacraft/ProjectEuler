-- this calculates the factorial of a given number, used for calculating the factorial of a given digit
fact 0 = 1
fact x = x * fact ( x - 1)

-- this turns an int into a list of its digits
digits n = map (\x -> read [x] :: Int) (show n)

-- this applies the factorial function to each digit in the list
fact_digits n = map fact (digits n)

-- this finds the sum of those digits: sum_fact_digits 145 = 145
sum_fact_digits n = foldr (+) 0 (fact_digits n)

-- if a number is equal to sum of the factorial of its digits, then it returns a 1 else 0
-- this is used as a multiplier to result in a list of only valid numbers
sfd_equals_n n = if n == sum_fact_digits n then 1 else 0

-- this applies the multiply by zero to all numbers that aren't equal to the sum of the factorial of their digits
sfden_mult n = sfd_equals_n n * n

-- this applies the above function on all numbers in the range (3,n) as 1 and 2 don't count
all_sfden n = map sfden_mult [3,4..n]

-- this finds the sum of the above list
answer n = foldr (+) 0 (all_sfden n) -- for sufficiently large n

alt_answer 2 x = x
alt_answer n x = if n == sum_fact_digits n then alt_answer (n - 1) (x + n) else alt_answer (n - 1) (x)

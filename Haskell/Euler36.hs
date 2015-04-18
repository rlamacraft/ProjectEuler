--int and list converters
int_to_list 0 l = l
int_to_list n l = int_to_list (n `div` 10) ((n `mod` 10):l)

list_to_int n [] = n
list_to_int n l = list_to_int ((n*10) + head l) (tail l)

--decimal to binary conversion
bin_conv 0 l = l
bin_conv n l = bin_conv (n `div` 2) ((n `mod` 2):l)

dec_to_bin n = bin_conv n []

--is palindrome
is_palindrome :: [Int] -> Bool
is_palindrome [] = True
is_palindrome [n] = True
is_palindrome l = if head l == head (reverse l) then is_palindrome ( reverse ( tail (reverse (tail l)))) else False

--numbers that palindromic in both bases 10 and 2
double_palindrome n = if (is_palindrome (int_to_list n [])) && (is_palindrome (dec_to_bin n)) then n else 0

answer 0 c = c
answer n c = answer (n-1) (c + double_palindrome n)

import Data.List
import Data.Char

-- int and list converters
toDigits :: Int -> [Int]
toDigits = map digitToInt . show

fromDigits :: [Int] -> Int
fromDigits = foldl addDigit 0
   where addDigit num d = 10*num + d

append xs ys = foldr (:) ys xs

-- generates the number up to the inclusion of n
generate_num :: Int -> [Int] -> [Int]
generate_num n l
  | n == 0    = l
  | otherwise = generate_num (n-1) (append (toDigits n) l)

find_digit n l c
  | length l > n  = l !! (n-1)
  | otherwise     = find_digit n (append l (toDigits c)) (c+1)

the_answer =  (find_digit 1 [] 1) * (find_digit 10 [] 1) * (find_digit 100 [] 1) *
              (find_digit 1000 [] 1) * (find_digit 10000 [] 1) * (find_digit 100000 [] 1)

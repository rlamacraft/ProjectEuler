import Data.List
import Data.Char
import Control.Monad

-- primality checking
is_prime 1 = False
is_prime x = not $ any divisible $ takeWhile notTooBig [2..] where
    divisible y = x `mod`y == 0
    notTooBig y = y*y <= x

-- int and list converters
toDigits :: Int -> [Int]
toDigits = map digitToInt . show

fromDigits :: [Int] -> Int
fromDigits = foldl addDigit 0
   where addDigit num d = 10*num + d

all_perms :: Int -> [Int]
all_perms n = map fromDigits $ permutations $ toDigits n

remove_composite :: [Int] -> [Int]
remove_composite [] = []
remove_composite (y:ys)
    | is_prime y  = y : remove_composite ys
    | otherwise   = remove_composite ys

arith_sequence_values :: [Int] -> [Int]
arith_sequence_values l = if (z - y == y - x) && (y - x > 0) && x > 999 && y > 999 && z > 999 then [x,y,z] else [] where
  x = head l
  y = head $ tail l
  z = head $ tail $ tail l

check_arith_sequence :: [Int] -> Bool
check_arith_sequence l = if (z - y == y - x) && (y - x > 0) && x > 999 && y > 999 && z > 999 then True else False where
  x = head l
  y = head $ tail l
  z = head $ tail $ tail l

is_answer n = map check_arith_sequence (replicateM 3 ( remove_composite $ all_perms n))

find_sequences n = map arith_sequence_values (replicateM 3 ( remove_composite $ all_perms n))

answer :: Int -> [Int]
answer 10000 = []
answer n = if elem True (is_answer n) then [n] ++ answer (n+1) else answer (n+1)

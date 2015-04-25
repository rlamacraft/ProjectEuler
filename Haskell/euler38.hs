import Data.List
import Data.Char

-- int and list converters
toDigits :: Int -> [Int]
toDigits = map digitToInt . show

fromDigits :: [Int] -> Int
fromDigits = foldl addDigit 0
   where addDigit num d = 10*num + d

append xs ys = foldr (:) ys xs


-- checks if a given list of digits is pandigital, use with toDigits to input an int
isPandigital x = if sort x == [1,2,3,4,5,6,7,8,9] then True else False


-- finds if a given int seeds an pandigital
findPandigital :: Int -> [Int] -> Int -> Int
findPandigital num output counter
  | length output > 9   = 0
  | isPandigital output = fromDigits output
  | otherwise = findPandigital
                  num
                  (append output (toDigits (num * counter)))
                  (counter + 1)

findPandigital_wrap n = findPandigital n [] 1


--checks all numbers < 999,999 (random upper-bound guess) to find the largest pandigital
answer :: Int -> Int -> Int
answer counter max
  | counter > 999999                   = max
  | max < findPandigital_wrap counter  = answer (counter + 1) (findPandigital_wrap counter)
  | max >= findPandigital_wrap counter = answer (counter + 1) max

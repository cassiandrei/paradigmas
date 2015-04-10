firstName :: String -> String
firstName [] = []
firstName x = if (head x) /= ' ' then head x : firstName (tail x) else []

firstName' :: String -> String
firstName' x = takeWhile (/= ' ') x

--lastName :: String -> String
--lastName x = if (last x) /= ' ' then last x : lastName (init x) else []
--lastName :: String -> String
--lastName x = reverse x
 -- |(last x) /= ' ' = last x : lastName (init x)
 -- |otherwise = []

lastName :: String -> String
lastName x 
	| filter (==' ')  x == [] = x
	| otherwise = lastName (tail x)
	
userName :: String -> String
userName x = head x : filter(/=' ')(dropWhile(/=' ')x)

isElem :: Int -> [Int] -> Bool
isElem x y
	|y == [] = False
	|x /= (head y) = isElem x (tail y)
	|x == (head y) = True

--7
voGais :: String -> Int
voGais [] = 0
voGais x = if (head x) == 'a' || (head x) == 'e' || (head x) == 'i' || (head x) == 'o' || (head x) == 'u' then 1 + voGais (tail x) else 0 + voGais (tail x)

--8
consoantes :: String -> Int
consoantes x = length(filter(/='u')(filter(/='o')(filter(/='i')(filter(/='e')(filter(/='a')x)))))

--10
strToInt :: String -> Int
strToInt x = (map (+48) x)
strToInt x = sum(zipWith x [100, 10, 1])



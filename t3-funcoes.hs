import Data.Char

--1
firstName :: String -> String
firstName [] = []
firstName x = if (head x) /= ' ' then head x : firstName (tail x) else []
--2
firstName' :: String -> String
firstName' x = takeWhile (/= ' ') x
--3
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
--4	
userName :: String -> String
userName x = map toLower(head x : reverse(takeWhile(/=' ')(reverse (tail x))))

--5
encodeName :: String -> String
encodeName s = 
	let change x
		| x == 'a' = "4"
		| x == 'e' = "3"
		| x == 'i' = "1"
		| x == 'o' = "0"
		| otherwise = [x]
	in concat(map (change) s)

--6
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

--9
isInt :: String -> Bool
isInt x = if any (>'9')x then False else True

--10
strToInt :: String -> Int
strToInt x = sum( zipWith(*) (reverse(map digitToInt x)) (map(10^)[0..]))


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
	

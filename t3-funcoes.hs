firstName :: String -> String
firstName [] = []
firstName x = if (head x) /= ' ' then head x : firstName (tail x) else []

firstName' :: String -> String
firstName' x = takeWhile (/= ' ') x


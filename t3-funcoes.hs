firstName :: String -> String
firstName [] = []
firstName x = if (head x) /= ' ' then head x : firstName (tail x) else []

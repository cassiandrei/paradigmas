firstName :: String -> String
--firstName " " = []
firstName [] = []
--firstName x = head x : firstName (tail x)
firstName x = if (head x) /= ' ' then head x : firstName (tail x) else []

firstName :: String -> String
firstName [] = []
firstName x = head x : tail x

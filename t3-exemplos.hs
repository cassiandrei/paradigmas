--any - Função se testa se existem somente numeros na string
isInt :: String -> Bool
isInt x = if any (>'9')x then False else True
--all - função que testa se todos numeros sao maiores que 10
maior :: [Int] -> Bool
maior x = if all (>10)x then True else False
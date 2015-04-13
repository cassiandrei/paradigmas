import Data.Char

userName :: String -> String
userName x = map toLower(head x : reverse(takeWhile(/=' ')(reverse (tail x))))

main :: IO ()
main = do
    strcontent <- readFile "nomes.csv"
    let strlist = lines strcontent
        strnew = zipWith(++) (map(++",")strlist) (map (userName) strlist)
    writeFile "logins.csv" (unlines strnew) 

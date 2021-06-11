# Tail and head recursion
The scale for tail and head recursion is where the recursive call in the function is. 

If the recursive call is after all other statements in the function, we have a tail recursion.
If the recursive call is before all other statements in the function, we have a head recursion.

Benefits:\
Tail recursion:\
if you want to call the function several times recursively and execute statements before each call.\
Statements will be executed in the same direction of the function recursive calls. Statements of the first called function until the last one.\
Head recursion:\
if you want to call the function several times recursively but execute the statements after all calls are made.\
Statements will be executed in the opposite direction of the function recursive calls. Statements of the last called function until the first one.

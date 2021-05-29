# Tail and head recursion
The scale for tail and head recursion is where the recursive call in the fucntion is. 

If the recursive call is after all other statements in the function, we have a tail recursion.
If the recursive call is before all other statements in the function, we have a head recursion.

Benefits:\
Tail recusion:\
if you want to call the function several times recusively and execute statments before each call.\
Statements will be executed in the same direction of the function recursive calls. Statements of the first called function untill the last one.\
Head recusion:\
if you want to call the function several times recursively but execute the statements after all calls are made.\
Statements will be executed in the opposite direction of the function recursive calls. Statements of the last called function untill the first one.

# PlatformerGame
### By: EnderBane

This project will include a simple platformer game with basic graphics. 
The game will be designed with Java Swing graphics and not use any external libraries not included directly with java.
The purpose of this project is to accustom me to the Github flow, and become more fluent with java.
I am also practicing setting up a more complex file system to make the project more structured.

One piece of code that I did not create myself is the overlap method for entities, which I got from Eloquent Javascript (great book) and adaped it into Java.
''' java
return actor1.pos.x + actor1.size.x > actor2.pos.x &&
            actor1.pos.x < actor2.pos.x + actor2.size.x &&
            actor1.pos.y + actor1.size.y > actor2.pos.y &&
            actor1.pos.y < actor2.pos.y + actor2.size.y;
'''
If you are interested in looking into this book, you can find it here: [Eloquent Javascript](https://eloquentjavascript.net)

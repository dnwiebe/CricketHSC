#1.1 Open State Only
###Accept single-hit tosses, score section points for each toss, Game Over is true when one score is higher, winner is higher scorer.

Ignore opening and closing procedures; every toss is a single hit.

------

#1.2 Initial State
###Require 3 single hits (no doubles or triples yet) to open a section for a player.

Players can only score on sections they open; sections are never closed. Determination of game end and winner are unchanged.

------

#1.3 Closed State
###3 single hits on an open section (no doubles or triples yet) from the opener's opponent will close the section and disallow scoring in that section for the rest of the game.

Determination of game end and winner is unchanged.

------

#MVP
###Congratulations! You have a Minimum Viable Product.

This could be released, and its users coached to ignore game-end information and handle doubles and triples as repeated tosses to the same section. Continue in Section 2.x.

------

#2.1 Game Over, Winner
###Declare Game Over if and only if all sections are closed. Winner, if any, is player with greater score.

If all sections are closed and both players have the same score, there is no winner, but the game is still over.

------

#2.2 Doubles and Triples
###Each toss can produce one, two, or three hits on its section, including the bullseye.

For the first time, tosses and hits acquire separate identities. The bullseye will be limited to singles and doubles only in a future story, but allow triples for now.

------

#2.3 No Triple Bullseye
###The bullseye can be doubled, but not tripled.

A triple toss on any other section is accepted, but a triple toss on the bullseye should generate a complaint.

------

#2.4 Misses
###Missed tosses are recorded along with hit ones.

Up until now, a miss was indistinguishable from a pass. Now, misses are part of the input. No need to distinguish between complete misses and hits on unused sections 1-14.

------

#2.5 Turns
###Disallow turns of more than three tosses.

Turns can be less than three recorded tosses (for example, if the player either passes or misses), but more than three consecutive tosses from the same player generates a complaint.

------

#2.6 Game Limit
###Reject tosses after game is over.

Once all sections are closed, a further toss should generate a complaint. However, for example, a triple toss when only two hits are needed to close the last section should be accepted without comment.

------

#Cricket Rules for CSE 12/14/2015

###Technical Terms
A **toss** is the trip a dart makes from the player's hand to the
dartboard. (“Toss” rather than “throw” because “throw” is a reserved word in
Scala.)

A **hit** is one of the game-state consequences that
flows from that toss.

The following are game rules, not user stories. Don't draw your task sequence
from here; draw it from your story-card deck. Use these rules to interpret your
story cards, if necessary.

1. Only the board sections 15-20 and the bullseye are used.

1. There are two players, who alternate turns. Each player may toss up to
three darts for his turn, but may also choose to waive up to two.

1. Each toss may count for zero to three hits: zero for a miss; and one, two,
or three for tosses in the single-, double-, and triple-score parts of the
section.

1. During the course of the game, each board section goes through three
states: Initial, Open, and Closed.

1. In the Initial state, a section scores no points for any player. The first
player to hit that section three times opens it for himself.

1. When Section N is Open for a player, each hit in that section by that
player scores N points. A hit on the bullseye scores 25 points. The
bullseye has no triple-score part. No points can be scored by the other
player, but three hits from the other player makes the section Closed.

1. In the Closed state, a section scores no points for any player.

1. The game is over when all sections are Closed.

1. When the game is over, the winner, if any, is the Player with the highest
score. If the score is tied, there is no winner.

###Program Requirements
No user interface is required; only a test-driven API. After your program has
accepted zero or more dart tosses, it should be able to answer the following
questions:

1. Is the game over?

1. Is there a winner? If so, is it Player 1 or Player 2?

1. What is Player 1's score?

1. What is Player 2's score?
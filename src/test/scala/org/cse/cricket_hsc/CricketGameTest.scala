package org.cse.cricket_hsc

import org.scalatest.path

/**
  * Created by dnwiebe on 12/13/15.
  */
class CricketGameTest extends path.FunSpec {
  describe ("A new Cricket game") {
    val newGame = new CricketGame ()

    answersQuestionsProperly (newGame, false, None, 0, 0)

    describe ("after accepting a single-hit toss from Player 1 in Section 17") {
      val turn1Toss1 = newGame.acceptToss (1, 17, 1)

      answersQuestionsProperly (turn1Toss1, true, Some (1), 17, 0)
    }
  }

  private def answersQuestionsProperly (game: CricketGame, isGameOver: Boolean, winner: Option[Int],
                                       player1Score: Int, player2Score: Int): Unit = {
    it (s"shows that the game is ${if (isGameOver) "" else "not "}over") {
      assert (game.isGameOver === isGameOver)
    }

    it (s"shows that the winner is ${winnerName (winner)}") {
      assert (game.winner === winner)
    }

    it (s"shows Player 1's score as ${player1Score}") {
      assert (game.playerScore (1) === player1Score)
    }

    it (s"shows Player 2's score as ${player2Score}") {
      assert (game.playerScore (2) === player2Score)
    }
  }

  private def winnerName (winner: Option[Int]): String = {
    winner match {
      case None => "undetermined"
      case Some (playerNumber) => s"Player ${playerNumber}"
    }
  }
}

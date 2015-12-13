package org.cse.cricket_hsc

/**
  * Created by dnwiebe on 12/13/15.
  */
class CricketGame {
  def acceptToss (playerNumber: Int, sectionNumber: Int, hits: Int): CricketGame = this

  def playerScore (playerNumber: Int): Int = 0
  def isGameOver: Boolean = false
  def winner: Option[Int] = None
}

/*
 * Creates the class for exact value of hand
 *
 * @author  Michael Bruneau
 * @version 1.0
 * @since   2026-01-07
 */

// get constants
import ConstantsPackage.Constants;

 public class ExactValue {
    /**
     * holds flush score if player/NPC has a flush.
     */
    private int flushScore;

    /**
     * holds the all players/NPC cards and table cards.
     */
    private int[] fullHand;

    /**
     * holds the all players/NPC cards and table cards but if ace then it's a 1.
     */
    private int[] alternateFullHand;

    /**
     * holds all pair scores that player/NPC has.
     */
    private int[] pairScores;

    /**
     * holds all straight and straight flush scores that player/NPC has.
     */
    private int[] straightScores;

    /**
     * gets flushScore.
     *
     * @return flushScore
     */
    public int getFlushScore() {
        return this.flushScore;
    }

    /**
     * gets fullHand.
     *
     * @return fullHand
     */
    public int[] getFullHand() {
        return this.fullHand;
    }

    /**
     * gets alternateFullHand.
     *
     * @return alternateFullHand
     */
    public int[] getAlternateFullHand() {
        return this.alternateFullHand;
    }

    /**
     * gets pairScores.
     *
     * @return pairScores
     */
    public int[] getPairScores() {
        return this.pairScores;
    }

    /**
     * gets straightScores.
     *
     * @return straightScores
     */
    public int[] getStraightScores() {
        return this.straightScores;
    }

    /**
     * sets flushScore.
     *
     * @param setFlushScore
     */
    public void setFlushScore(final int setFlushScore) {
        this.flushScore = setFlushScore;
    }

    /**
     * sets fullHand.
     *
     * @param setFullHand
     */
    public void setFullHand(final int[] setFullHand) {
        this.fullHand = setFullHand;
    }

    /**
     * sets alternateFullHand.
     *
     * @param setAlternateFullHand
     */
    public void setAlternateFullHand(final int[] setAlternateFullHand) {
        this.alternateFullHand = setAlternateFullHand;
    }

    /**
     * sets pairScores.
     *
     * @param setPairScores
     */
    public void setPairScores(final int[] setPairScores) {
        this.pairScores = setPairScores;
    }

    /**
     * sets straightScores.
     *
     * @param setStraightScores
     */
    public void setStraightScores(final int[] setStraightScores) {
        this.straightScores = setStraightScores;
    }

    /**
     * Method creates full hand array to check all hand ranks.
     * 
     * @param cardsHeld
     * @param tableCards
     */
    public void createFullHand(final int[] cardsHeld, final int[] tableCards) {
        // variables
        int[] tempFullHand;

        /*
         * when making full hand we put the suits in of each card in the second
         * of the array to make it easier to track
         */
        for (index = 0; index < Constants.SUIT_OFFSET_FOR_CARDS_HELD; index++) {
            tempFullHand[index] = cardsHeld[index];
            tempFullHand[index + Constants.SUIT_OFFSET_FOR_FULL_HAND]
            + cardsHeld[index + Constants.SUIT_OFFSET_FOR_CARDS_HELD];
        }
    }
 }

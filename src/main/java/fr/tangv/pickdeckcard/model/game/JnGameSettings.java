package fr.tangv.pickdeckcard.model.game;

public interface JnGameSettings extends GameSettings {
    int getStartingNumberHearthCard();
    int getStartingNumberAttackCard();
    int getNumberHearthInMainDeck();
    boolean hasBoostedOneInHearthDeck();
    boolean hasBlackOneCardCanBeShield();
    int getShieldDurability();
    boolean isAllowedSumAttack();
    int getSumAttackMax();
}
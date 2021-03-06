package Java.CardTypes;

import java.util.Collection;

import Java.Player.Player;

public interface Card {

    Collection<CardTypes> getCardTypes();

    void setCardTypes(Collection<CardTypes> cardTypes);

    String getName();

    void setName(String name);

    Player getOwner();

    void setOwner(Player owner);

    Player getController();

    void setController(Player controller);
}

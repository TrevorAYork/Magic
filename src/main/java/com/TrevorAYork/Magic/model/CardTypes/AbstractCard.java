package com.TrevorAYork.Magic.model.CardTypes;

import java.util.ArrayList;
import java.util.Collection;

import com.TrevorAYork.Magic.model.Player.Player;

public abstract class AbstractCard implements Card {

    protected String name;
    private Collection<CardTypes> cardTypes;
    private Player owner;
    private Player controller;

    public AbstractCard(String name, Player owner, Player controller) {
        this.name = name;
        this.cardTypes = new ArrayList<>();
        this.owner = owner;
        this.controller = controller;
    }

    public Collection<CardTypes> getCardTypes() {
        return cardTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCardTypes(Collection<CardTypes> cardTypes) {
        this.cardTypes = cardTypes;
    }

    public Player getOwner() {
        return this.owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public Player getController() {
        return this.controller;
    }

    public void setController(Player controller) {
        this.controller = controller;
    }
}

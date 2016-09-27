package Java.Ablilitys.ActivatedAbilites;

import java.util.Collection;

public interface HasActivatedAbility {
    void useAbility(int activatedAbility);

    void addAbility(ActivatedAbility activatedAbility);

    void removeAbility(ActivatedAbility activatedAbility);

    Collection<ActivatedAbility> getActivatedAbilities();
}

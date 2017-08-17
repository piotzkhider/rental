package main.rental.movie;

import main.rental.charge.ChargeRule;
import main.rental.charge.Children;
import main.rental.charge.NewRelease;
import main.rental.charge.Regular;

public enum ChargeType {
    REGULAR(new Regular()),
    NEW_RELEASE(new NewRelease()),
    CHILDREN(new Children());

    ChargeRule chargeRule;

    ChargeType(ChargeRule chargeRule){
        this.chargeRule = chargeRule;
    }

    ChargeRule rule() {
        return chargeRule;
    }
}

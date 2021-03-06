package com.teamacronymcoders.contenttweaker.api.ctobjects.enums;

import com.teamacronymcoders.contenttweaker.api.ICTObject;
import crafttweaker.annotations.ZenRegister;
import net.minecraft.util.EnumHand;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenGetter;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenRegister
@ZenClass("mods.contenttweaker.Hand")
public class Hand implements ICTObject<EnumHand> {
    private EnumHand hand;

    private Hand(EnumHand enumHand) {
        this.hand = enumHand;
    }

    public static Hand of(EnumHand enumHand) {
        return new Hand(enumHand);
    }

    @ZenMethod
    public static Hand main() {
        return new Hand(EnumHand.MAIN_HAND);
    }

    @ZenMethod
    public static Hand off() {
        return new Hand(EnumHand.OFF_HAND);
    }

    @Override
    public EnumHand getInternal() {
        return this.hand;
    }
}

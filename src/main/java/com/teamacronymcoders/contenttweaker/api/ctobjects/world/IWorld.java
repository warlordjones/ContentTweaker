package com.teamacronymcoders.contenttweaker.api.ctobjects.world;

import com.teamacronymcoders.contenttweaker.api.ICTObject;
import com.teamacronymcoders.contenttweaker.api.ctobjects.blockpos.IBlockPos;
import com.teamacronymcoders.contenttweaker.api.ctobjects.blockstate.ICTBlockState;
import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.block.IBlock;
import crafttweaker.api.world.IBiome;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenGetter;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenRegister
@ZenClass("mods.contenttweaker.World")
public interface IWorld extends ICTObject<World> {
    @ZenMethod
    @ZenGetter("remote")
    boolean isRemote();

    @ZenMethod
    @ZenGetter("raining")
    boolean isRaining();

    @ZenMethod
    @ZenGetter("thundering")
    boolean isThundering();

    @ZenMethod
    boolean setBlockState(ICTBlockState blockState, IBlockPos blockPos);

    @ZenMethod
    ICTBlockState getBlockState(IBlockPos blockPos);

    @ZenMethod
    IBiome getBiome(IBlockPos blockPos);

    @ZenMethod
    @ZenGetter("moonPhase")
    int getMoonPhase();

    @ZenMethod
    @ZenGetter("dayTime")
    boolean isDayTime();

    @ZenMethod
    @ZenGetter("time")
    long getWorldTime();

    @ZenMethod
    @ZenGetter("type")
    String getWorldType();

    @ZenMethod
    @ZenGetter("dimension")
    int getDimension();

    @ZenMethod
    @ZenGetter("surfaceWorld")
    boolean isSurfaceWorld();

    @ZenMethod
    @ZenGetter("dimensionType")
    String getDimensionType();
}

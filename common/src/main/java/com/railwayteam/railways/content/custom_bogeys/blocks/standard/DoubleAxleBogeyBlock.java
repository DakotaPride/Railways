package com.railwayteam.railways.content.custom_bogeys.blocks.standard;

import com.railwayteam.railways.content.custom_bogeys.blocks.base.CRBogeyBlock;
import com.railwayteam.railways.registry.CRBogeyStyles;
import com.simibubi.create.content.trains.bogey.BogeySizes;
import net.minecraft.world.phys.Vec3;

public class DoubleAxleBogeyBlock extends CRBogeyBlock {
    public DoubleAxleBogeyBlock(Properties props) {
        super(props, CRBogeyStyles.PASSENGER, BogeySizes.SMALL);
    }

    @Override
    public Vec3 getConnectorAnchorOffset() {
        return new Vec3(0, 7 / 32f, 32 / 32f);
    }
}

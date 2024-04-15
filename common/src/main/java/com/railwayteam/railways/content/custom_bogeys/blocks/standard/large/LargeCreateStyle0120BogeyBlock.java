package com.railwayteam.railways.content.custom_bogeys.blocks.standard.large;

import com.railwayteam.railways.content.custom_bogeys.blocks.base.size.LargeBogeyBlock;
import com.railwayteam.railways.registry.CRBogeyStyles;
import com.simibubi.create.content.trains.bogey.BogeySizes;
import net.minecraft.world.phys.Vec3;

public class LargeCreateStyle0120BogeyBlock extends LargeBogeyBlock {
    public LargeCreateStyle0120BogeyBlock(Properties props) {
        super(props, CRBogeyStyles.LARGE_CREATE_STYLED_0_12_0, BogeySizes.LARGE);
    }

    @Override
    public Vec3 getConnectorAnchorOffset() {
        return new Vec3(0, 7 / 32f, 172 / 32f);
    }

    @Override
    public double getWheelPointSpacing() {
        return 6;
    }
}

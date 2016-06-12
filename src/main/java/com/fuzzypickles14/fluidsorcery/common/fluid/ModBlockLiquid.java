package com.fuzzypickles14.fluidsorcery.common.fluid;


import com.fuzzypickles14.fluidsorcery.common.core.FluidSorceryCreativeTab;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by Andrew Toomey on 2/15/2016.
 */
public abstract class ModBlockLiquid extends BlockFluidClassic {
    String name;
    private float redColor = 1.0F;
    private float blueColor = 1.0F;
    private float greenColor = 1.0F;

    private boolean canDisplaceFluids = false;

    public ModBlockLiquid(Fluid fluid, Material material) {
        super(fluid, material);

        displacements.put(this, false);
        this.setRegistryName(fluid.getName());
        this.setUnlocalizedName(fluid.getName());
        this.setCreativeTab(FluidSorceryCreativeTab.instance);

    }

    public ModBlockLiquid setParticleColor(int c) {
        return setParticleColor(((c >> 16) & 255) / 255f, ((c >> 8) & 255) / 255f, ((c) & 255) / 255f);
    }

    public ModBlockLiquid setParticleColor(float redPart, float greenPart, float bluePart) {
        this.redColor = redPart;
        this.greenColor = greenPart;
        this.blueColor = bluePart;

        return this;
    }

    public ModBlockLiquid setDisplace(boolean a) {
        this.canDisplaceFluids = a;
        return this;
    }
}

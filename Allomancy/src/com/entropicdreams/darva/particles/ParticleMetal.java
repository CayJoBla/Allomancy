package com.entropicdreams.darva.particles;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;

public class ParticleMetal extends EntityFX {

	public ParticleMetal(World par1World, double par2, double par4,
			double par6, double par8, double par10, double par12) {
		super(par1World, par2, par4, par6, par8, par10, par12);
		// TODO Auto-generated constructor stub
	
		this.setParticleTextureIndex(80);
		this.motionX = par8;
		this.motionY = par10;
		this.motionZ = par12;
	}
	

}

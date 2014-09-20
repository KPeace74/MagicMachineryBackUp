package com.kpeace74.magicmachinery.worldgen;

import java.util.Random;

import com.kpeace74.magicmachinery.init.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenFountain extends WorldGenerator {

    public boolean generate(World world, Random Random, int x, int y, int z)
    {
        while (world.isAirBlock(x, y, z) && y > 2)
        {
            --y;
        }
        for (int i = 2; i < 5; i++) {
        world.setBlock(x + i, y, z - 1, Blocks.stonebrick);
        world.setBlock(x + i, y, z, Blocks.stonebrick);
        world.setBlock(x + i, y, z + 1, Blocks.stonebrick);
        world.setBlock(x - i, y, z - 1, Blocks.stonebrick);
        world.setBlock(x - i, y, z, Blocks.stonebrick);
        world.setBlock(x - i, y, z + 1, Blocks.stonebrick);
        world.setBlock(x - 1, y, z + i, Blocks.stonebrick);
        world.setBlock(x, y, z + i, Blocks.stonebrick);
        world.setBlock(x + 1, y, z + i, Blocks.stonebrick);
        world.setBlock(x - 1, y, z - i, Blocks.stonebrick);
        world.setBlock(x, y, z - i, Blocks.stonebrick);
        world.setBlock(x + 1, y, z - i, Blocks.stonebrick);
        world.setBlock(x + i, y, z - 2, Blocks.stonebrick);
        world.setBlock(x + i, y, z - 3, Blocks.stonebrick);
        world.setBlock(x + i, y, z - 4, Blocks.stonebrick);
        world.setBlock(x + i, y, z + 2, Blocks.stonebrick);
        world.setBlock(x + i, y, z + 3, Blocks.stonebrick);
        world.setBlock(x + i, y, z + 4, Blocks.stonebrick);
        world.setBlock(x - i, y, z - 2, Blocks.stonebrick);
        world.setBlock(x - i, y, z - 3, Blocks.stonebrick);
        world.setBlock(x - i, y, z - 4, Blocks.stonebrick);
        world.setBlock(x - i, y, z + 2, Blocks.stonebrick);
        world.setBlock(x - i, y, z + 3, Blocks.stonebrick);
        world.setBlock(x - i, y, z + 4, Blocks.stonebrick);
        }
        
        for (int i = 2; i < 5; i++) {
        world.setBlock(x + i, y + 5, z - 1, Blocks.stone_slab, 13, 2);
        world.setBlock(x + i, y + 5, z, Blocks.stone_slab, 13, 2);
        world.setBlock(x + i, y + 5, z + 1, Blocks.stone_slab, 13, 2);
        world.setBlock(x - i, y + 5, z - 1, Blocks.stone_slab, 13, 2);
        world.setBlock(x - i, y + 5, z, Blocks.stone_slab, 13, 2);
        world.setBlock(x - i, y + 5, z + 1, Blocks.stone_slab, 13, 2);
        world.setBlock(x - 1, y + 5, z + i, Blocks.stone_slab, 13, 2);
        world.setBlock(x, y + 5, z + i, Blocks.stone_slab, 13, 2);
        world.setBlock(x + 1, y + 5, z + i, Blocks.stone_slab, 13, 2);
        world.setBlock(x - 1, y + 5, z - i, Blocks.stone_slab, 13, 2);
        world.setBlock(x, y + 5, z - i, Blocks.stone_slab, 13, 2);
        world.setBlock(x + 1, y + 5, z - i, Blocks.stone_slab, 13, 2);
        world.setBlock(x + i, y + 5, z - 2, Blocks.stone_slab, 13, 2);
        world.setBlock(x + i, y + 5, z - 3, Blocks.stone_slab, 13, 2);
        world.setBlock(x + i, y + 5, z - 4, Blocks.stone_slab, 13, 2);
        world.setBlock(x + i, y + 5, z + 2, Blocks.stone_slab, 13, 2);
        world.setBlock(x + i, y + 5, z + 3, Blocks.stone_slab, 13, 2);
        world.setBlock(x + i, y + 5, z + 4, Blocks.stone_slab, 13, 2);
        world.setBlock(x - i, y + 5, z - 2, Blocks.stone_slab, 13, 2);
        world.setBlock(x - i, y + 5, z - 3, Blocks.stone_slab, 13, 2);
        world.setBlock(x - i, y + 5, z - 4, Blocks.stone_slab, 13, 2);
        world.setBlock(x - i, y + 5, z + 2, Blocks.stone_slab, 13, 2);
        world.setBlock(x - i, y + 5, z + 3, Blocks.stone_slab, 13, 2);
        world.setBlock(x - i, y + 5, z + 4, Blocks.stone_slab, 13, 2);
        }
        
        for (int i = 1; i < 6; i++) {
        	world.setBlock(x + 4, y + i, z + 4, Blocks.stonebrick);
        	world.setBlock(x + 4, y + i, z - 4, Blocks.stonebrick);
        	world.setBlock(x - 4, y + i, z + 4, Blocks.stonebrick);
        	world.setBlock(x - 4, y + i, z - 4, Blocks.stonebrick);
        }
        
        world.setBlock(x + 4, y + 5, z + 3, Blocks.stone_brick_stairs, 6, 2);
        world.setBlock(x + 4, y + 5, z - 3, Blocks.stone_brick_stairs, 7, 2);
        world.setBlock(x -3, y + 5, z + 4, Blocks.stone_brick_stairs, 5, 2);
        world.setBlock(x -3, y + 5, z - 4, Blocks.stone_brick_stairs, 5, 2);
        world.setBlock(x + 3, y + 5, z + 4, Blocks.stone_brick_stairs, 4, 2);
        world.setBlock(x + 3, y + 5, z - 4, Blocks.stone_brick_stairs, 4, 2);
        world.setBlock(x - 4, y + 5, z + 3, Blocks.stone_brick_stairs, 6, 2);
        world.setBlock(x - 4, y + 5, z - 3, Blocks.stone_brick_stairs, 7, 2);
        world.setBlock(x + 3, y + 5, z + 3, Blocks.stone_brick_stairs, 12, 2);
        world.setBlock(x + 3, y + 5, z - 3, Blocks.stone_brick_stairs, 12, 2);
        world.setBlock(x - 3, y + 5, z + 3, Blocks.stone_brick_stairs, 13, 2);
        world.setBlock(x - 3, y + 5, z - 3, Blocks.stone_brick_stairs, 13, 2);
        
        for (int i = -2; i < 3; i++) {
        	world.setBlock(x + 2, y + 6, z + i, Blocks.stone_brick_stairs, 1, 2);
        	world.setBlock(x - 2, y + 6, z + i, Blocks.stone_brick_stairs);
        	world.setBlock(x + i, y + 6, z + 2, Blocks.stone_brick_stairs, 3, 2);
        	world.setBlock(x + i, y + 6, z - 2, Blocks.stone_brick_stairs, 2, 2);
        }
        
        for (int i = -1; i < 2; i++) {
        	world.setBlock(x + 1, y + 7, z + i, Blocks.stone_slab, 5, 2);
        	world.setBlock(x, y + 7, z + i, Blocks.stone_slab, 5, 2);
        	world.setBlock(x - 1, y + 7, z + i, Blocks.stone_slab, 5, 2);
        }
        
        for (int i = -1; i < 2; i++) {
        	world.setBlock(x + 2, y - 1, z + i, Blocks.glowstone);
        	world.setBlock(x - 2, y - 1, z + i, Blocks.glowstone);
        	world.setBlock(x + i, y - 1, z + 2, Blocks.glowstone);
        	world.setBlock(x + i, y - 1, z - 2, Blocks.glowstone);
        }
        
        
        
        for (int i = -1; i < 2; i++) {
        	world.setBlock(x + 1, y + 6, z + i, Blocks.water);
        	world.setBlock(x, y + 6, z + i, Blocks.water);
        	world.setBlock(x - 1, y + 6, z + i, Blocks.water);
        	world.setBlockToAir(x + 1, y, z + i);
        	world.setBlockToAir(x, y, z + i);
        	world.setBlockToAir(x - 1, y, z + i);
        	world.setBlockToAir(x + 1, y - 1, z + i);
        	world.setBlockToAir(x, y - 1, z + i);
        	world.setBlockToAir(x - 1, y - 1, z + i);
        	world.setBlockToAir(x + 1, y - 2, z + i);
        	world.setBlockToAir(x, y - 2, z + i);
        	world.setBlockToAir(x - 1, y - 2, z + i);
        }
        

        
	    return true;
    }

}

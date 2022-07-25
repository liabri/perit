package org.liabri.perit.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class SpikesBlock extends net.minecraft.block.Block {
    public SpikesBlock(Settings settings) {
        super(settings);
        this.getDefaultState().with(FacingBlock.FACING, Direction.UP);
    }
//
    public static final VoxelShape shapeUp = createCuboidShape(3.0, 0.0, 3.0, 13.0, 12.0, 13.0);
    private static final VoxelShape shapeDown = createCuboidShape(3.0, 4.0, 3.0, 13.0, 16.0, 13.0);
    private static final VoxelShape shapeNorth = createCuboidShape(3.0, 3.0, 4.0, 13.0, 13.0, 16.0);
    private static final VoxelShape shapeSouth = createCuboidShape(3.0, 3.0, 0.0, 13.0, 13.0, 12.0);
    private static final VoxelShape shapeEast = createCuboidShape(0.0, 3.0, 3.0, 12.0, 13.0, 13.0);
    private static final VoxelShape shapeWest = createCuboidShape(4.0, 3.0, 3.0, 16.0, 13.0, 13.0);

    @Override
    public void onEntityCollision(BlockState blockState, World world, BlockPos blockPos, Entity entity) {
        if (entity.getType() == EntityType.PLAYER || entity.getType().getSpawnGroup() != SpawnGroup.MISC) entity.damage(
                DamageSource.CACTUS, 2.0F
        );

        super.onEntityCollision(blockState, world, blockPos, entity);
    }

    @Override
    public void onLandedUpon(World world, BlockState blockState, BlockPos blockPos, Entity entity, float distance) {
        entity.handleFallDamage(distance, 5.0F, DamageSource.CACTUS);
        super.onLandedUpon(world, blockState, blockPos, entity, distance);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext shapeContext) {
        return switch (blockState.get(FacingBlock.FACING)) {
            case UP -> SpikesBlock.shapeUp;
            case DOWN -> SpikesBlock.shapeDown;
            case NORTH -> SpikesBlock.shapeNorth;
            case SOUTH -> SpikesBlock.shapeSouth;
            case WEST -> SpikesBlock.shapeWest;
            case EAST -> SpikesBlock.shapeEast;
        };
    }

    @Override
    public VoxelShape getCollisionShape(BlockState blockState, BlockView blockView, BlockPos blockPos, ShapeContext shapeContext) {
        if (collidable) {
            return blockState.getOutlineShape(blockView, blockPos, shapeContext);
        } else {
            return VoxelShapes.empty();
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext itemPlacementContext) {
        Direction direction = itemPlacementContext.getSide();
        BlockState blockState = itemPlacementContext.getWorld().getBlockState(itemPlacementContext.getBlockPos().offset(direction.getOpposite()));

        if (blockState.getBlock() == this && blockState.get(FacingBlock.FACING) == direction) {
            return this.getDefaultState().with(FacingBlock.FACING, direction.getOpposite());
        }
        else {
            return this.getDefaultState().with(FacingBlock.FACING, direction);
        }
    }

    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(FacingBlock.FACING);
    }
}
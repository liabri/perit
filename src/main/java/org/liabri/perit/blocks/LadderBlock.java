package net.fabricmc.example.blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

//climbable from both sides
//cannot support itself if its not connected to a solid block either at the top or on the ground

public class LadderBlock extends Block implements Waterloggable {
    public static final DirectionProperty FACING;
    public static final BooleanProperty WATERLOGGED;
    protected static final VoxelShape EAST_SHAPE;
    protected static final VoxelShape WEST_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape NORTH_SHAPE;
    public static final BooleanProperty BOTTOM;

    public LadderBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false).with(BOTTOM, false));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
            default -> EAST_SHAPE;
        };
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return true;
//        BlockState down = world.getBlockState(pos.down());
//        if (down.isSideSolidFullSquare(world,pos.up(),Direction.UP)){
//            return true;
//        }
//        Direction laddir = null;
//        if (state.isSideSolidFullSquare(world, pos, Direction.EAST))
//            laddir=Direction.EAST;
//        if (state.isSideSolidFullSquare(world, pos, Direction.SOUTH))
//            laddir=Direction.SOUTH;
//        if (state.isSideSolidFullSquare(world, pos, Direction.WEST))
//            laddir=Direction.WEST;
//        if (state.isSideSolidFullSquare(world, pos, Direction.NORTH))
//            laddir=Direction.NORTH;
//        if (laddir !=null) {
//
//            return world.getBlockState(pos.down()).isSideSolidFullSquare(world, pos.down(), laddir);
//
////            else if(world.getBlockState(pos.offset(laddir)).isOf(Blocks.LADDER)){
////                return false;
////            }
//        }
//
//        return false;
    }

//    @Override
//    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
//        if (!world.isClient) {
//            world.getBlockTickScheduler().schedule(pos, this, 1);
//        }
//    }
//
//    @Override
//    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
//        if (direction.getOpposite() == state.get(FACING) && !state.canPlaceAt(world, pos)) {
//            return Blocks.AIR.getDefaultState();
//        } else {
//            if (state.get(WATERLOGGED)) {
//                world.getFluidTickScheduler().schedule(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
//            }
//
//            if (!world.isClient()) {
//                world.getBlockTickScheduler().schedule(pos, this, 1);
//            }
//
//            return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
//        }
//    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState2;
        if (!ctx.canReplaceExisting()) {
            blockState2 = ctx.getWorld().getBlockState(ctx.getBlockPos().offset(ctx.getSide().getOpposite()));
            if (blockState2.isOf(this) && blockState2.get(FACING) == ctx.getSide()) {
                return null;
            }
        }

        blockState2 = this.getDefaultState();
        WorldView worldView = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        Direction[] var6 = ctx.getPlacementDirections();

        for (Direction direction : var6) {
            if (direction.getAxis().isHorizontal()) {
                blockState2 = blockState2.with(FACING, direction.getOpposite());
                if (blockState2.canPlaceAt(worldView, blockPos)) {
                    return blockState2.with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER).with(BOTTOM, this.shouldBeBottom(ctx.getWorld(), blockPos));
                }
            }
        }

        return null;
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockState blockState = state.with(BOTTOM, this.shouldBeBottom(world, pos));
        world.setBlockState(pos, blockState, 3);
    }


    private boolean shouldBeBottom(BlockView world, BlockPos pos) {
        return !world.getBlockState(pos.down()).isOf(this);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, BOTTOM);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    static {
        FACING = HorizontalFacingBlock.FACING;
        WATERLOGGED = Properties.WATERLOGGED;
        BOTTOM = Properties.BOTTOM;
        EAST_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);
        WEST_SHAPE = Block.createCuboidShape(13.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
        SOUTH_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 3.0D);
        NORTH_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 13.0D, 16.0D, 16.0D, 16.0D);
    }
}

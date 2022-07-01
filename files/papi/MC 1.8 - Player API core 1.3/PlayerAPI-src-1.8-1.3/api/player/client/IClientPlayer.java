package api.player.client;

public interface IClientPlayer
{
	ClientPlayerBase getClientPlayerBase(String baseId);

	java.util.Set<String> getClientPlayerBaseIds();

	Object dynamic(String key, Object[] parameters);

	void realAddExhaustion(float paramFloat);

	void superAddExhaustion(float paramFloat);

	void localAddExhaustion(float paramFloat);

	void realAddMovementStat(double paramDouble1, double paramDouble2, double paramDouble3);

	void superAddMovementStat(double paramDouble1, double paramDouble2, double paramDouble3);

	void localAddMovementStat(double paramDouble1, double paramDouble2, double paramDouble3);

	void realAddStat(net.minecraft.stats.StatBase paramStatBase, int paramInt);

	void superAddStat(net.minecraft.stats.StatBase paramStatBase, int paramInt);

	void localAddStat(net.minecraft.stats.StatBase paramStatBase, int paramInt);

	boolean realAttackEntityFrom(net.minecraft.util.DamageSource paramDamageSource, float paramFloat);

	boolean superAttackEntityFrom(net.minecraft.util.DamageSource paramDamageSource, float paramFloat);

	boolean localAttackEntityFrom(net.minecraft.util.DamageSource paramDamageSource, float paramFloat);

	void realAttackTargetEntityWithCurrentItem(net.minecraft.entity.Entity paramEntity);

	void superAttackTargetEntityWithCurrentItem(net.minecraft.entity.Entity paramEntity);

	void localAttackTargetEntityWithCurrentItem(net.minecraft.entity.Entity paramEntity);

	boolean realCanBreatheUnderwater();

	boolean superCanBreatheUnderwater();

	boolean localCanBreatheUnderwater();

	boolean realCanHarvestBlock(net.minecraft.block.Block paramBlock);

	boolean superCanHarvestBlock(net.minecraft.block.Block paramBlock);

	boolean localCanHarvestBlock(net.minecraft.block.Block paramBlock);

	boolean realCanPlayerEdit(net.minecraft.util.BlockPos paramBlockPos, net.minecraft.util.EnumFacing paramEnumFacing, net.minecraft.item.ItemStack paramItemStack);

	boolean superCanPlayerEdit(net.minecraft.util.BlockPos paramBlockPos, net.minecraft.util.EnumFacing paramEnumFacing, net.minecraft.item.ItemStack paramItemStack);

	boolean localCanPlayerEdit(net.minecraft.util.BlockPos paramBlockPos, net.minecraft.util.EnumFacing paramEnumFacing, net.minecraft.item.ItemStack paramItemStack);

	boolean realCanTriggerWalking();

	boolean superCanTriggerWalking();

	boolean localCanTriggerWalking();

	void realCloseScreen();

	void superCloseScreen();

	void localCloseScreen();

	void realDamageEntity(net.minecraft.util.DamageSource paramDamageSource, float paramFloat);

	void superDamageEntity(net.minecraft.util.DamageSource paramDamageSource, float paramFloat);

	void localDamageEntity(net.minecraft.util.DamageSource paramDamageSource, float paramFloat);

	void realDisplayGui(net.minecraft.world.IInteractionObject paramIInteractionObject);

	void superDisplayGui(net.minecraft.world.IInteractionObject paramIInteractionObject);

	void localDisplayGui(net.minecraft.world.IInteractionObject paramIInteractionObject);

	void realDisplayGUIChest(net.minecraft.inventory.IInventory paramIInventory);

	void superDisplayGUIChest(net.minecraft.inventory.IInventory paramIInventory);

	void localDisplayGUIChest(net.minecraft.inventory.IInventory paramIInventory);

	net.minecraft.entity.item.EntityItem realDropItem(net.minecraft.item.ItemStack paramItemStack, boolean paramBoolean1, boolean paramBoolean2);

	net.minecraft.entity.item.EntityItem superDropItem(net.minecraft.item.ItemStack paramItemStack, boolean paramBoolean1, boolean paramBoolean2);

	net.minecraft.entity.item.EntityItem localDropItem(net.minecraft.item.ItemStack paramItemStack, boolean paramBoolean1, boolean paramBoolean2);

	net.minecraft.entity.item.EntityItem realDropOneItem(boolean paramBoolean);

	net.minecraft.entity.item.EntityItem superDropOneItem(boolean paramBoolean);

	net.minecraft.entity.item.EntityItem localDropOneItem(boolean paramBoolean);

	net.minecraft.entity.item.EntityItem realDropPlayerItemWithRandomChoice(net.minecraft.item.ItemStack paramItemStack, boolean paramBoolean);

	net.minecraft.entity.item.EntityItem superDropPlayerItemWithRandomChoice(net.minecraft.item.ItemStack paramItemStack, boolean paramBoolean);

	net.minecraft.entity.item.EntityItem localDropPlayerItemWithRandomChoice(net.minecraft.item.ItemStack paramItemStack, boolean paramBoolean);

	void realFall(float paramFloat1, float paramFloat2);

	void superFall(float paramFloat1, float paramFloat2);

	void localFall(float paramFloat1, float paramFloat2);

	float realGetAIMoveSpeed();

	float superGetAIMoveSpeed();

	float localGetAIMoveSpeed();

	float realGetBedOrientationInDegrees();

	float superGetBedOrientationInDegrees();

	float localGetBedOrientationInDegrees();

	float realGetBrightness(float paramFloat);

	float superGetBrightness(float paramFloat);

	float localGetBrightness(float paramFloat);

	int realGetBrightnessForRender(float paramFloat);

	int superGetBrightnessForRender(float paramFloat);

	int localGetBrightnessForRender(float paramFloat);

	float realGetBreakSpeed(net.minecraft.block.state.IBlockState paramIBlockState, net.minecraft.util.BlockPos paramBlockPos);

	float superGetBreakSpeed(net.minecraft.block.state.IBlockState paramIBlockState, net.minecraft.util.BlockPos paramBlockPos);

	float localGetBreakSpeed(net.minecraft.block.state.IBlockState paramIBlockState, net.minecraft.util.BlockPos paramBlockPos);

	double realGetDistanceSq(double paramDouble1, double paramDouble2, double paramDouble3);

	double superGetDistanceSq(double paramDouble1, double paramDouble2, double paramDouble3);

	double localGetDistanceSq(double paramDouble1, double paramDouble2, double paramDouble3);

	double realGetDistanceSqToEntity(net.minecraft.entity.Entity paramEntity);

	double superGetDistanceSqToEntity(net.minecraft.entity.Entity paramEntity);

	double localGetDistanceSqToEntity(net.minecraft.entity.Entity paramEntity);

	float realGetFovModifier();

	float superGetFovModifier();

	float localGetFovModifier();

	java.lang.String realGetHurtSound();

	java.lang.String superGetHurtSound();

	java.lang.String localGetHurtSound();

	java.lang.String realGetName();

	java.lang.String superGetName();

	java.lang.String localGetName();

	int realGetSleepTimer();

	int superGetSleepTimer();

	int localGetSleepTimer();

	boolean realHandleWaterMovement();

	boolean superHandleWaterMovement();

	boolean localHandleWaterMovement();

	void realHeal(float paramFloat);

	void superHeal(float paramFloat);

	void localHeal(float paramFloat);

	boolean realIsEntityInsideOpaqueBlock();

	boolean superIsEntityInsideOpaqueBlock();

	boolean localIsEntityInsideOpaqueBlock();

	boolean realIsInWater();

	boolean superIsInWater();

	boolean localIsInWater();

	boolean realIsInsideOfMaterial(net.minecraft.block.material.Material paramMaterial);

	boolean superIsInsideOfMaterial(net.minecraft.block.material.Material paramMaterial);

	boolean localIsInsideOfMaterial(net.minecraft.block.material.Material paramMaterial);

	boolean realIsOnLadder();

	boolean superIsOnLadder();

	boolean localIsOnLadder();

	boolean realIsPlayerSleeping();

	boolean superIsPlayerSleeping();

	boolean localIsPlayerSleeping();

	boolean realIsSneaking();

	boolean superIsSneaking();

	boolean localIsSneaking();

	boolean realIsSprinting();

	boolean superIsSprinting();

	boolean localIsSprinting();

	void realJump();

	void superJump();

	void localJump();

	void realKnockBack(net.minecraft.entity.Entity paramEntity, float paramFloat, double paramDouble1, double paramDouble2);

	void superKnockBack(net.minecraft.entity.Entity paramEntity, float paramFloat, double paramDouble1, double paramDouble2);

	void localKnockBack(net.minecraft.entity.Entity paramEntity, float paramFloat, double paramDouble1, double paramDouble2);

	void realMoveEntity(double paramDouble1, double paramDouble2, double paramDouble3);

	void superMoveEntity(double paramDouble1, double paramDouble2, double paramDouble3);

	void localMoveEntity(double paramDouble1, double paramDouble2, double paramDouble3);

	void realMoveEntityWithHeading(float paramFloat1, float paramFloat2);

	void superMoveEntityWithHeading(float paramFloat1, float paramFloat2);

	void localMoveEntityWithHeading(float paramFloat1, float paramFloat2);

	void realMoveFlying(float paramFloat1, float paramFloat2, float paramFloat3);

	void superMoveFlying(float paramFloat1, float paramFloat2, float paramFloat3);

	void localMoveFlying(float paramFloat1, float paramFloat2, float paramFloat3);

	void realOnDeath(net.minecraft.util.DamageSource paramDamageSource);

	void superOnDeath(net.minecraft.util.DamageSource paramDamageSource);

	void localOnDeath(net.minecraft.util.DamageSource paramDamageSource);

	void realOnLivingUpdate();

	void superOnLivingUpdate();

	void localOnLivingUpdate();

	void realOnKillEntity(net.minecraft.entity.EntityLivingBase paramEntityLivingBase);

	void superOnKillEntity(net.minecraft.entity.EntityLivingBase paramEntityLivingBase);

	void localOnKillEntity(net.minecraft.entity.EntityLivingBase paramEntityLivingBase);

	void realOnStruckByLightning(net.minecraft.entity.effect.EntityLightningBolt paramEntityLightningBolt);

	void superOnStruckByLightning(net.minecraft.entity.effect.EntityLightningBolt paramEntityLightningBolt);

	void localOnStruckByLightning(net.minecraft.entity.effect.EntityLightningBolt paramEntityLightningBolt);

	void realOnUpdate();

	void superOnUpdate();

	void localOnUpdate();

	void realPlayStepSound(net.minecraft.util.BlockPos paramBlockPos, net.minecraft.block.Block paramBlock);

	void superPlayStepSound(net.minecraft.util.BlockPos paramBlockPos, net.minecraft.block.Block paramBlock);

	void localPlayStepSound(net.minecraft.util.BlockPos paramBlockPos, net.minecraft.block.Block paramBlock);

	boolean realPushOutOfBlocks(double paramDouble1, double paramDouble2, double paramDouble3);

	boolean superPushOutOfBlocks(double paramDouble1, double paramDouble2, double paramDouble3);

	boolean localPushOutOfBlocks(double paramDouble1, double paramDouble2, double paramDouble3);

	net.minecraft.util.MovingObjectPosition realRayTrace(double paramDouble, float paramFloat);

	net.minecraft.util.MovingObjectPosition superRayTrace(double paramDouble, float paramFloat);

	net.minecraft.util.MovingObjectPosition localRayTrace(double paramDouble, float paramFloat);

	void realReadEntityFromNBT(net.minecraft.nbt.NBTTagCompound paramNBTTagCompound);

	void superReadEntityFromNBT(net.minecraft.nbt.NBTTagCompound paramNBTTagCompound);

	void localReadEntityFromNBT(net.minecraft.nbt.NBTTagCompound paramNBTTagCompound);

	void realRespawnPlayer();

	void superRespawnPlayer();

	void localRespawnPlayer();

	void realSetDead();

	void superSetDead();

	void localSetDead();

	void realSetPlayerSPHealth(float paramFloat);

	void localSetPlayerSPHealth(float paramFloat);

	void realSetPositionAndRotation(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2);

	void superSetPositionAndRotation(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2);

	void localSetPositionAndRotation(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2);

	void realSetSneaking(boolean paramBoolean);

	void superSetSneaking(boolean paramBoolean);

	void localSetSneaking(boolean paramBoolean);

	void realSetSprinting(boolean paramBoolean);

	void superSetSprinting(boolean paramBoolean);

	void localSetSprinting(boolean paramBoolean);

	net.minecraft.entity.player.EntityPlayer.EnumStatus realTrySleep(net.minecraft.util.BlockPos paramBlockPos);

	net.minecraft.entity.player.EntityPlayer.EnumStatus superTrySleep(net.minecraft.util.BlockPos paramBlockPos);

	net.minecraft.entity.player.EntityPlayer.EnumStatus localTrySleep(net.minecraft.util.BlockPos paramBlockPos);

	void realSwingItem();

	void superSwingItem();

	void localSwingItem();

	void realUpdateEntityActionState();

	void superUpdateEntityActionState();

	void localUpdateEntityActionState();

	void realUpdateRidden();

	void superUpdateRidden();

	void localUpdateRidden();

	void realWakeUpPlayer(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);

	void superWakeUpPlayer(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);

	void localWakeUpPlayer(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);

	void realWriteEntityToNBT(net.minecraft.nbt.NBTTagCompound paramNBTTagCompound);

	void superWriteEntityToNBT(net.minecraft.nbt.NBTTagCompound paramNBTTagCompound);

	void localWriteEntityToNBT(net.minecraft.nbt.NBTTagCompound paramNBTTagCompound);

	boolean getAddedToChunkField();

	void setAddedToChunkField(boolean addedToChunk);

	int getArrowHitTimerField();

	void setArrowHitTimerField(int arrowHitTimer);

	float getAttackedAtYawField();

	void setAttackedAtYawField(float attackedAtYaw);

	net.minecraft.entity.player.EntityPlayer getAttackingPlayerField();

	void setAttackingPlayerField(net.minecraft.entity.player.EntityPlayer attackingPlayer);

	float getCameraPitchField();

	void setCameraPitchField(float cameraPitch);

	float getCameraYawField();

	void setCameraYawField(float cameraYaw);

	net.minecraft.entity.player.PlayerCapabilities getCapabilitiesField();

	void setCapabilitiesField(net.minecraft.entity.player.PlayerCapabilities capabilities);

	int getChunkCoordXField();

	void setChunkCoordXField(int chunkCoordX);

	int getChunkCoordYField();

	void setChunkCoordYField(int chunkCoordY);

	int getChunkCoordZField();

	void setChunkCoordZField(int chunkCoordZ);

	java.lang.String getClientBrandField();

	void setClientBrandField(java.lang.String clientBrand);

	net.minecraft.entity.DataWatcher getDataWatcherField();

	void setDataWatcherField(net.minecraft.entity.DataWatcher dataWatcher);

	boolean getDeadField();

	void setDeadField(boolean dead);

	int getDeathTimeField();

	void setDeathTimeField(int deathTime);

	int getDimensionField();

	void setDimensionField(int dimension);

	float getDistanceWalkedModifiedField();

	void setDistanceWalkedModifiedField(float distanceWalkedModified);

	float getDistanceWalkedOnStepModifiedField();

	void setDistanceWalkedOnStepModifiedField(float distanceWalkedOnStepModified);

	int getEntityAgeField();

	void setEntityAgeField(int entityAge);

	float getEntityCollisionReductionField();

	void setEntityCollisionReductionField(float entityCollisionReduction);

	java.util.UUID getEntityUniqueIDField();

	void setEntityUniqueIDField(java.util.UUID entityUniqueID);

	float getExperienceField();

	void setExperienceField(float experience);

	int getExperienceLevelField();

	void setExperienceLevelField(int experienceLevel);

	int getExperienceTotalField();

	void setExperienceTotalField(int experienceTotal);

	float getFallDistanceField();

	void setFallDistanceField(float fallDistance);

	float getOnGroundSpeedFactorField();

	void setOnGroundSpeedFactorField(float onGroundSpeedFactor);

	boolean getHasValidHealthField();

	void setHasValidHealthField(boolean hasValidHealth);

	float getHundredEightyField();

	void setHundredEightyField(float hundredEighty);

	float getPrevMovedDistanceField();

	void setPrevMovedDistanceField(float prevMovedDistance);

	float getMovedDistanceField();

	void setMovedDistanceField(float movedDistance);

	float getPrevOnGroundSpeedFactorField();

	void setPrevOnGroundSpeedFactorField(float prevOnGroundSpeedFactor);

	float getRandomNumberBetweenZeroAndTwelveThousandThreeHundredNinetyEightField();

	void setRandomNumberBetweenZeroAndTwelveThousandThreeHundredNinetyEightField(float randomNumberBetweenZeroAndTwelveThousandThreeHundredNinetyEight);

	float getRandomNumberBetweenOneHundredthAndTwoHundredthField();

	void setRandomNumberBetweenOneHundredthAndTwoHundredthField(float randomNumberBetweenOneHundredthAndTwoHundredth);

	double getChasingPosZField();

	void setChasingPosZField(double chasingPosZ);

	double getPrevChasingPosXField();

	void setPrevChasingPosXField(double prevChasingPosX);

	double getChasingPosXField();

	void setChasingPosXField(double chasingPosX);

	double getChasingPosYField();

	void setChasingPosYField(double chasingPosY);

	double getPrevChasingPosYField();

	void setPrevChasingPosYField(double prevChasingPosY);

	double getPrevChasingPosZField();

	void setPrevChasingPosZField(double prevChasingPosZ);

	int getFireResistanceField();

	void setFireResistanceField(int fireResistance);

	boolean getFirstUpdateField();

	void setFirstUpdateField(boolean firstUpdate);

	net.minecraft.entity.projectile.EntityFishHook getFishEntityField();

	void setFishEntityField(net.minecraft.entity.projectile.EntityFishHook fishEntity);

	int getFlyToggleTimerField();

	void setFlyToggleTimerField(int flyToggleTimer);

	net.minecraft.util.FoodStats getFoodStatsField();

	void setFoodStatsField(net.minecraft.util.FoodStats foodStats);

	boolean getForceSpawnField();

	void setForceSpawnField(boolean forceSpawn);

	float getHeightField();

	void setHeightField(float height);

	float getHorseJumpPowerField();

	void setHorseJumpPowerField(float horseJumpPower);

	int getHorseJumpPowerCounterField();

	void setHorseJumpPowerCounterField(int horseJumpPowerCounter);

	int getHurtResistantTimeField();

	void setHurtResistantTimeField(int hurtResistantTime);

	int getHurtTimeField();

	void setHurtTimeField(int hurtTime);

	boolean getIgnoreFrustumCheckField();

	void setIgnoreFrustumCheckField(boolean ignoreFrustumCheck);

	boolean getInPortalField();

	void setInPortalField(boolean inPortal);

	boolean getInWaterField();

	void setInWaterField(boolean inWater);

	net.minecraft.entity.player.InventoryPlayer getInventoryField();

	void setInventoryField(net.minecraft.entity.player.InventoryPlayer inventory);

	net.minecraft.inventory.Container getInventoryContainerField();

	void setInventoryContainerField(net.minecraft.inventory.Container inventoryContainer);

	boolean getIsAirBorneField();

	void setIsAirBorneField(boolean isAirBorne);

	boolean getIsCollidedField();

	void setIsCollidedField(boolean isCollided);

	boolean getIsCollidedHorizontallyField();

	void setIsCollidedHorizontallyField(boolean isCollidedHorizontally);

	boolean getIsCollidedVerticallyField();

	void setIsCollidedVerticallyField(boolean isCollidedVertically);

	boolean getIsDeadField();

	void setIsDeadField(boolean isDead);

	boolean getIsImmuneToFireField();

	void setIsImmuneToFireField(boolean isImmuneToFire);

	boolean getIsInWebField();

	void setIsInWebField(boolean isInWeb);

	boolean getIsJumpingField();

	void setIsJumpingField(boolean isJumping);

	boolean getIsSwingInProgressField();

	void setIsSwingInProgressField(boolean isSwingInProgress);

	float getJumpMovementFactorField();

	void setJumpMovementFactorField(float jumpMovementFactor);

	float getLastDamageField();

	void setLastDamageField(float lastDamage);

	float getLastReportedPitchField();

	void setLastReportedPitchField(float lastReportedPitch);

	double getLastReportedPosXField();

	void setLastReportedPosXField(double lastReportedPosX);

	double getLastReportedPosYField();

	void setLastReportedPosYField(double lastReportedPosY);

	double getLastReportedPosZField();

	void setLastReportedPosZField(double lastReportedPosZ);

	float getLastReportedYawField();

	void setLastReportedYawField(float lastReportedYaw);

	double getLastTickPosXField();

	void setLastTickPosXField(double lastTickPosX);

	double getLastTickPosYField();

	void setLastTickPosYField(double lastTickPosY);

	double getLastTickPosZField();

	void setLastTickPosZField(double lastTickPosZ);

	float getLimbSwingField();

	void setLimbSwingField(float limbSwing);

	float getLimbSwingAmountField();

	void setLimbSwingAmountField(float limbSwingAmount);

	int getMaxHurtResistantTimeField();

	void setMaxHurtResistantTimeField(int maxHurtResistantTime);

	int getMaxHurtTimeField();

	void setMaxHurtTimeField(int maxHurtTime);

	net.minecraft.client.Minecraft getMcField();

	void setMcField(net.minecraft.client.Minecraft mc);

	double getMotionXField();

	void setMotionXField(double motionX);

	double getMotionYField();

	void setMotionYField(double motionY);

	double getMotionZField();

	void setMotionZField(double motionZ);

	float getMoveForwardField();

	void setMoveForwardField(float moveForward);

	float getMoveStrafingField();

	void setMoveStrafingField(float moveStrafing);

	net.minecraft.util.MovementInput getMovementInputField();

	void setMovementInputField(net.minecraft.util.MovementInput movementInput);

	int getNewPosRotationIncrementsField();

	void setNewPosRotationIncrementsField(int newPosRotationIncrements);

	double getNewPosXField();

	void setNewPosXField(double newPosX);

	double getNewPosYField();

	void setNewPosYField(double newPosY);

	double getNewPosZField();

	void setNewPosZField(double newPosZ);

	double getNewRotationPitchField();

	void setNewRotationPitchField(double newRotationPitch);

	double getNewRotationYawField();

	void setNewRotationYawField(double newRotationYaw);

	boolean getNoClipField();

	void setNoClipField(boolean noClip);

	boolean getOnGroundField();

	void setOnGroundField(boolean onGround);

	net.minecraft.inventory.Container getOpenContainerField();

	void setOpenContainerField(net.minecraft.inventory.Container openContainer);

	net.minecraft.util.BlockPos getPlayerLocationField();

	void setPlayerLocationField(net.minecraft.util.BlockPos playerLocation);

	int getPortalCounterField();

	void setPortalCounterField(int portalCounter);

	double getPosXField();

	void setPosXField(double posX);

	double getPosYField();

	void setPosYField(double posY);

	double getPosZField();

	void setPosZField(double posZ);

	int getPositionUpdateTicksField();

	void setPositionUpdateTicksField(int positionUpdateTicks);

	float getPrevCameraPitchField();

	void setPrevCameraPitchField(float prevCameraPitch);

	float getPrevCameraYawField();

	void setPrevCameraYawField(float prevCameraYaw);

	float getPrevDistanceWalkedModifiedField();

	void setPrevDistanceWalkedModifiedField(float prevDistanceWalkedModified);

	float getPrevLimbSwingAmountField();

	void setPrevLimbSwingAmountField(float prevLimbSwingAmount);

	double getPrevPosXField();

	void setPrevPosXField(double prevPosX);

	double getPrevPosYField();

	void setPrevPosYField(double prevPosY);

	double getPrevPosZField();

	void setPrevPosZField(double prevPosZ);

	float getPrevRenderArmPitchField();

	void setPrevRenderArmPitchField(float prevRenderArmPitch);

	float getPrevRenderArmYawField();

	void setPrevRenderArmYawField(float prevRenderArmYaw);

	float getPrevRenderYawOffsetField();

	void setPrevRenderYawOffsetField(float prevRenderYawOffset);

	float getPrevRotationPitchField();

	void setPrevRotationPitchField(float prevRotationPitch);

	float getPrevRotationYawField();

	void setPrevRotationYawField(float prevRotationYaw);

	float getPrevRotationYawHeadField();

	void setPrevRotationYawHeadField(float prevRotationYawHead);

	float getPrevSwingProgressField();

	void setPrevSwingProgressField(float prevSwingProgress);

	float getPrevTimeInPortalField();

	void setPrevTimeInPortalField(float prevTimeInPortal);

	boolean getPreventEntitySpawningField();

	void setPreventEntitySpawningField(boolean preventEntitySpawning);

	java.util.Random getRandField();

	void setRandField(java.util.Random rand);

	float getRandomYawVelocityField();

	void setRandomYawVelocityField(float randomYawVelocity);

	int getRecentlyHitField();

	void setRecentlyHitField(int recentlyHit);

	float getRenderArmPitchField();

	void setRenderArmPitchField(float renderArmPitch);

	float getRenderArmYawField();

	void setRenderArmYawField(float renderArmYaw);

	double getRenderDistanceWeightField();

	void setRenderDistanceWeightField(double renderDistanceWeight);

	float getRenderOffsetXField();

	void setRenderOffsetXField(float renderOffsetX);

	float getRenderOffsetYField();

	void setRenderOffsetYField(float renderOffsetY);

	float getRenderOffsetZField();

	void setRenderOffsetZField(float renderOffsetZ);

	float getRenderYawOffsetField();

	void setRenderYawOffsetField(float renderYawOffset);

	net.minecraft.entity.Entity getRiddenByEntityField();

	void setRiddenByEntityField(net.minecraft.entity.Entity riddenByEntity);

	net.minecraft.entity.Entity getRidingEntityField();

	void setRidingEntityField(net.minecraft.entity.Entity ridingEntity);

	float getRotationPitchField();

	void setRotationPitchField(float rotationPitch);

	float getRotationYawField();

	void setRotationYawField(float rotationYaw);

	float getRotationYawHeadField();

	void setRotationYawHeadField(float rotationYawHead);

	int getScoreValueField();

	void setScoreValueField(int scoreValue);

	net.minecraft.client.network.NetHandlerPlayClient getSendQueueField();

	int getServerPosXField();

	void setServerPosXField(int serverPosX);

	int getServerPosYField();

	void setServerPosYField(int serverPosY);

	int getServerPosZField();

	void setServerPosZField(int serverPosZ);

	boolean getServerSneakStateField();

	void setServerSneakStateField(boolean serverSneakState);

	boolean getServerSprintStateField();

	void setServerSprintStateField(boolean serverSprintState);

	boolean getSleepingField();

	void setSleepingField(boolean sleeping);

	float getSpeedInAirField();

	void setSpeedInAirField(float speedInAir);

	float getSpeedOnGroundField();

	void setSpeedOnGroundField(float speedOnGround);

	int getSprintToggleTimerField();

	void setSprintToggleTimerField(int sprintToggleTimer);

	int getSprintingTicksLeftField();

	void setSprintingTicksLeftField(int sprintingTicksLeft);

	net.minecraft.stats.StatFileWriter getStatWriterField();

	float getStepHeightField();

	void setStepHeightField(float stepHeight);

	float getSwingProgressField();

	void setSwingProgressField(float swingProgress);

	int getSwingProgressIntField();

	void setSwingProgressIntField(int swingProgressInt);

	int getTeleportDirectionField();

	void setTeleportDirectionField(int teleportDirection);

	int getTicksExistedField();

	void setTicksExistedField(int ticksExisted);

	float getTimeInPortalField();

	void setTimeInPortalField(float timeInPortal);

	int getTimeUntilPortalField();

	void setTimeUntilPortalField(int timeUntilPortal);

	boolean getVelocityChangedField();

	void setVelocityChangedField(boolean velocityChanged);

	float getWidthField();

	void setWidthField(float width);

	net.minecraft.world.World getWorldObjField();

	void setWorldObjField(net.minecraft.world.World worldObj);

	int getXpCooldownField();

	void setXpCooldownField(int xpCooldown);

}

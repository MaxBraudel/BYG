package corgiaoc.byg.core;

import corgiaoc.byg.BYG;
import corgiaoc.byg.common.entity.boat.BYGBoatEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("deprecation")
public class BYGEntities {
    public static final EntityType<BYGBoatEntity> BOAT = createEntity("boat", EntityType.Builder.<BYGBoatEntity>create(BYGBoatEntity::new, EntityClassification.MISC).size(1.375F, 0.5625F).build(BYG.MOD_ID + ":boat"));

    public static <E extends Entity, ET extends EntityType<E>> ET createEntity(String id, ET entityType) {
        Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(BYG.MOD_ID, id), entityType);
        return entityType;
    }

    public static void init() {
    }
}

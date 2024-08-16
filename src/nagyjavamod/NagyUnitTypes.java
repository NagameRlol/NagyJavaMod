package nagyjavamod;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

public class NagyUnitTypes {
    public static UnitType
    trooper, sergeant, //serpulo assault hovertanks
    whosdeez, //serpulo support hovertanks
    inflamation, forestfire, //red flying
    warning //red mech
    ; 

    public static void load(){
        trooper = new UnitType("trooper"){{
            constructor = ElevationMoveUnit::create;
            hovering = true;
            lowAltitude = true;
            speed = 1.75f;
            accel = 0.09f;
            outlines = false;
            drag = 0.07f;
            hitSize = 8;
            engineSize = 2.5f;
            engineOffset = 5f;
            health = 400;
            flying = false;
            itemCapacity = 0;
            useEngineElevation = false;
            
            parts.add(
                new HoverPart(){{
                    x = 4f;
                    y = -3f;
                    mirror = true;
                    radius = 5f;
                    phase = 90f;
                    stroke = 2f;
                    layerOffset = -0.001f;
                    color = Color.valueOf("ffa566");
                }},
                new HoverPart(){{
                    x = 3f;
                    y = 1f;
                    mirror = true;
                    radius = 5f;
                    phase = 90f;
                    stroke = 2f;
                    layerOffset = -0.001f;
                    color = Color.valueOf("ffa566");
                }}
            );
    
            weapons.add(
                new Weapon(""){{
                reload = 15f;
                x = 0f;
                y = 3f;
                top = false;
                inaccuracy = 0;
                bullet = new RicochetBulletType(5f, 20f, "bullet"){{
                    width = 9f;
                    height = 12f;
                    lifetime = 60f;
                    }};
                }}
            );
        }};
        
        sergeant = new UnitType("sergeant"){{
            constructor = ElevationMoveUnit::create;
            hovering = true;
            lowAltitude = true;
            speed = 1.5f;
            accel = 0.09f;
            drag = 0.07f;
            hitSize = 11;
            engineSize = 3f;
            outlines = false;
            engineOffset = 4f;
            health = 700;
            flying = false;
            itemCapacity = 0;
            useEngineElevation = false;

            parts.add(
                new HoverPart(){{
                    x = 5f;
                    y = -5f;
                    mirror = true;
                    radius = 6f;
                    phase = 90f;
                    stroke = 2f;
                    layerOffset = -0.001f;
                    color = Color.valueOf("ffa566");
                }},
                new HoverPart(){{
                    x = 5f;
                    y = 5f;
                    mirror = true;
                    radius = 6f;
                    phase = 90f;
                    stroke = 2f;
                    layerOffset = -0.001f;
                    color = Color.valueOf("ffa566");
                }}
            );
            
            weapons.add(
                new Weapon("nagyjavamod-sergeant-weapon"){{
                reload = 10f;
                alternate = true;
                x = 3f;
                y = 5f;
                top = true;
                outlines = false;
                rotate = true;
                rotationLimit = 40;
                inaccuracy = 0;
                bullet = new RicochetBulletType(4f, 15f, "bullet"){{
                    width = 9f;
                    height = 12f;
                    lifetime = 70f;
                    fragBullets = 6;
                    }};
                }}
            );
        }};

        whosdeez = new UnitType("whosdeez"){{
            constructor = ElevationMoveUnit::create;
            hovering = true;
            lowAltitude = true;
            defaultCommand = UnitCommand.repairCommand;
            rotateSpeed = 3f;
            speed = 2f;
            accel = 0.05f;
            drag = 0.05f;
            outlines = false;
            hitSize = 20;
            engineSize = 5f;
            engineOffset = 15f;
            health = 4000;
            armor = 10;
            flying = false;
            itemCapacity = 60;
            useEngineElevation = false;
            faceTarget = false;
            isEnemy = false;
            
            parts.add(
                new HoverPart(){{
                    x = 4f;
                    y = 13f;
                    mirror = true;
                    radius = 7f;
                    phase = 90f;
                    stroke = 2f;
                    layerOffset = -0.001f;
                    color = Color.valueOf("84f491");
                }},
                new HoverPart(){{
                    x = 13f;
                    y = 1f;
                    mirror = true;
                    radius = 7f;
                    phase = 90f;
                    stroke = 2f;
                    layerOffset = -0.001f;
                    color = Color.valueOf("84f491");
                }},
                new HoverPart(){{
                    x = 14f;
                    y = -6f;
                    mirror = true;
                    radius = 7f;
                    phase = 90f;
                    stroke = 2f;
                    layerOffset = -0.001f;
                    color = Color.valueOf("84f491");
                }}
            );
            
            weapons.add(
                new Weapon("nagyjavamod-heal-weapon-small"){{
                    shootSound = Sounds.lasershoot;
                    reload = 24f;
                    x = 10f;
                    top = true;
                    y = 0f;
                    rotate = true;
                    bullet = new LaserBoltBulletType(5.2f, 10){{
                        lifetime = 35f;
                        healPercent = 5.5f;
                        collidesTeam = true;
                        backColor = Pal.heal;
                        frontColor = Color.white;
                    }};
                }},

                new Weapon("nagyjavamod-heal-weapon-small"){{
                    shootSound = Sounds.lasershoot;
                    reload = 24f;
                    x = 8f;
                    top = true;
                    y = 7f;
                    rotate = true;
                    bullet = new LaserBoltBulletType(5.2f, 10){{
                        lifetime = 35f;
                        healPercent = 5.5f;
                        collidesTeam = true;
                        backColor = Pal.heal;
                        frontColor = Color.white;
                    }};
                }},
                new Weapon("nagyjavamod-heal-weapon-small"){{
                    shootSound = Sounds.lasershoot;
                    reload = 24f;
                    x = 8f;
                    y = -7f;
                    top = true;
                    rotate = true;
                    bullet = new LaserBoltBulletType(5.2f, 10){{
                        lifetime = 35f;
                        healPercent = 5.5f;
                        collidesTeam = true;
                        backColor = Pal.heal;
                        frontColor = Color.white;
                    }};
                }}
            );

            setEnginesMirror(
            new UnitEngine(9f, -13f, 3f, -60)
            );
            
        }};
        
        inflamation = new UnitType("inflamation"){{
            constructor = UnitEntity::create;
            speed = 6f;
            rotateSpeed = 10f;
            accel = 0.05f;
            drag = 0.1f;
            engineSize = 3f;
            outlines = false;
            engineOffset = 6f;
            health = 300;
            armor = 3f;
            flying = true;
            trailLength = 4;
            circleTarget = true;
            
            weapons.add(
                new Weapon(""){{
                reload = 10f;
                x = 0f;
                y = 3f;
                top = false;
                inaccuracy = 0;
                shootSound = Sounds.bolt;
                bullet = new BasicBulletType(6f, 20f, "laser"){{
                    width = 1f;
                    height = 20;
                    lifetime = 40f;
                    frontColor = NagyPal.redLaser;
                    trailColor = NagyPal.redLaser;
                    trailLength = 3;
                    trailWidth = 1;
                    pierce = true;   
                    }};
                }}
            );
        }};

        forestfire = new UnitType("forestfire"){{
            constructor = UnitEntity::create;
            speed = 5f;
            accel = 0.05f;
            drag = 0.1f;
            engineSize = 1f;
            engineOffset = 0f;
            outlines = false;
            health = 600;
            armor = 6f;
            flying = true;
            circleTarget = true;

            setEnginesMirror(
            new UnitEngine(-4f, -7f, 2f, -90f)
            );
            
            weapons.add(
                new Weapon(""){{
                reload = 8;
                x = 6f;
                y = 0f;
                top = false;
                alternate = true;
                inaccuracy = 0;
                shootSound = Sounds.bolt;
                bullet = new BasicBulletType(6f, 20f, "laser"){{
                    width = 1f;
                    height = 20;
                    lifetime = 40f;
                    frontColor = NagyPal.redLaser;
                    trailColor = NagyPal.redLaser;
                    trailLength = 3;
                    trailWidth = 1;
                    pierce = true;   
                    }};
                }}
            );
        }};

        warning = new UnitType("warning"){{
            constructor = UnitEntity::create;
            flying = false;
            speed = 0.6f;
            hitSize = 8f;
            health = 400;
            outlines = false;
            armor = 5f;
            weapons.add(new Weapon("nagyjavamod-warning-gun"){{
                reload = 17f;
                x = 5f;
                layerOffset = -0.001f;
                y = 0f;
                top = false;
                ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(3f, 15){{
                    width = 8f;
                    height = 12f;
                    frontColor = NagyPal.redLaser;
                    trailColor = NagyPal.redLaser;
                    lifetime = 50f;
                }};
            }});
        }};
        
    }
}

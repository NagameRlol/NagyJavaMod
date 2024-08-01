package nagyjavamod;

public class NagyUnitTypes {
    public static UnitType trooper;

    public static void load(){
        trooper = new NagyUnitType("trooper"){{
            speed = 0.7f;
            hitSize = 10f;
            health = 400;
            weapons.add(new Weapon(""){{
                reload = 5f;
                x = 0f;
                y = 5f;
                top = false;
                inacuraccy = 3
                ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(5f, 10){{
                    width = 9f;
                    height = 12f;
                    lifetime = 60f;
                }};
            }});
        }};
    }
}

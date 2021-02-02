import java.util.Random;

public enum EnemyType {

    Slime(5.0, 2.0, 1), Skeleton(7.5, 3.0, 1), Zombie(10.0, 4.0, 1);
    AttributeStats gatherStat = new AttributeStats();
    final static Random chosenEn = new Random();
    public double baseHP;
    public final double baseStr;
    public final int  baseLVL;
     EnemyType(double baseHP, double baseStr, int baseLVL){




        this.baseHP = gatherStat.enhp * gatherStat.endef;
        this.baseStr = gatherStat.enlvl++; // gatherStat.enspd;
        this.baseLVL = (int) gatherStat.mydef / gatherStat.mylvl;
        gatherStat.endmg = baseStr * baseLVL / gatherStat.mydef;


    }
}

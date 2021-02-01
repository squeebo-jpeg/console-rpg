public class AttributeStats {
    int mylvl = 1;
    double mystr = 2.0;
    double mydef = 2.0;
    double myspd = 2.0;
    double myexp = 0.0;
    double explvlup = mylvl * mystr;
    int lvlup = mylvl + 1;

    double enstr = 1.0;
    double endef = 1.5;
    double enspd = 2.0;
    int enlvl = 2;


    double gainEXP = enlvl * enstr / mylvl;
    double mydmg = mystr + myspd / endef;
}


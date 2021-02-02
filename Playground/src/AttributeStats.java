public class AttributeStats {

//Player Attributes
     int mylvl = 1;
     double mystr = 2.0;
     double mydef = 2.0;
     double myspd = 2.0;
     double myhp = 10 + mydef / mystr;


//Enemy Attributes

    double enstr = 2.0;
    double endef = 2.0;
    double enspd = 2.0;
    int enlvl = 1;
    double enhp = 10 + endef;
    double endmg = enlvl * enstr / mydef;







//Player EXP + Health
    double gainEXP = enlvl * enstr / mylvl;
    double mydmg = mystr + myspd / endef;
    double myexp = 0.0;
    double exptonext = mylvl * mystr;
    int lvlup = mylvl + 1;




}


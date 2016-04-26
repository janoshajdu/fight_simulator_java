package github;

/**
 * @author Hajdu Jani
 */
 
abstract class DamageDealer {
    final String name;
    int minDam;
    int maxDam;
    double critChance;
    
    public DamageDealer(String n){
        name = n;
    }
    
    abstract int damage();
    
    String getName(){
        return name;
    }
    
    int getMinDam(){
        return minDam;
    }
    
    int getMaxDam(){
        return maxDam;
    }
    
    double getCritChance(){
        return critChance;
    }
}

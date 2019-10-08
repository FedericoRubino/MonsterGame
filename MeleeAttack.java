public class MeleeAttack implements Attack {

    Monster attacker;

    public MeleeAttack(Monster monster){
        this.attacker = monster;
    }

    public Integer attack(Monster target){
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return null;
    }

}

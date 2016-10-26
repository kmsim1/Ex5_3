
public abstract class Robot {
	private String name;
	private MoveStrategy movestrategy;
	private AttackStrategy attackstrategy;
	
	public Robot(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void attack() {
		attackstrategy.attack();
	}
	public void move() {
		movestrategy.move();
	}
	
	public void setMoveStrategy(MoveStrategy movestrategy) {
		this.movestrategy = movestrategy;
	}
	
	public void setAttackStrategy(AttackStrategy attackstrategy) {
		this.attackstrategy = attackstrategy;
	}
}

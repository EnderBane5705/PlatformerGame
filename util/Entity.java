package util.Entity;

public class Entity {
	
	Vec pos;
	Vec size;
	Vec v;
	
	public Entity(position, size, velocity) {
		pos = position;
		this.size = size;
		v = velocity;
	}
	
	public void update(float time) {
		
	}
	
	public void draw(Graphics g, int scale) {
		
	}
	
	static boolean overlap(Entity actor1, Entity actor2) {
        return actor1.pos.x + actor1.size.x > actor2.pos.x &&
            actor1.pos.x < actor2.pos.x + actor2.size.x &&
            actor1.pos.y + actor1.size.y > actor2.pos.y &&
            actor1.pos.y < actor2.pos.y + actor2.size.y;
    }
	
	boolean overlapsWith(Entity other) {
		return Entity.overlap(this, other);
	}
}
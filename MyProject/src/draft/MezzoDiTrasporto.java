package draft;

public interface MezzoDiTrasporto {
	
	public int getVelocita();
	public void accellera(int velocita);
	public void rallenta(int velocita);
	public void fermati(int velocita);
}

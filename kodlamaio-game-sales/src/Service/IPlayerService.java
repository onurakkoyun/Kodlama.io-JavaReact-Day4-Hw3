package Service;

import Entities.Player;

public interface IPlayerService {
	
	void add(Player player);
	void update(Player player, double loadBalance);
	void delete(Player player);

}

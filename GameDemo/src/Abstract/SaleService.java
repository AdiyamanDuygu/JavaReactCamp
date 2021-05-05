package Abstract;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;
import Entities.Sale;

public interface SaleService {
	void add(Sale sale, Member member, Game game, Campaign campaign);
}

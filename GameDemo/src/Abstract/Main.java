package Abstract;

import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.MemberManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;
import Entities.Sale;

public class Main {

	public static void main(String[] args) {
		
		Member member1 = new Member(1, "Duygu", "Adýyaman", LocalDate.of(1990, 1, 1), "125789654125", "duygu@x.com", "123456");
		MemberManager memberManager = new MemberManager(new MernisServiceAdapter());
		memberManager.add(member1);
		memberManager.update(member1);
		memberManager.delete(member1);
		
		Campaign campaign1 = new Campaign(1, 1, 20.00);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		campaignManager.delete(campaign1);
		
		Game game1 = new Game(1, "Dota", 2000.00);
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.update(game1);
		gameManager.delete(game1);
		
		Sale sale1 = new Sale(1, 1, 1, 1, LocalDate.of(1993, 8, 9));
		SaleManager saleManager = new SaleManager();
		saleManager.add(sale1, member1, game1, campaign1);
	}
}


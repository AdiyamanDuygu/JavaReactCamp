package Concrete;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;
import Entities.Sale;

public class SaleManager implements SaleService {


	@Override
	public void add(Sale sale, Member member, Game game, Campaign campaign) {
		
		
		System.out.println(member.getFirstName() + " " + member.getLastName() + " isimli oyuncu " + 
				game.getName() + " oyununu " + game.getPrice() + " TL fiyatýndan %" + 
				campaign.getDiscountPercent() + " indirim ile " + 
				(game.getPrice() - (game.getPrice() * campaign.getDiscountPercent() / 100)) + " TL fiyatý ile satýn aldý");
			
		
	}
	
	

}

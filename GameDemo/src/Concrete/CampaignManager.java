package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getGameId() + " kimlikli oyuna %" + campaign.getDiscountPercent() + " oranýnda kampanya eklendi");
		 
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getGameId() + " kimlikli oyununun kampanyasý sona erdi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getGameId() + " kimlikli oyununun kampanyasý güncellendi");
		
	}

}

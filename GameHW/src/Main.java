
public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Esra", "Sayil", 1998, "12345678910");
		User user2 = new User(2, "Ebru", "Sayil", 2001, "10987654321");
		
		Game game1 = new Game(1, "League of Legends", 20);
		Game game2 = new Game(2, "Valorant", 30);
		
		Campaign campaign1 = new Campaign(1, "New year campaign", 10);
		Campaign campaign2 = new Campaign(2, "Autumn Campaign", 15);
		

		UserManager userManager = new UserManager();
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		SaleManager saleManager = new SaleManager();
		
		userManager.add(user1);
		userManager.add(user2);
		
		
		gameManager.add(game1);
		gameManager.add(game2);
		
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.remove(campaign1);
		campaignManager.update(campaign2);
		

		saleManager.sell(user1, game1);
		saleManager.sell(user2, game2, campaign2);
		
		

	}

}

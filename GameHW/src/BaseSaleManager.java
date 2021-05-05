
public abstract class BaseSaleManager implements ISaleManagerService {
	
	
	@Override
	public void sell(User user, Game game) {
		System.out.println(user.getFirstName() + " named user, bought the game named " + game.getName() + " for " + game.getPrice() + " dollars.");
		
	}

	
	@Override
	public void sell(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " named user, bought the game named " + game.getName() + " for " + game.getPriceAfterDiscount(campaign) + " dollars instead of " + game.getPrice() + " dollars.");
		
	}
	

}

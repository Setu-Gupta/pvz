package Game.backend.User;

public abstract class CurrentUser
{
	protected static User user;

	public static void setUser(User u)
	{
		user = u;
	}
}

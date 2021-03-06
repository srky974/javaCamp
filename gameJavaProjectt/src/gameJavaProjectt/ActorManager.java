package gameJavaProjectt;

public class ActorManager implements ActorService{
	ActorCheckService actorCheckService;

	public ActorManager(ActorCheckService actorCheckService) {
		super();
		this.actorCheckService = actorCheckService;
	}

	public void add(Actor actor) {
		if (actorCheckService.CheckIfRealPerson(actor)) {
			add(actor);
		}
		else {
			System.out.println("Kullanıcı bilgileri eksik ya da hatalıdır!");
		}
		
	}

	public void delete(Actor actor) {
		System.out.println("Kullanıcı silindi");
		
	}

	public void update(Actor actor) {
		System.out.println("Kullanıcı güncellendi");
		
	}

}

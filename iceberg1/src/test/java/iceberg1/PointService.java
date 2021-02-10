package iceberg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PointService {

	public static String pointChecker(String name, Kid kid, Boolean job ) {
		
		List<User> users = getKids();
		
		Double points = (double) 0;
		
		
		if(null != users.get(0).getKid().getDisable() || users.get(0).getKid().getDisable())points+=2;
		if(null != users.get(0).getKid().getSublin() || users.get(0).getKid().getSublin())points++;
		if(null != users.get(0).getKid().getSublin() || users.get(0).getKid().getTwins())points++;
		if(null != users.get(0).getKid().getSublin() || users.get(0).getJob())points++;
		
		
		System.out.println(users+ " " + points);
		
		return "Целият списък с точки";
	}
	
	
	private static List<User> getKids(){
		User user = new User();
		user.setFirstname("Ivan");
		user.setLastname("Ivanov");
		
		Kid kid = new Kid();
		kid.setAge("5");
		kid.setDisable(false);
		kid.setName("Vazon");
		kid.setSublin(true);
		kid.setTwins(false);
		
		user.setJob(true);
		user.setKid(kid);
		final List<User> result = new ArrayList<>();
		
		result.add(user);
		
		return result;
	}
	/*
	  
   Scenario: Проверка на точките на съществуващо дете
    Given Админът отваря екрана за преглед на точките 
    And Въвежда име за търсене на детето "<name>"
    And Натиска бутона за търсене
    Then Вижда резултата "Специфично дете" 
	 */
}

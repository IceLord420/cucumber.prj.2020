package iceberg1;

import java.util.ArrayList;
import java.util.List;

public class KidBioService {

	public static String bio(String name, String age, Boolean disable, Boolean twin, Boolean sublin) {
		
		if(null == name || "".equals(name)) 
		{
			return "Въведи име на детето";
		}
		
		if(null == age || "".equals(age)) 
		{
			return "Въведи години на детето";
		}
		/*
		if(twin || twin != null) 
		{
			return "Въведи дали има близнак";
		}
		 
		if(disable || disable != null) 
		{
			return "Въведи дали има заболявания";
		}
		
		if(sublin || sublin != null) 
		{
			return "Въведи дали има брат/сестра";
		}
		
		
      | Иван  |   5 | false    | 			 | false | Въведи дали има близнак |
      | Иван  |   5 |     		 | false | false | Въведи дали има заболявания |
      | Иван  |   5 | false    | false | 			 | Въведи дали има брат/сестра |
		
		*/
		
		final Kid newKid = new Kid(name, age, disable, twin, sublin);
		List<Kid> kids = getKids();
		
		kids.add(newKid);
		
		return kids.contains(newKid) ? "Успешно въведени данни" : "";
	}
	
	private static List<Kid> getKids(){
		
		final List<Kid> result = new ArrayList<>();
		return result;
	}

}

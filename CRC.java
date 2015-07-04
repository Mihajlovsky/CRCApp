/**
 *Cyclic Redundancy Check 
 * 
 * @author Mihajlovsky
 *
 */

public class CRC {

	public static String Greska;
	public static void main(String[] args) {
	
		String generator="1001";
		String number="101110";
		
		CyclicRedundancyCheck(generator,number);
		
	}
	
	public static String CyclicRedundancyCheck(String generator, String broj)
	{
	int Count=0;
	
	String konecenBroj=broj;
	String ostatok="";
	String novbroj="";
	
	//ostatok= Generator-1 broj na nuli
	for (int i=0;i<generator.length()-1;i++)
	{
		ostatok+="0";
	}
	
	//na brojot se dodava ostatokot
	broj+=ostatok;
	
	//brojot se sporeduva so generatorot samo ako ima poveke cifri
	//ako brojot ima pomalku cifri od generatorot togas e dobiena greskata
	while (broj.length()>=generator.length()){
	for (int i=0;i<generator.length();i++)
	{
		// 1+0 = 1 // dokolku se razlicni cifrite se dodava 1
		if (generator.charAt(i)!=broj.charAt(i))
		{
			novbroj+="1";
		}
		else{
			// 1+1= 0 ; 0+0=0 // ako se isti cifrite se dodava 0
			//ne dodavame nuli na pocetokot
			if (novbroj!=""){
			novbroj+="0";
			}
		}
		Count++;
	}
	//go odeluvame noviot ostatok
	ostatok=broj.substring(Count, broj.length());
	//noviot broj e brojot koj se dobi so sporedbata + ostatokot
	broj=novbroj+ostatok;
	Count=0;
	novbroj="";
	}
	
	ostatok="";
	
	//gledame kolku nuli treba da se dodadat
	//greskata treba da bide vo ist format kako originalniot ostatok ako ima pomalku cifri
	//ako na pocetokot ostatokot e 000 i se dobie greska 10, greskata treba da e 010
	for (int i=0;i<generator.length()-1;i++)
	{
		ostatok+="0";
	}
	
	//go zacuvuvame noviot broj
	novbroj=broj;
	broj="";
	
	//mu dodavame nuli na pocetokot
	for (int i=0;i<ostatok.length()-novbroj.length();i++)
	{
		broj+="0";
	}
	
	//go vrakame brojot po nulite koi se dodadeni
	broj+=novbroj;
	

	System.out.printf("Originalen broj: %s\n",konecenBroj);
	konecenBroj+=broj;
	System.out.printf("Greska: %s\n",broj);
	Greska=broj;
	System.out.printf("Broj+Greska: %s",konecenBroj);
	
		
	return konecenBroj;
	}

}
